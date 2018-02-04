package httprequestdemoone.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   btn1=findViewById(R.id.btn1);
   btn2=findViewById(R.id.btn2);
   btn1.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
          fragment(new fragmentOne());
       }
   });
   btn2.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           fragment(new fragmentTwo());
       }
   });
    }
    public void fragment(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmencontainer,fragment);
        fragmentTransaction.commit();
    }
}
