package comment.ssuet.com.howtocomment;

import android.content.Context;
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

/**
 * Created by Dell on 3/4/2018.
 */

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {
    ArrayList<PostModel> postModels;

    ArrayList<CommentModel> commentModels;
    CustomCommentAdapter customCommentAdapter;

    public PostAdapter(ArrayList<PostModel> postModels) {
        this.postModels = postModels;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_view, parent, false);
        return new PostViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final PostViewHolder holder, int position) {

        final PostModel postModel = postModels.get(position);
        holder.tvname.setText(postModel.getPostholder());
        holder.tvmessage.setText(postModel.getPostmessage());


        commentModels = new ArrayList<>();
        customCommentAdapter = new CustomCommentAdapter(commentModels);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(holder.list.getContext(), LinearLayoutManager.VERTICAL, false);
        holder.list.setLayoutManager(layoutManager);
        holder.list.setAdapter(customCommentAdapter);


        final String[] currcmmntkey = {null};
        if (postModel.getCommentnodekey() != null) {
            currcmmntkey[0] = postModel.getCommentnodekey();
            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("comments").child(currcmmntkey[0]);
            databaseReference.addChildEventListener(new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    CommentModel commentModel = dataSnapshot.getValue(CommentModel.class);
                    commentModels.add(commentModel);
                    customCommentAdapter.notifyDataSetChanged();
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

            holder.commes.setText("");
        }




        holder.commentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                String postkey = postModel.getKey();
                String cmnt = holder.commes.getText().toString();
                String user = view.getContext().getSharedPreferences(view.getContext().getString(R.string.pref_name), Context.MODE_PRIVATE).getString(view.getContext().getString(R.string.username), "null");



                if (currcmmntkey[0] == null) {
                    CommentModel commentModel = new CommentModel(user, cmnt);

                    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("comments");
                    currcmmntkey[0] = databaseReference.push().getKey();

                    databaseReference.child(currcmmntkey[0]).push().setValue(commentModel);



                    FirebaseDatabase.getInstance().getReference("post").child(postkey).child("commentnodekey").setValue(currcmmntkey[0]);


                    commentModels.add(commentModel);
                    customCommentAdapter.notifyDataSetChanged();
                    holder.commes.setText("");
                } else {

                    CommentModel commentModel = new CommentModel(user, cmnt);
                    FirebaseDatabase.getInstance().getReference("comments").child(currcmmntkey[0]).push().setValue(commentModel);
                    customCommentAdapter.notifyDataSetChanged();
                    holder.commes.setText("");
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return postModels.size();
    }
}
