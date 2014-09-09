package com.example.omistaja.fragmenttabhost;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Omistaja on 9/9/2014.
 */
public class DemoObjectFragment extends Fragment {
    public static final String ARG_OBJECT = "object";
    private static final String TAG = "DemoObjectFragment";


    static DemoObjectFragment newInstance(int position) {
        DemoObjectFragment frag=new DemoObjectFragment();
        Bundle args=new Bundle();

        args.putInt(ARG_OBJECT, position);
        frag.setArguments(args);
        return(frag);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(getTag(), "onCreateView");
        View rootView = inflater.inflate(
                R.layout.fragment_my, container, false);

        return  rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle args = getArguments();
        if(args !=null)
        ((TextView) view.findViewById(R.id.tag)).setText(
                Integer.toString(args.getInt(ARG_OBJECT)));
        Log.d(TAG, "tag is " + getTag());
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView " + getTag());
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach");
    }

}
