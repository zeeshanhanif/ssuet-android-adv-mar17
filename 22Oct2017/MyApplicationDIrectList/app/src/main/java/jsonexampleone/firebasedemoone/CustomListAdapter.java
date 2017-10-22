package jsonexampleone.firebasedemoone;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 10/22/2017.
 */

public class CustomListAdapter extends ArrayAdapter<Student> {
    ArrayList<Student> students;
    StudentDelListner delListner;
    public CustomListAdapter(@NonNull Context context, ArrayList<Student> students,StudentDelListner studentDelListner) {
        super(context, 0,students);
        this.students = students;
        this.delListner = studentDelListner;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View itemView, @NonNull ViewGroup parent) {
        if(itemView == null){
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.student_item,parent,false);
        }

        TextView tvName = (TextView) itemView.findViewById(R.id.tvName);
        TextView tvEmail = (TextView) itemView.findViewById(R.id.tvEmail);
        TextView tvPhone = (TextView) itemView.findViewById(R.id.tvPhone);
        TextView tvAge = (TextView) itemView.findViewById(R.id.tvAge);
        Button btnDel = (Button) itemView.findViewById(R.id.btnDel);

        final Student student = students.get(position);

        tvName.setText(student.getName());
        tvEmail.setText(student.getEmail());
        tvPhone.setText((student.getPhone() == null ? "NA" : student.getPhone()));
        tvAge.setText(String.valueOf(student.getAge()));

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delListner.onDel(student);
            }
        });

        return itemView;
    }
}
