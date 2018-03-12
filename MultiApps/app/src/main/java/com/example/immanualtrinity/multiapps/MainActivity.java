package com.example.immanualtrinity.multiapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Handler;
import android.content.Intent;
import android.widget.Button;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
                finish();
            }
        },3000);


    }
}
