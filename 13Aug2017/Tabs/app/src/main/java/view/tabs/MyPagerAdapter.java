package view.tabs;

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
                return "ABC";
            case 1:
                return "XYZ";
            case 2:
                return "ABC 123";
            default:
                return "Unknown Tab";
        }
    }
}
