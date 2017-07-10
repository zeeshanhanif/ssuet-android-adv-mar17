package com.lifecycle.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Log.e("LifeCycleMethod2","onCreate ActivityTwo");

        TextView myTextView = (TextView) findViewById(R.id.myTextView);
        Intent intent = getIntent();
        myTextView.setText(intent.getStringExtra("myValue")+"\n"+intent.getStringExtra("mySecondValue"));

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("LifeCycleMethod2","onStart ActivityTwo");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("LifeCycleMethod2","onResume ActivityTwo");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("LifeCycleMethod2","onPause ActivityTwo");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("LifeCycleMethod2","onStop ActivityTwo");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("LifeCycleMethod2","onDestroy ActivityTwo");
    }
}
