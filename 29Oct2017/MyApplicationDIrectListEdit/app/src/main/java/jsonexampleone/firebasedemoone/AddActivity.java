package jsonexampleone.firebasedemoone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class AddActivity extends AppCompatActivity {
    String editId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPhone = (EditText) findViewById(R.id.etPhone);
        final EditText etAge = (EditText) findViewById(R.id.etAge);
        Button addBtn = (Button) findViewById(R.id.addBtn);

        FirebaseDatabase db = FirebaseDatabase.getInstance();
        final DatabaseReference ref = db.getReference("students");

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student st = new Student(etName.getText().toString(),etEmail.getText().toString(),etPhone.getText().toString(),Integer.valueOf(etAge.getText().toString()));
                if(editId == null){
                    String key = ref.push().getKey();
                    st.setKey(key);
                    ref.child(key).setValue(st);
                }else{
                    st.setKey(editId);
                    ref.child(editId).setValue(st);
                    editId = null;
                }
                etName.setText("");
                etEmail.setText("");
                etPhone.setText("");
                etAge.setText("");
            }
        });


        ListView myStudentsList = (ListView) findViewById(R.id.myStudentsList);
        final ArrayList<Student> students = new ArrayList<>();
        final CustomListAdapter adapter = new CustomListAdapter(this, students, new StudentItemListner() {
            @Override
            public void onData(Student student) {
                ref.child(student.getKey()).removeValue();
            }
        }, new StudentItemListner() {
            @Override
            public void onData(Student student) {
                etName.setText(student.getName());
                etEmail.setText(student.getEmail());
                etPhone.setText(student.getPhone());
                etAge.setText(String.valueOf(student.getAge()));
                editId = student.getKey();
            }
        });
        myStudentsList.setAdapter(adapter);

        ref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Student student = dataSnapshot.getValue(Student.class);
                students.add(student);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                Student student = dataSnapshot.getValue(Student.class);
                int index = students.indexOf(student);
                students.set(index,student);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                Student student = dataSnapshot.getValue(Student.class);
                students.remove(student);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
