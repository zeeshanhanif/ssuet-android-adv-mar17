package jsonexampleone.firebasedemoone.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

import jsonexampleone.firebasedemoone.chat.BaseFragment;

/**
 * Created by Ishaq Hassan on 11/5/2017.
 */

public class ChatsPagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<BaseFragment> fragments;
    public ChatsPagerAdapter(FragmentManager fm,ArrayList<BaseFragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return (Fragment) fragments.get(position);
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
