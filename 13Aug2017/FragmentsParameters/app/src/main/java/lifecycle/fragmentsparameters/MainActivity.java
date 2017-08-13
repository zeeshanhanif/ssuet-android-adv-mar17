package lifecycle.fragmentsparameters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment myFragment = new SimpleFragment();
        Bundle bundle = new Bundle();
        bundle.putString("myData","Hello World!");
        myFragment.setArguments(bundle);
        ft.replace(R.id.fragmentsContainer,myFragment);
        ft.commit();

    }
}
