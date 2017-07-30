package recycler.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Usman",50,"Android"));
        students.add(new Student("Arbaz",40,"Java"));
        students.add(new Student("Talha",30,"PHP"));
        students.add(new Student("Hassan",20,"C#"));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        CustomRecyclerAdapter customRecyclerAdapter = new CustomRecyclerAdapter(students, new MyItemClickListner() {
            @Override
            public void onItemClick(int position, View view) {
                Toast.makeText(MainActivity.this,"Item Clicked : "+position,Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(customRecyclerAdapter);

    }
}
