package com.example.wzh.activity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {

    private static final String It = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(It,"onCreate is invoke!!!");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(It,"onRestart is invoke!!!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(It,"onStart is invoke!!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(It,"onResume is invoke!!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(It,"onStop is invoke!!!");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.e(It,"onDestroy is invoke!!!");
    }
}