package view.viewpagertabtitlebaseclass;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 8/13/2017.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<BaseFragment> fragments;
    public MyPagerAdapter(FragmentManager fm,ArrayList<BaseFragment> fragments) {
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
        return fragments.get(position).getTitle();
    }
}
