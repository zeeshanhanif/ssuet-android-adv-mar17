package lifecycle.fragmentslifecycle;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MySImpleFragment extends Fragment {


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Fragment LifeCycle","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Fragment LifeCycle","onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e("Fragment LifeCycle","onCreateView");
        return inflater.inflate(R.layout.fragment_my_simple, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("Fragment LifeCycle","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("Fragment LifeCycle","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Fragment LifeCycle","onResume");
    }


    @Override
    public void onPause() {
        super.onPause();
        Log.e("Fragment LifeCycle","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Fragment LifeCycle","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Fragment LifeCycle","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Fragment LifeCycle","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Fragment LifeCycle","onDetach");
    }
}
