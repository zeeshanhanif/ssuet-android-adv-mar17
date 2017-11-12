package jsonexampleone.firebasedemoone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import jsonexampleone.firebasedemoone.models.User;

public class MessagesActivity extends AppCompatActivity {
    private int PICK_IMAGE = 1000;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        user = (User) getIntent().getSerializableExtra("user");
        Button selectFileBtn = findViewById(R.id.selectFileBtn);
        RecyclerView recyclerView = findViewById(R.id.chatList);
        selectFileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickImage();
            }
        });
    }


    private void pickImage() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE);
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PICK_IMAGE) {
            Uri selectedimg = data.getData();
            Log.e("FIle Path", selectedimg.toString());
            uploadFile(selectedimg);
        }
    }

    private void uploadFile(Uri file) {
        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference mountainsRef = storage.getReference().child(System.currentTimeMillis()+".jpg");
        UploadTask uploadTask = mountainsRef.putFile(file);
        uploadTask.addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle unsuccessful uploads
                Toast.makeText(MessagesActivity.this,"Fail to upload "+exception.getLocalizedMessage(),Toast.LENGTH_SHORT).show();
            }
        }).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                // taskSnapshot.getMetadata() contains file metadata such as size, content-type, and download URL.
                Uri downloadUrl = taskSnapshot.getDownloadUrl();
                String downloadUrlStr = downloadUrl.toString();
                FirebaseDatabase.getInstance().getReference().child("users/"+user.getId()).child("image").setValue(downloadUrlStr);
            }
        });


    }
}
