package view.tablayout;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager pager = (ViewPager) findViewById(R.id.myPager);
        ArrayList<BaseFragment> fragments = new ArrayList<>();

        BaseFragment fragmentOne = new SampleFragment();
        fragmentOne.setTitle("TAB ONE");
        fragments.add(fragmentOne);

        BaseFragment fragmentTwo = new SampleFragment();
        fragmentTwo.setTitle("TAB TWO");
        fragments.add(fragmentTwo);

        BaseFragment fragmentThree = new SampleFragment();
        fragmentThree.setTitle("TAB THREE");
        fragments.add(fragmentThree);

        BaseFragment fragmentFour = new SampleFragment();
        fragmentFour.setTitle("TAB FOUR");
        fragments.add(fragmentFour);

        BaseFragment fragmentFive = new SampleFragment();
        fragmentFive.setTitle("TAB FIVE");
        fragments.add(fragmentFive);

        BaseFragment fragmentSix = new SampleFragment();
        fragmentSix.setTitle("TAB SIX");
        fragments.add(fragmentSix);

        BaseFragment fragmentSeven = new SampleFragment();
        fragmentSeven.setTitle("TAB SEVEN");
        fragments.add(fragmentSeven);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(),fragments);
        pager.setAdapter(adapter);
    }
}
