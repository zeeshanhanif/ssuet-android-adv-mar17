package view.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        ArrayList<Fragment> fragments = new ArrayList<>();

        FirstFragment fragment = new FirstFragment();
        fragments.add(fragment);

        SecondFragment secondFragment = new SecondFragment();
        fragments.add(secondFragment);

        ThirdFragment thirdFragment = new ThirdFragment();
        fragments.add(thirdFragment);

        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(pagerAdapter);

    }
}
