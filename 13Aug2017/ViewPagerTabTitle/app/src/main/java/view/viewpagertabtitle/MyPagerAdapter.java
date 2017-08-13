package view.viewpagertabtitle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 8/13/2017.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment> fragments;
    public MyPagerAdapter(FragmentManager fm,ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return ((FirstFragment)fragments.get(position)).getTitle();
            case 1:
                return ((SecondFragment)fragments.get(position)).getTitle();
            case 2:
                return ((ThirdFragment)fragments.get(position)).getTitle();
            default:
                return "Unknown Tab";
        }


    }
}
