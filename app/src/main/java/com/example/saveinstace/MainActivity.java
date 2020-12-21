package com.example.saveinstace;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mtvSavestate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtvSavestate = findViewById(R.id.tvSavestate);
        mtvSavestate.setText("Welcome To Masai School");
        Log.d("Vardhan","oncreate");

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Vardhan","onRestore");
        if(savedInstanceState!= null){
            String data = savedInstanceState.getString("data");
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Vardhan","onsaveInstance");
        outState.putString("data","Screen Rotated");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Vardhan","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Vardhan","onResme");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Vardhan","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Vardhan","onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Vardhan","onDestroy");
    }
}