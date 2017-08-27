package com.demo.asynctask;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Ishaq Hassan on 8/27/2017.
 */

public class MyTask extends AsyncTask<Integer,Integer,Integer> {
    Context context;
    TextView textView;
    MyTask(Context context, TextView textView){
        this.context = context;
        this.textView = textView;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        textView.setText(""+values[0]);
    }

    @Override
    protected Integer doInBackground(Integer... voids) {
        int counter = 0;
        for(int i = 0;i<=voids[0];i++){
            counter = i;
            publishProgress(i);
        }
        return counter;
    }

    @Override
    protected void onPostExecute(Integer integer) {
        Toast.makeText(context,"Final Result Is "+integer,Toast.LENGTH_SHORT).show();
        textView.setText(""+integer);
    }
}
