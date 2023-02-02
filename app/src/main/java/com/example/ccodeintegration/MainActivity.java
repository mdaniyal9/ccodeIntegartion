package com.example.ccodeintegration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("MainActivity", "onCreate: " + stringFromJNI());
    }

    static {
       System.loadLibrary("ccodeintegration");
    }

    public native String stringFromJNI();
}