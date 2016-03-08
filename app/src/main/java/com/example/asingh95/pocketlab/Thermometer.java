package com.example.asingh95.pocketlab;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class Thermometer extends AppCompatActivity {

    //public Scale scale;

    private static final String TAG = "NanzusMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thermometer);
        Log.i(TAG,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragment = new Scale();
        fragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"onResume");
    }

    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause");

    }



}
