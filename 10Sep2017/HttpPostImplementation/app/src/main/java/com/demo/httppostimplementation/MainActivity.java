package com.demo.httppostimplementation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView myHttpData = (TextView) findViewById(R.id.myHttpData);

        AsyncHttpClient httpClient = new AsyncHttpClient();
        RequestParams params = new RequestParams();
        params.put("name","SSUET POST TEST");
        params.put("age","30");
        httpClient.post("http://brotherstech.net/ssuet/AndroidApi.php",params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String response = new String(responseBody);
                Gson gson = new Gson();
                Response responseObj = gson.fromJson(response,Response.class);
                myHttpData.setText(responseObj.getDataPosted().getName()+"\n\n"+response);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                myHttpData.setText(error.getMessage());
            }
        });
    }
}
