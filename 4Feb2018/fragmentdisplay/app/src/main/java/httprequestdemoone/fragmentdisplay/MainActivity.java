package httprequestdemoone.fragmentdisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements fragmentOne.onSetNameListener{
    @Override
    public void setname(String name) {
        fragmentTwo fragmentTwo=(fragmentTwo) getSupportFragmentManager().findFragmentById(R.id.frag2);
        fragmentTwo.Updateinfo(name);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
