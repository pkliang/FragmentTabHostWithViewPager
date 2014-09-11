package com.example.omistaja.fragmenttabhost;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        FragmentTabHost mTabHost = (FragmentTabHost) findViewById(R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.tabFrameLayout);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab1").setIndicator("Tab 1"),
                PlaceholderFragment.class, null);

        mTabHost.addTab(
                mTabHost.newTabSpec("tab2").setIndicator("Tab 2"),
                DemoObjectFragment.class, createTagBundle("Tab 2"));

        mTabHost.addTab(
                mTabHost.newTabSpec("tab3").setIndicator("Tab 3"),
                DemoObjectFragment.class, createTagBundle("Tab 3"));

        mTabHost.addTab(
                mTabHost.newTabSpec("tab4").setIndicator("Tab 4"),
                DemoObjectFragment.class, createTagBundle("Tab 4"));
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

    private Bundle createTagBundle(String tag) {
        Bundle args = new Bundle();
        args.putString(DemoObjectFragment.ARG_OBJECT, tag);
        return args;
    }
}
