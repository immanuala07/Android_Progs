package com.example.immanualtrinity.layoutsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Toast.makeText(getApplicationContext(), "Table Layout", Toast.LENGTH_LONG).show();
    }
    public void back(View v)
    {
        Intent intent7 = new Intent(Main6Activity.this,MainActivity.class);
        startActivity(intent7);
    }
}
