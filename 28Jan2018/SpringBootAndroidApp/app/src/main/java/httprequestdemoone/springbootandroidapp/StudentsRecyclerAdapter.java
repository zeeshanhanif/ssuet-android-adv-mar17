package httprequestdemoone.springbootandroidapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 1/28/2018.
 */

public class StudentsRecyclerAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    ArrayList<StudentModel> students;

    public StudentsRecyclerAdapter(ArrayList<StudentModel> students) {
        this.students = students;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout,parent,false);
        return new StudentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
        StudentModel student = students.get(position);
        holder.studentNameTv.setText(student.getName());
        holder.studentEmailTv.setText(student.getEmail());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
