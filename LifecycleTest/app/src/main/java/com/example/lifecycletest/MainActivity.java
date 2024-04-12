package com.example.lifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

private  final String TAG ="LidecycleTest";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG,"onCreate!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void OnRestart() {
        Log.v(TAG, "onRestart!");
        super.onRestart();
    }

    @Override
    protected void Onstart() {
        Log.v(TAG, "onstart!");
        super.onStart();
    }

    @Override
    protected void OnPause() {
        Log.v(TAG, "onpause!");
        super.onPause();
    }

    @Override
    protected  void  OnDestroy() {
        Log.v(TAG, "onDestroy!");
        super.onDestroy();
    }
        @Override
        protected  void  OnResume(){
            Log.v(TAG, "onResume!");
            super.onResume();
    }

}