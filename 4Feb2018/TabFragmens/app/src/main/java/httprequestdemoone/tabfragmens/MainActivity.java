package httprequestdemoone.tabfragmens;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout tabs;
    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs=(findViewById(R.id.tabs));
        pager=(findViewById(R.id.pager));

        FragmentAdapter fragmentAdapter=new FragmentAdapter(getSupportFragmentManager());
        pager.setAdapter(fragmentAdapter);
        tabs.setupWithViewPager(pager);
    }
}
