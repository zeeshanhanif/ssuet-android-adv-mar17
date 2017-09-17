package com.demo.sqlitelistdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 9/17/2017.
 */

public class MyListAdapter extends ArrayAdapter<Contact> {
    ArrayList<Contact> contacts;
    MySqliteHelper sqliteHelper;
    public MyListAdapter(@NonNull Context context, ArrayList<Contact> contacts,MySqliteHelper sqliteHelper) {
        super(context, 0,contacts);
        this.contacts = contacts;
        this.sqliteHelper = sqliteHelper;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_layout,parent,false);
        }

        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvPhone = (TextView) convertView.findViewById(R.id.tvPhone);
        Button btnDel = (Button) convertView.findViewById(R.id.btnDel);

        final Contact contact = contacts.get(position);
        tvName.setText(contact.getName());
        tvPhone.setText(contact.getPhone());

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sqliteHelper.delContact(contact.getId());
                contacts.remove(position);
                notifyDataSetChanged();
            }
        });

        return convertView;
    }
}
