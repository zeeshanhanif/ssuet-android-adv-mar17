package fragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFirstFragment extends Fragment {


    public MyFirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_my_first, container, false);

        Button btn = (Button) myView.findViewById(R.id.myBtn);
        final EditText et = (EditText) myView.findViewById(R.id.myInput);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),et.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

        return myView;
    }

}
