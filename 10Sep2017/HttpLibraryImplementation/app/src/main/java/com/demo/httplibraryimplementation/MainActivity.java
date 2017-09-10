package com.demo.httplibraryimplementation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView myHttpData = (TextView) findViewById(R.id.myHttpData);

        AsyncHttpClient httpClient = new AsyncHttpClient();
        httpClient.get("http://brotherstech.net/ssuet/AndroidApi.php?name=SSUETSTUDENT&age=10", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String response = new String(responseBody);
                Gson gson = new Gson();
                Response responseObj = gson.fromJson(response,Response.class);
                myHttpData.setText(responseObj.getDataGet().getName()+"\n\n"+response);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                myHttpData.setText(error.getMessage());
            }
        });
    }
}
