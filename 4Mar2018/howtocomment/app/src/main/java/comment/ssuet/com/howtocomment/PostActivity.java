package comment.ssuet.com.howtocomment;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class PostActivity extends AppCompatActivity {

    TextView txusername ;
    EditText etpostmessage ;
    Button btnpost;
    RecyclerView recyclerView;
    String usernaame;

    ArrayList<PostModel> postModels;
    PostAdapter postAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);


        txusername = findViewById(R.id.username);
        usernaame = getSharedPreferences(getString(R.string.pref_name), Context.MODE_PRIVATE).getString("username", "null");
        if(!usernaame.equals("null")){
            txusername.setText(usernaame);
        }
        etpostmessage = findViewById(R.id.postmessage);
        btnpost = findViewById(R.id.crtpost);
        btnpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = usernaame;
                String message = etpostmessage.getText().toString();
                DatabaseReference databaseReference =  FirebaseDatabase.getInstance().getReference("post");
                String postkey = databaseReference.push().getKey();
                PostModel postModel = new PostModel(postkey, name, message);
                databaseReference.child(postkey).setValue(postModel);
                Toast.makeText(PostActivity.this, "Posted!", Toast.LENGTH_SHORT).show();
                etpostmessage.setText("");
            }
        });




        recyclerView = findViewById(R.id.recyclerview);
        postModels = new ArrayList<>();
        postAdapter = new PostAdapter(postModels);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(postAdapter);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("post");
        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                PostModel postModel = dataSnapshot.getValue(PostModel.class);
                postModels.add(postModel);
                postAdapter.notifyDataSetChanged();
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


    }
}
