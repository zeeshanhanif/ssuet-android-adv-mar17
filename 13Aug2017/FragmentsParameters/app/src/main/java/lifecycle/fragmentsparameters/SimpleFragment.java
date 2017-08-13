package lifecycle.fragmentsparameters;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String myData = getArguments().getString("myData");
        Toast.makeText(getContext(),myData,Toast.LENGTH_LONG).show();
        return inflater.inflate(R.layout.fragment_simple, container, false);
    }

}
