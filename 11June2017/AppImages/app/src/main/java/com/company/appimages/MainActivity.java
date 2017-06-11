package com.company.appimages;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callBtnClick(View v){
        Button btn = (Button)v;
        Toast.makeText(this,btn.getText()+" Button Clicked!",Toast.LENGTH_SHORT).show();
    }
}
