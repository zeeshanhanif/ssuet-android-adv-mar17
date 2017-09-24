package com.demo.ormdemoone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //http://satyan.github.io/sugar/
        final EditText etName = (EditText)findViewById(R.id.etName);
        final EditText etPhone = (EditText)findViewById(R.id.etPhone);
        Button saveBTn = (Button)findViewById(R.id.saveBtn);
        Button getBTn = (Button)findViewById(R.id.getBtn);


        ListView listItems = (ListView) findViewById(R.id.listItems);
        final List<Contact> contacts = new ArrayList<>();
        final ArrayAdapter<Contact> contactsListAdapter = new ArrayAdapter<Contact>(this,android.R.layout.simple_list_item_1,contacts);
        listItems.setAdapter(contactsListAdapter);

        saveBTn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etName.getText().toString();
                String phone = etPhone.getText().toString();
                //BusinessCard bs = new BusinessCard("ABC COMPANY");
                Contact contact = new Contact(name,phone);
                contact.save();

                }
        });

        getBTn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Select.from(Contact.class).where(Condition.prop("name").eq("ABCNAME")).list()
                List<Contact> contactsDb = Contact.listAll(Contact.class);
                contacts.clear();
                contacts.addAll(contactsDb);
                contactsListAdapter.notifyDataSetChanged();
            }
        });



    }
}
