package com.demo.sqlitelistdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contact> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etPhone = (EditText) findViewById(R.id.etPhone);
        Button btnSave = (Button) findViewById(R.id.btnSave);
        Button btnGET = (Button) findViewById(R.id.btnGET);
        final MySqliteHelper sqliteHelper = new MySqliteHelper(this);

        contacts = new ArrayList<>();
        ListView myListView = (ListView) findViewById(R.id.myList);
        final MyListAdapter listAdapter = new MyListAdapter(this,contacts,sqliteHelper);
        myListView.setAdapter(listAdapter);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strName = etName.getText().toString();
                String strPhone = etPhone.getText().toString();
                Contact contact = new Contact(strName,strPhone);
                long id = sqliteHelper.addContact(contact);
            }
        });

        btnGET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contacts.clear();
                contacts.addAll(sqliteHelper.getContacts());
                listAdapter.notifyDataSetChanged();
            }
        });

    }
}
