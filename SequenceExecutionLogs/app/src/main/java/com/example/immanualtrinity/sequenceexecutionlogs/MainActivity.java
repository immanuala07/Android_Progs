package com.example.immanualtrinity.sequenceexecutionlogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("info : ","The App is in ONCREATE");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("info : ","The App is in ONSTART");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("info : ","The App is in ONPAUSE");
    }

    @Override
    public void onRestart()
    {
        super.onRestart();
        Log.i("info : ", "The App is in ONRESTART");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("info : ","The App is in ONRESUME");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("info : ","The App is in ONSTOP");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("info : ","The App is in ONDESTROY");
    }

    public void onClick(View view) {
        Log.i("info : ","The BUTTON is PRESSED");
    }

}
