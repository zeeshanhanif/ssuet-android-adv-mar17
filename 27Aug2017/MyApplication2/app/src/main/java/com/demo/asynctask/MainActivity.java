package com.demo.asynctask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView myTextView = (TextView) findViewById(R.id.myTextView);
        Button myButton = (Button) findViewById(R.id.myButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 0;i<=10000000;i++){
                    myTextView.setText(""+i);
                }
                Toast.makeText(MainActivity.this,"Task Complete!",Toast.LENGTH_SHORT).show();
            }
        });

        final EditText toValue = (EditText) findViewById(R.id.toValue);

        Button myButtonBg = (Button) findViewById(R.id.myButtonBg);
        myButtonBg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask myTask = new MyTask(MainActivity.this,myTextView);
                myTask.execute(Integer.valueOf(toValue.getText().toString()));
            }
        });
    }
}
