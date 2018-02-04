package httprequestdemoone.myservicesproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button button1,button2, button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);

        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startmyService();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopmyService();

            }
        });  button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startmyintentservice();

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopmyintentservice();

            }
        });
    }

    private void startmyintentservice() {
        Intent i = new Intent(this, myIntentService.class);
        startService(i);

    }
    private void stopmyintentservice() {
        Intent i = new Intent(this, myIntentService.class);
        stopService(i);

    }

    private void stopmyService() {
        Intent i = new Intent(this, myService.class);
        stopService(i);
    }

    private void startmyService() {
        Intent i = new Intent(this, myService.class);
        startService(i);
    }
}
