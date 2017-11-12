package jsonexampleone.firebasedemoone.chat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import jsonexampleone.firebasedemoone.R;
import jsonexampleone.firebasedemoone.adapters.PagerRecyclerAdapter;
import jsonexampleone.firebasedemoone.models.User;

/**
 * A simple {@link Fragment} subclass.
 */
public class Recents extends BaseFragment {


    ArrayList<User> users;

    public Recents() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recents, container, false);
        RecyclerView recyclerView = v.findViewById(R.id.usersList);
        users = new ArrayList<>();
        PagerRecyclerAdapter adapter = new PagerRecyclerAdapter(users, new PagerRecyclerAdapter.ItemClickListener() {
            @Override
            public void onItemClick(User user, int position) {

            }
        });
        recyclerView.setAdapter(adapter);

        return v;
    }

}
