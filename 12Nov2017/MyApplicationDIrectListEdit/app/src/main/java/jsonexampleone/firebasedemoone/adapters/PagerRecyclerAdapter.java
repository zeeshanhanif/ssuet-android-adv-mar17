package jsonexampleone.firebasedemoone.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import jsonexampleone.firebasedemoone.R;
import jsonexampleone.firebasedemoone.models.User;
import jsonexampleone.firebasedemoone.viewholders.PagerViewHolder;

/**
 * Created by Ishaq Hassan on 11/5/2017.
 */

public class PagerRecyclerAdapter extends RecyclerView.Adapter<PagerViewHolder> {
    ArrayList<User> users;
    ItemClickListener itemClickListener;

    public PagerRecyclerAdapter(ArrayList<User> users,ItemClickListener itemClickListener) {
        this.users = users;
        this.itemClickListener = itemClickListener;
    }

    @Override
    public PagerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item,parent,false);
        return new PagerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PagerViewHolder holder, final int position) {
        final User user = users.get(position);
        holder.userNameTv.setText(user.getName());
        if(user.getImage() != null){
            Glide.with(holder.itemView.getContext()).load(user.getImage()).into(holder.contactImage);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(user,position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public interface ItemClickListener{
        void onItemClick(User user,int position);
    }
}
