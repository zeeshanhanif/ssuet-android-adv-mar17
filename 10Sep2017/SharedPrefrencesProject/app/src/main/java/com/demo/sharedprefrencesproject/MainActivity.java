package com.demo.sharedprefrencesproject;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView counterTv;
    SharedPreferences sharedPreferences;
    final String SHARED_PREF_NAME = "AppData";
    final String SHARED_PREF_COUNTER_KEY = "CounterValue";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,0);
        counterTv = (TextView)findViewById(R.id.counterTv);
        counterTv.setText(sharedPreferences.getString(SHARED_PREF_COUNTER_KEY,"0"));
        Button counterBtn = (Button)findViewById(R.id.counterBtn);

        counterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int counter = Integer.valueOf(counterTv.getText().toString());
                counterTv.setText((counter+1)+"");
            }
        });

    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(SHARED_PREF_COUNTER_KEY,counterTv.getText().toString());
        editor.apply();
    }
}
