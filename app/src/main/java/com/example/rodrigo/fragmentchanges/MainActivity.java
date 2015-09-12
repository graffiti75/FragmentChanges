package com.example.rodrigo.fragmentchanges;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Rodrigo Cericatto on 06/09/2015.
 */
public class MainActivity extends BaseActivity {

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------

    private FragmentTransaction mFragmentTransaction;
    private FragmentManager mFragmentManager;

    //--------------------------------------------------
    // Activity Life Cycle
    //--------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setDefault();
        setToolbar();
    }

    //--------------------------------------------------
    // Menu Methods
    //--------------------------------------------------

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id_menu_option1:
                switchFragment(R.id.id_detail_container_right, new Fragment4(), false);
                callSnackBar(getString(R.string.option1_text));
                break;
            case R.id.id_menu_option2:
                switchFragment(R.id.id_detail_container_right, new Fragment3(), false);
                callSnackBar(getString(R.string.option2_text));
                break;
            case R.id.id_menu_option3:
                switchFragment(R.id.id_detail_container_middle, new Fragment4(), false);
                callSnackBar(getString(R.string.option3_text));
                break;
        }
        return false;
    }

    //--------------------------------------------------
    // Fragment Methods
    //--------------------------------------------------

    public void getManager() {
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
    }

    public void switchFragment(Integer containerId, Fragment fragment, Boolean addOption) {
        getManager();
        if (addOption) {
            mFragmentTransaction.add(containerId, fragment);
        } else {
            mFragmentTransaction.replace(containerId, fragment);
        }
        mFragmentTransaction.commit();
    }

    //--------------------------------------------------
    // Methods
    //--------------------------------------------------

    public void setDefault() {
        setClassName(getClass().getName());
        switchFragment(R.id.id_detail_container_left, new Fragment1(), true);
        switchFragment(R.id.id_detail_container_middle, new Fragment2(), true);
        switchFragment(R.id.id_detail_container_right, new Fragment3(), true);
    }

    public void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.id_toolbar);
        toolbar.setTitle(getString(R.string.app_name));
        toolbar.inflateMenu(R.menu.menu_main);
        setSupportActionBar(toolbar);
    }

    public void callSnackBar(String text) {
        View parentLayout = findViewById(R.id.id_root_view);
        Snackbar snackbar = Snackbar.make(parentLayout, text, Snackbar.LENGTH_LONG);
        snackbar.setDuration(Snackbar.LENGTH_LONG);
        snackbar.setActionTextColor(Color.YELLOW);
        snackbar.setAction(text, null);
        snackbar.show();
    }
}