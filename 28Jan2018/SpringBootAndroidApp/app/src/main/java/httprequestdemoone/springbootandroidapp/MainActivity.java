package httprequestdemoone.springbootandroidapp;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    RecyclerView studentsList;
    StudentsRecyclerAdapter adapter;
    ArrayList<StudentModel> students;
    ProgressDialog progressDialog;

    EditText studentNameEt;
    EditText studentEmailEt;
    Button studentAddBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading Data...");

        studentsList = findViewById(R.id.studentsList);
        studentNameEt = findViewById(R.id.studentNameEt);
        studentEmailEt = findViewById(R.id.studentEmailEt);
        studentAddBtn = findViewById(R.id.studentAddBtn);

        studentAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = studentNameEt.getText().toString();
                String email = studentEmailEt.getText().toString();
                addDataToApi(name,email);
            }
        });

        students = new ArrayList<>();
        adapter = new StudentsRecyclerAdapter(students);
        studentsList.setLayoutManager(new LinearLayoutManager(this));
        studentsList.setAdapter(adapter);
        getDataFromApi();
    }

    private void getDataFromApi(){
        progressDialog.show();
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        asyncHttpClient.get("https://murmuring-eyrie-28538.herokuapp.com/", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String response = new String(responseBody);
                Gson gson = new Gson();
                ResponseModel responseModel = gson.fromJson(response,ResponseModel.class);
                StudentModel[] studentModels = null;
                try{
                    JSONObject jsonObject = new JSONObject(response);
                    studentModels = gson.fromJson(jsonObject.getJSONArray("data").toString(),StudentModel[].class);
                }catch (Exception e){
                    e.printStackTrace();
                }
                students.addAll(Arrays.asList(studentModels));
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                String response = new String(responseBody);
                Toast.makeText(MainActivity.this,response,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFinish() {
                super.onFinish();
                progressDialog.dismiss();
            }
        });
    }

    private void addDataToApi(String name,String email){
        progressDialog.show();
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        RequestParams params = new RequestParams();
        params.put("stname",name);
        params.put("email",email);
        asyncHttpClient.post("https://murmuring-eyrie-28538.herokuapp.com/add",params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String response = new String(responseBody);
                Gson gson = new Gson();
                ResponseModel responseModel = gson.fromJson(response,ResponseModel.class);
                StudentModel studentModel = null;
                try{
                    JSONObject jsonObject = new JSONObject(response);
                    studentModel = gson.fromJson(jsonObject.getJSONObject("data").toString(),StudentModel.class);
                }catch (Exception e){
                    e.printStackTrace();
                }
                students.add(studentModel);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                String response = new String(responseBody);
                Toast.makeText(MainActivity.this,response,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFinish() {
                super.onFinish();
                progressDialog.dismiss();
            }
        });
    }
}
