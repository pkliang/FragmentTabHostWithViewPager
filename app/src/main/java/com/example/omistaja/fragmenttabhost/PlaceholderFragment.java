package com.example.omistaja.fragmenttabhost;

/**
 * Created by Omistaja on 9/9/2014.
 */


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.viewpagerindicator.TabPageIndicator;

import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {
    DemoCollectionPagerAdapter mDemoCollectionPagerAdapter;
    ViewPager mViewPager;

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(getTag(), "onCreateView");
        View rootView = inflater.inflate(R.layout.fragment_demo, container, false);
            /*TextView textView = (TextView) rootView.findViewById(R.id.tag);
            textView.setText(getTag());*/
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mDemoCollectionPagerAdapter =
                new DemoCollectionPagerAdapter(
                        getChildFragmentManager());
        mViewPager = (ViewPager) view.findViewById(R.id.pager);
        mViewPager.setAdapter(mDemoCollectionPagerAdapter);
        TabPageIndicator indicator = (TabPageIndicator)view.findViewById(R.id.indicator);
        indicator.setViewPager(mViewPager);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
       /* List<Fragment> list =getChildFragmentManager().getFragments();
        FragmentTransaction transaction =  getChildFragmentManager().beginTransaction();
        for(Fragment fragment : list ) {
            //if(!fragment.getTag().contains("tab"))
                transaction.detach(fragment);
        }

        transaction.commit();*/

        Log.d(getTag(), "onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(getTag(), "onDetach");
    }

   private static class DemoCollectionPagerAdapter extends FragmentStatePagerAdapter {
        public DemoCollectionPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {

            return DemoObjectFragment.newInstance(i + 1);
        }

        @Override
        public int getCount() {
            return 30;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "OBJECT " + (position + 1);
        }
    }
}

