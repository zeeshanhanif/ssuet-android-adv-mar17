package jsonexampleone.firebasedemoone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import jsonexampleone.firebasedemoone.models.User;

public class MainActivity extends AppCompatActivity {
    String editId;
    static String uid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        final EditText etName = (EditText) findViewById(R.id.etName);
        Button signUpBtn = (Button)findViewById(R.id.signUpBtn);
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        final DatabaseReference ref = db.getReference("users");

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uid = ref.push().getKey();
                ref.child(uid).setValue(new User(etName.getText().toString()));
                startActivity(new Intent(MainActivity.this,ChatsActivity.class));
            }
        });
    }
}
