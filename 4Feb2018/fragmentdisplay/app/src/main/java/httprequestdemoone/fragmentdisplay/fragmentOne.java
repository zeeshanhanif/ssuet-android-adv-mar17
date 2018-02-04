package httprequestdemoone.fragmentdisplay;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentOne extends Fragment {
EditText name;
Button submit;
onSetNameListener onSetNameListener;
    public fragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragment_one, container, false);
name=view.findViewById(R.id.name);
submit=view.findViewById(R.id.submit);
submit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String Name=name.getText().toString();
        onSetNameListener.setname(Name);
    }
});
        return view;
    }
public interface onSetNameListener{
        public void setname(String name);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{onSetNameListener=(onSetNameListener)activity;}
        catch (Exception e){

        }
    }
}
