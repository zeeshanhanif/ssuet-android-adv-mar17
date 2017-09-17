package com.demo.sqliteexampleone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etPhone = (EditText) findViewById(R.id.etPhone);
        Button btnSave = (Button) findViewById(R.id.btnSave);
        final TextView myIdTv = (TextView) findViewById(R.id.myIdTv);
        final MySqliteHelper sqliteHelper = new MySqliteHelper(this);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strName = etName.getText().toString();
                String strPhone = etPhone.getText().toString();
                Contact contact = new Contact(strName,strPhone);
                long id = sqliteHelper.addContact(contact);
                myIdTv.setText(String.valueOf(id));
            }
        });

    }
}
