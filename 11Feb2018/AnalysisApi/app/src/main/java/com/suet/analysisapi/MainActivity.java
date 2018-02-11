package com.suet.analysisapi;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.entity.StringEntity;

public class MainActivity extends AppCompatActivity {

    private String API_KEY = "AIzaSyAyMGmO7lHXoj_EJCKATtO9zd-ZPj8Hdt0";
    private String URL = "https://language.googleapis.com/v1/documents:analyzeSentiment?key=";
    ProgressDialog progressDialog;
    TextView responseScoreTv;
    TextView responseMagTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtEt = findViewById(R.id.txtEt);
        Button analysisBtn = findViewById(R.id.analysisBtn);
        responseScoreTv = findViewById(R.id.responseScoreTv);
        responseMagTv = findViewById(R.id.responseMagTv);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Analyzing...");
        progressDialog.setCancelable(false);


        analysisBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = txtEt.getText().toString();
                analyze(text);
            }
        });
    }

    private void analyze(String text){
        progressDialog.show();
        try {
            JSONObject req = new JSONObject();
            req.put("encodingType","UTF8");


            JSONObject document = new JSONObject();
            document.put("type","PLAIN_TEXT");
            document.put("content",text);

            req.put("document",document);

            StringEntity entity = new StringEntity(req.toString());

            AsyncHttpClient httpClient = new AsyncHttpClient();
            httpClient.post(this, URL + API_KEY, entity, "application/json", new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    String responseStr = new String(responseBody);
                    try{
                        JSONObject responseObject = new JSONObject(responseStr);
                        JSONObject documentSentiment = responseObject.getJSONObject("documentSentiment");
                        responseScoreTv.setText(documentSentiment.getString("score"));
                        responseMagTv.setText(documentSentiment.getString("magnitude"));
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    String responseStr = new String(responseBody);
                }

                @Override
                public void onFinish() {
                    super.onFinish();
                    progressDialog.dismiss();
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
