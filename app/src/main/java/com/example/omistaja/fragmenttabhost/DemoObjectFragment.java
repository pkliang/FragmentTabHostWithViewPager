package com.example.omistaja.fragmenttabhost;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Liang Song on 9/9/2014.
 */
public class DemoObjectFragment extends Fragment {
    public static final String ARG_OBJECT = "object";

    static DemoObjectFragment newInstance(int position) {
        DemoObjectFragment frag = new DemoObjectFragment();
        Bundle args = new Bundle();

        args.putString(ARG_OBJECT, Integer.toString(position));
        frag.setArguments(args);
        return (frag);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(
                R.layout.fragment_my, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle args = getArguments();
        if (args != null)
            ((TextView) view.findViewById(R.id.tag)).setText(args.getString(ARG_OBJECT));
    }
}
