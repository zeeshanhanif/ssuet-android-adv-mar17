package view.tablayout;

import android.support.v4.app.Fragment;

/**
 * Created by Ishaq Hassan on 8/20/2017.
 */

public class BaseFragment extends Fragment {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
