package comment.ssuet.com.howtocomment;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                String key = getSharedPreferences(getString(R.string.pref_name), Context.MODE_PRIVATE).getString(getString(R.string.userkey), "null");
                if (!key.equals("null")) {
                    startActivity(new Intent(SplashActivity.this, PostActivity.class));
                } else {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                }
            }
        }, 1000);

    }
}
