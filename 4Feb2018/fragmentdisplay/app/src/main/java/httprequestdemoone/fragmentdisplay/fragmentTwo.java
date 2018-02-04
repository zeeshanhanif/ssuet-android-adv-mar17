package httprequestdemoone.fragmentdisplay;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentTwo extends Fragment {
TextView display_name;

    public fragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragment_two, container, false);
        display_name=view.findViewById(R.id.display_name);
        display_name.setVisibility(View.GONE);
        return view;
    }
public void Updateinfo(String name){
        display_name.setText(name);
        display_name.setVisibility(View.VISIBLE);
}
}
