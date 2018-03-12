package com.example.immanualtrinity.smgcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void pre(View v)
    {

        Intent nxt = new Intent(Main4Activity.this,Main5Activity.class);
        startActivity(nxt);

    }
}
