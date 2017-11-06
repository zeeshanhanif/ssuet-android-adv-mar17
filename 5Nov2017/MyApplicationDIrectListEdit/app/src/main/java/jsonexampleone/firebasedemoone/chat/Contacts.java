package jsonexampleone.firebasedemoone.chat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import jsonexampleone.firebasedemoone.R;
import jsonexampleone.firebasedemoone.adapters.PagerRecyclerAdapter;
import jsonexampleone.firebasedemoone.models.User;

/**
 * A simple {@link Fragment} subclass.
 */
public class Contacts extends BaseFragment {

    ArrayList<User> users;


    public Contacts() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_contacts, container, false);
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.usersList);
        users = new ArrayList<>();
        final PagerRecyclerAdapter adapter = new PagerRecyclerAdapter(users);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        final DatabaseReference ref = db.getReference("users");

        ref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                User u = dataSnapshot.getValue(User.class);
                users.add(u);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        return v;
    }

}
