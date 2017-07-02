package com.resources.usingresources;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        TextView textView = (TextView) findViewById(R.id.textView);

        imageView.setImageResource(R.drawable.capture);
        textView.setText(R.string.my_text_view);
        String st = getResources().getString(R.string.my_text_view);
        Log.e("String St",st);
    }
}
