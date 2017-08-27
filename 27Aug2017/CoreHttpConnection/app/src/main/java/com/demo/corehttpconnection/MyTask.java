package com.demo.corehttpconnection;

import android.os.AsyncTask;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Ishaq Hassan on 8/27/2017.
 */

public class MyTask extends AsyncTask<String,Void,String> {
    TextView textView;

    MyTask(TextView textView){
        this.textView = textView;
    }

    @Override
    protected String doInBackground(String... strings) {
        String response = "";
        try {
            URL url = new URL(strings[0]);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                response += line;
            }
            br.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        return response;
    }

    @Override
    protected void onPostExecute(String s) {
        textView.setText(s);
    }
}
