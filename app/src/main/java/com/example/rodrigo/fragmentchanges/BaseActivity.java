package com.example.rodrigo.fragmentchanges;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Rodrigo Cericatto on 08/09/2015.
 */
public class BaseActivity extends AppCompatActivity {

    //--------------------------------------------------
    // Constants
    //--------------------------------------------------

    public static final String TAG = "FragmentPanes";

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------

    private String mClassName = "";

    //--------------------------------------------------
    // Activity Life Cycle
    //--------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mClassName = getClass().getName();
        Log.i(TAG, "[" + mClassName + "]" + " Activity onCreate.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "[" + mClassName + "]" + " Activity onStart.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "[" + mClassName + "]" + " Activity onResume.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "[" + mClassName + "]" + " Activity onPause.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "[" + mClassName + "]" + " Activity onStop.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "[" + mClassName + "]" + " Activity onRestart.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "[" + mClassName + "]" + " Activity onDestroy.");
    }

    //--------------------------------------------------
    // Methods
    //--------------------------------------------------

    public void setClassName(String name) {
        mClassName = name;
    }
}