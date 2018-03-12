package com.example.immanualtrinity.layoutsdemo;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;

public class Main5Activity extends AppCompatActivity {
/*
    ImageView img=(ImageView)findViewById(R.id.imageView11);
    ImageView img1=(ImageView)findViewById(R.id.imageView12);
*/
    // Button b9=(Button) findViewById(R.id.button9);
    // Button b8=(Button) findViewById(R.id.button8);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Toast.makeText(getApplicationContext(), "Frame Layout", Toast.LENGTH_LONG).show();
/*
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                img.setVisibility(View.GONE);
                img1.setVisibility(View.VISIBLE);
            }
        });
*/
/*
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(Main5Activity.this, MainActivity.class);
                startActivity(intent7);
            }
        });
        */
    }
        /*


        img.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            @Override
            public void onClick(View v) {
              //  img.setVisibility(View.GONE);
                //img1.setVisibility(View.VISIBLE);
                  Toast.makeText(getApplicationContext(), "Christ Logo", Toast.LENGTH_SHORT).show();
            }
        });


        img1.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                img.setVisibility(View.VISIBLE);
                img1.setVisibility(View.GONE);
                //  Toast.makeText(getApplicationContext(), "Christ Address", Toast.LENGTH_SHORT).show();
            }
        });
*/

/*
    public void changeimg(View v)
    {

    }
*/


    public void back(View v) {
        Intent intent7 = new Intent(Main5Activity.this, MainActivity.class);
        startActivity(intent7);
    }
/*
    public void changeimg(View v) {

        img.setVisibility(View.GONE);
        img1.setVisibility(View.VISIBLE);
    }

    */
}



