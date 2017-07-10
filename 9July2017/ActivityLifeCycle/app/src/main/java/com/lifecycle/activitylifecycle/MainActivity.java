package com.lifecycle.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("LifeCycleMethod","onCreate");
    }

    public void launchSecondActivity(View v){
        EditText editText = (EditText) findViewById(R.id.myTextField);
        String editTextStr = editText.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.myTextField2);
        String editText2Str = editText2.getText().toString();

        Intent intent = new Intent(this,ActivityTwo.class);
        intent.putExtra("myValue",editTextStr);
        intent.putExtra("mySecondValue",editText2Str);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("LifeCycleMethod","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("LifeCycleMethod","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("LifeCycleMethod","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("LifeCycleMethod","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("LifeCycleMethod","onDestroy");
    }
}
