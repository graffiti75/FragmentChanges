package com.example.rodrigo.fragmentchanges;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Rodrigo Cericatto on 06/09/2015.
 */
public class BaseFragment extends Fragment {

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------

    private String mClassName = "";

    //--------------------------------------------------
    // Fragment Life Cycle
    //--------------------------------------------------

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.i(BaseActivity.TAG, "[" + mClassName + "]" + " Fragment onAttach.");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(BaseActivity.TAG, "[" + mClassName + "]" + " Fragment onCreate.");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(BaseActivity.TAG, "[" + mClassName + "]" + " Fragment onCreateView.");
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(BaseActivity.TAG, "[" + mClassName + "]" + " Fragment onActivityCreated.");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(BaseActivity.TAG, "[" + mClassName + "]" + " Fragment onStart.");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(BaseActivity.TAG, "[" + mClassName + "]" + " Fragment onResume.");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(BaseActivity.TAG, "[" + mClassName + "]" + " Fragment onPause.");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(BaseActivity.TAG, "[" + mClassName + "]" + " Fragment onPause.");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(BaseActivity.TAG, "[" + mClassName + "]" + " Fragment onDestroyView.");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(BaseActivity.TAG, "[" + mClassName + "]" + " Fragment onDestroy.");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(BaseActivity.TAG, "[" + mClassName + "]" + " Fragment onDetach.");
    }

    //--------------------------------------------------
    // Methods
    //--------------------------------------------------

    public void setClassName(String name) {
        mClassName = name;
    }
}