package jsonexampleone.firebasedemoone.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import jsonexampleone.firebasedemoone.R;
import jsonexampleone.firebasedemoone.models.User;
import jsonexampleone.firebasedemoone.viewholders.PagerViewHolder;

/**
 * Created by Ishaq Hassan on 11/5/2017.
 */

public class PagerRecyclerAdapter extends RecyclerView.Adapter<PagerViewHolder> {
    ArrayList<User> users;

    public PagerRecyclerAdapter(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public PagerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item,parent,false);
        return new PagerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PagerViewHolder holder, int position) {
        User user = users.get(position);
        holder.userNameTv.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
