package comment.ssuet.com.howtocomment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Dell on 3/4/2018.
 */

public class CustomCommentAdapter extends RecyclerView.Adapter<CustomViewHolder> {


    ArrayList<CommentModel> commentList;

    public CustomCommentAdapter(ArrayList<CommentModel> commentList) {
        this.commentList = commentList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_item, parent, false);
        CustomViewHolder customViewHolder = new CustomViewHolder(view);
        return customViewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.name.setText(commentList.get(position).getName());
        holder.comment.setText(commentList.get(position).getComment());
    }

    @Override
    public int getItemCount() {
        return commentList.size();
    }
}
