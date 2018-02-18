package com.suet.recyclerviewwithfirebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<String> myArrayList;
    RecyclerView recyclerView;
    Button buttonSumit;
    EditText editArea;
    myAdapter myAdapter;
    DatabaseReference firebaseDatabase;
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        firebaseDatabase = FirebaseDatabase.getInstance().getReference();


        firebaseDatabase.child("myList").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                if (dataSnapshot.getValue() != null) {
                    Log.d(TAG, "onChildAdded: value " + dataSnapshot.getValue().toString() + " KEY " + dataSnapshot.getKey());

                    addItem(dataSnapshot.getValue().toString());

                } else {
                    Log.d(TAG, "onChildAdded: empty");
                }
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                if (dataSnapshot.getValue() != null) {
                    Log.d(TAG, "onChildChange: value " + dataSnapshot.getValue().toString() + " KEY " + dataSnapshot.getKey());
                }
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() != null) {
                    Log.d(TAG, "onChildREmove: value " + dataSnapshot.getValue().toString() + " KEY " + dataSnapshot.getKey());
                }
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        buttonSumit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // addItem(editArea.getText().toString());

                addItemtoFirebase(editArea.getText().toString());
            }
        });
    }

    private void addItemtoFirebase(String text) {
        String key = firebaseDatabase.push().getKey();
        firebaseDatabase.child("myList").child(key).setValue(text);
        editArea.setText("");
    }

    private void init() {
        recyclerView = findViewById(R.id.myRecyclerView);
        buttonSumit = findViewById(R.id.submitButton);
        editArea = findViewById(R.id.textArea);
        myArrayList = new ArrayList<>();
        myAdapter = new myAdapter(this, myArrayList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);
    }

    public void addItem(String text) {
        myArrayList.add((text));
        myAdapter.notifyDataSetChanged();
        editArea.setText("");

    }


}
