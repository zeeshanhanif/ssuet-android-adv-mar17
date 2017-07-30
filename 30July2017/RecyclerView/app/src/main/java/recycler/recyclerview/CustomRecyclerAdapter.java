package recycler.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 7/30/2017.
 */

public class CustomRecyclerAdapter extends RecyclerView.Adapter<MyCustomViewHolder> {
    private ArrayList<Student> students;
    private MyItemClickListner listner;
    CustomRecyclerAdapter(ArrayList<Student> students,MyItemClickListner listner){
        this.students = students;
        this.listner = listner;
    }

    @Override
    public MyCustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View myItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_recycler_item,parent,false);
        MyCustomViewHolder customViewHolder = new MyCustomViewHolder(myItemView);
        return customViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyCustomViewHolder holder, final int position) {
        Student student = students.get(position);
        holder.studentName.setText(student.getName());
        holder.studentAge.setText(String.valueOf(student.getAge()));
        holder.studentSubject.setText(student.getSubject());
        holder.imageView.setImageResource(R.drawable.profile_image);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(holder.itemView.getContext(),"Position : "+position,Toast.LENGTH_SHORT).show();
                listner.onItemClick(position,holder.itemView);
            }
        });
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
