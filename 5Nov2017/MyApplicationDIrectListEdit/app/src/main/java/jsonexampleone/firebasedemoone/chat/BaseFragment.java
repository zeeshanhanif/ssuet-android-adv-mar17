package jsonexampleone.firebasedemoone.chat;

import android.support.v4.app.Fragment;

/**
 * Created by Ishaq Hassan on 11/5/2017.
 */

public class BaseFragment extends Fragment {
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
