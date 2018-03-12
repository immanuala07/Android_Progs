package com.example.immanualtrinity.layoutsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toast.makeText(getApplicationContext(), "Grid Layout", Toast.LENGTH_LONG).show();

        //get the button view
        ImageView i1 = (ImageView) findViewById(R.id.imageView);
        ImageView i2 = (ImageView) findViewById(R.id.imageView2);
        ImageView i3 = (ImageView) findViewById(R.id.imageView3);
        ImageView i4 = (ImageView) findViewById(R.id.imageView4);
        ImageView i5 = (ImageView) findViewById(R.id.imageView5);
        ImageView i6 = (ImageView) findViewById(R.id.imageView6);
        ImageView i7 = (ImageView) findViewById(R.id.imageView7);
        ImageView i8 = (ImageView) findViewById(R.id.imageView8);
        ImageView i9 = (ImageView) findViewById(R.id.imageView9);

        //set a onclick listener for when the button gets clicked
        i1.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Buisness men", Toast.LENGTH_SHORT).show();
            }
        });

        //set a onclick listener for when the button gets clicked
        i2.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Music", Toast.LENGTH_SHORT).show();
            }
        });

        //set a onclick listener for when the button gets clicked
        i3.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Shield", Toast.LENGTH_SHORT).show();
            }
        });

//set a onclick listener for when the button gets clicked
        i4.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Garments", Toast.LENGTH_SHORT).show();
            }
        });

//set a onclick listener for when the button gets clicked
        i5.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hospital", Toast.LENGTH_SHORT).show();
            }
        });

//set a onclick listener for when the button gets clicked
        i6.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Key", Toast.LENGTH_SHORT).show();
            }
        });

//set a onclick listener for when the button gets clicked
        i7.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Buisness Women", Toast.LENGTH_SHORT).show();
            }
        });

        //set a onclick listener for when the button gets clicked
        i8.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Light Bulb", Toast.LENGTH_SHORT).show();
            }
        });

        //set a onclick listener for when the button gets clicked
        i9.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Power ON/OFF", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void back(View v)
    {
        Intent intent7 = new Intent(Main4Activity.this,MainActivity.class);
        startActivity(intent7);
    }
}
