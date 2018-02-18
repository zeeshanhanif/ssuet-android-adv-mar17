package com.suet.recyclerviewwithfirebase;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 2/18/2018.
 */

public class myAdapter extends RecyclerView.Adapter<myAdapter.myViewHolder> {

    ArrayList<String> myList;
    Context mContext;
    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView myText;
        public myViewHolder(View itemView) {
            super(itemView);
            myText =itemView.findViewById(R.id.myText);
        }
    }

    myAdapter(Context c, ArrayList<String> list){
        this.myList=list;
        this.mContext=c;
    }
    @Override
    public myAdapter.myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(mContext).inflate(R.layout.card_layout,null);
       myViewHolder myViewHolder  = new myViewHolder(mView);
       return  myViewHolder;
    }

    @Override
    public void onBindViewHolder(myAdapter.myViewHolder holder, int position) {
        holder.myText.setText(myList.get(position));

    }

    @Override
    public int getItemCount() {
        return myList.size();
    }
}
