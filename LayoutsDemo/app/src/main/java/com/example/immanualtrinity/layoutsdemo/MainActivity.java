package com.example.immanualtrinity.layoutsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b1=(Button) findViewById(R.id.button);
        Button b2=(Button) findViewById(R.id.button2);
        Button b3=(Button) findViewById(R.id.button3);
        Button b4=(Button) findViewById(R.id.button4);
        Button b5=(Button) findViewById(R.id.button5);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //relative
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //linear
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });



        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // Grid
                Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(intent);
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, Main6Activity.class);
                startActivity(intent);
            }
        });
    }
}
