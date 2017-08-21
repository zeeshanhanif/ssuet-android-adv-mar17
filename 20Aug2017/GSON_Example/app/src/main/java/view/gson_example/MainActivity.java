package view.gson_example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    String studentsJson = "[{'name':'Student One','age':20,'gpa':2.5},{'name':'Student Two','age':30,'gpa':3.5},{'name':'Student Three','age':15,'gpa':1.5}]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTv = (TextView)findViewById(R.id.myTv);

        Student st1 = new Student("Student One",20,2.5f);
        Student st2 = new Student("Student Two",30,3.5f);
        Student st3 = new Student("Student Three",15,1.5f);
        Student[] stus = new Student[3];
        stus[0] = st1;
        stus[1] = st2;
        stus[2] = st3;
        String json = new Gson().toJson(stus);
        myTv.setText(json);
        Log.e("JSON STR",json);
        /*Student[] students = new Gson().fromJson(studentsJson,Student[].class);
        String myFinalStr = "";
        for(int si=0;si<students.length;si++){
            Student stu = students[si];
            myFinalStr += "Name: "+stu.getName()+", Age: "+stu.getAge()+", GPA: "+stu.getGpa()+"\n\n";
        }
        myTv.setText(myFinalStr);*/
    }
}
