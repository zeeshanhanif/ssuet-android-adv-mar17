package com.custom.listview.listviewcustomadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 7/23/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    private ArrayList<Student> students;
    public CustomAdapter(@NonNull Context context, ArrayList<Student> students) {
        super(context, 0,students);
        this.students = students;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }else{
            view = convertView;
        }
        Student student = students.get(position);

        TextView nameTxt = (TextView) view.findViewById(R.id.name);
        TextView ageTxt = (TextView) view.findViewById(R.id.age);
        Button callButton = (Button) view.findViewById(R.id.callButton);
        ImageView profileImage = (ImageView) view.findViewById(R.id.profileImage);

        nameTxt.setText(student.getName());
        ageTxt.setText(String.valueOf(student.getAge()));
        profileImage.setImageResource(student.getImage());

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Call Button Clicked : "+position,Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
