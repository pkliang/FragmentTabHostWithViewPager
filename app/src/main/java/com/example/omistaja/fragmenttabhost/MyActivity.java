package com.example.omistaja.fragmenttabhost;

import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.TextView;


public class MyActivity extends ActionBarActivity {

    private FragmentTabHost mTabHost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        mTabHost = (FragmentTabHost) findViewById(R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.tabFrameLayout);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab1").setIndicator("Tab 1", getResources().getDrawable(android.R.drawable.ic_delete)),
                PlaceholderFragment.class, null);

        mTabHost.addTab(
                mTabHost.newTabSpec("tab2").setIndicator("Tab 2", getResources().getDrawable(android.R.drawable.ic_menu_add)),
                DemoObjectFragment.class, null);

        mTabHost.addTab(
                mTabHost.newTabSpec("tab3").setIndicator("Tab 3", getResources().getDrawable(android.R.drawable.ic_input_get)),
                DemoObjectFragment.class, null);

        mTabHost.addTab(
                mTabHost.newTabSpec("tab4").setIndicator("Tab 4", getResources().getDrawable(android.R.drawable.ic_menu_agenda)),
                DemoObjectFragment.class, null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
