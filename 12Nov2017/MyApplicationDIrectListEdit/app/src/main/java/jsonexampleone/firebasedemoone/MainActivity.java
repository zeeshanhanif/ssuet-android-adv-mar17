package jsonexampleone.firebasedemoone;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import jsonexampleone.firebasedemoone.models.User;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseDatabase mDb;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        final EditText etEmail = findViewById(R.id.etEmail);
        final EditText etName = findViewById(R.id.etName);
        final EditText etPassword = findViewById(R.id.etPassword);
        final TextView unameTv = findViewById(R.id.unameTv);
        Button signUpBtn = (Button) findViewById(R.id.signUpBtn);
        Button signInBtn = (Button) findViewById(R.id.signInBtn);

        mAuth = FirebaseAuth.getInstance();

        mDb = FirebaseDatabase.getInstance();

        if(mAuth.getCurrentUser() != null){
            startActivity(new Intent(MainActivity.this,ChatsActivity.class));
        }

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String etEmailStr = etEmail.getText().toString();
                String etPasswordStr = etPassword.getText().toString();
                String nameStr = etName.getText().toString();
                mAuth.createUserWithEmailAndPassword(etEmailStr, etPasswordStr)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(MainActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                                    mAuth.getCurrentUser().getUid();
                                    String uid = mAuth.getCurrentUser().getUid();
                                    mDb.getReference().child("users/" + uid).setValue(new User(etName.getText().toString(), uid));
                                } else {
                                    Toast.makeText(MainActivity.this, "Error while Registering User " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String etEmailStr = etEmail.getText().toString();
                String etPasswordStr = etPassword.getText().toString();
                mAuth.signInWithEmailAndPassword(etEmailStr, etPasswordStr)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(MainActivity.this, "Signed In Successfully", Toast.LENGTH_SHORT).show();
                                    String uid = mAuth.getCurrentUser().getUid();
                                    mDb.getReference().child("users/" + uid)
                                            .addValueEventListener(new ValueEventListener() {
                                                @Override
                                                public void onDataChange(DataSnapshot dataSnapshot) {
                                                    user = dataSnapshot.getValue(User.class);
                                                    unameTv.setText(user.getName());
                                                    startActivity(new Intent(MainActivity.this,ChatsActivity.class));
                                                }

                                                @Override
                                                public void onCancelled(DatabaseError databaseError) {

                                                }
                                            });
                                } else {
                                    Toast.makeText(MainActivity.this, "Error while Signing In User " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }
}
