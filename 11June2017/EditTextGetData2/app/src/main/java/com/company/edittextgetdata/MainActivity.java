package com.company.edittextgetdata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myButtonClick(View v){
        EditText editText = (EditText) findViewById(R.id.myEditText);
        TextView textView = (TextView)findViewById(R.id.myTextView);
        String myText = editText.getText().toString();
        textView.setText(myText);
    }
}
