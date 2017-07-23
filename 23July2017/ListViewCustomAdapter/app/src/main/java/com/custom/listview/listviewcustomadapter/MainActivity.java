package com.custom.listview.listviewcustomadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        students = new ArrayList<>();
        students.add(new Student("Usman",50,R.drawable.image));
        students.add(new Student("Arbaz",60,R.drawable.image));
        students.add(new Student("Asad",70,R.drawable.image));

        ListView listView = (ListView) findViewById(R.id.customList);
        CustomAdapter customAdapter = new CustomAdapter(this,students);
        listView.setAdapter(customAdapter);

    }
}
