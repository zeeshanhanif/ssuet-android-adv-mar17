package view.viewpagertabtitlebaseclass;

import android.support.v4.app.Fragment;

/**
 * Created by Ishaq Hassan on 8/13/2017.
 */

public class BaseFragment extends Fragment {

    private String title;
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
