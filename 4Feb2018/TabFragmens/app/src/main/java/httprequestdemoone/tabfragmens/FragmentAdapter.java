package httprequestdemoone.tabfragmens;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Ishaq Hassan on 2/4/2018.
 */

public class FragmentAdapter extends FragmentStatePagerAdapter {
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0)
        return new FragmentOne();
        else  return new FragmentTwo();
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {


        if(position==0)
            return "FragmentONe";
        else  return "FragmentTwo";
    }
}
