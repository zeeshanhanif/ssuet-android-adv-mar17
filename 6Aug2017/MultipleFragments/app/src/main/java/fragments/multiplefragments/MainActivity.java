package fragments.multiplefragments;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.containerTop,new TopFragment());
        ft.add(R.id.containerMiddle,new MiddleFragment());
        ft.add(R.id.containerBottom,new BottomFragment());
        ft.commit();

    }
}
