package comment.ssuet.com.howtocomment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class SignupActivity extends AppCompatActivity {

    EditText etname, etemail, etpass;
    Button btncreat, btnloginact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etname = findViewById(R.id.username);
        etemail = findViewById(R.id.useemail);
        etpass = findViewById(R.id.userpass);
        btncreat = findViewById(R.id.signupbtn);
        btncreat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username = etname.getText().toString();
                final String useremail = etemail.getText().toString();
                final String userpass = etpass.getText().toString();

                FirebaseAuth.getInstance().createUserWithEmailAndPassword(useremail, userpass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            final String curruserkey = FirebaseAuth.getInstance().getCurrentUser().getUid();
                            usermodel usermodel = new usermodel(curruserkey, username, useremail, userpass);
                            FirebaseDatabase.getInstance().getReference("user").child(curruserkey).setValue(usermodel).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()){
                                        Toast.makeText(SignupActivity.this, "Success fully Created!", Toast.LENGTH_SHORT).show();
                                        SharedPreferences.Editor sharedPreferences = getSharedPreferences(getString(R.string.pref_name), Context.MODE_PRIVATE).edit();
                                        sharedPreferences.putString(getString(R.string.userkey), curruserkey);
                                        sharedPreferences.putString(getString(R.string.username), username);
                                        sharedPreferences.commit();

                                        startActivity(new Intent(SignupActivity.this, PostActivity.class));
                                    }else{
                                        Toast.makeText(SignupActivity.this, "Something went wrong!"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });

                        }else {
                            Toast.makeText(SignupActivity.this, "Creation Failed : "+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        btnloginact = findViewById(R.id.loginbtnact);
        btnloginact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignupActivity.this, LoginActivity.class));
            }
        });

    }
}
