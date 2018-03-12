package com.example.immanualtrinity.christdata;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class Main2Activity extends Activity{

    Button b,b1,b2,b3,b4;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        b=(Button)findViewById(R.id.button);

        b1=(Button)findViewById(R.id.button2);

        b2=(Button)findViewById(R.id.button3);

        b3=(Button)findViewById(R.id.button4);

        b4=(Button)findViewById(R.id.button5);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent =new Intent(Main2Activity.this,Main3Activity.class);
               startActivity(intent);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                db=openOrCreateDatabase("christiteDB", Context.MODE_PRIVATE,null);
                db.execSQL("CREATE TABLE IF NOT EXISTS student(name VARCHAR, regno VARCHAR, mob VARCHAR, course VARCHAR);");
                Toast.makeText(Main2Activity.this,"Database Created",Toast.LENGTH_SHORT).show();


            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(Main2Activity.this,Main6Activity.class);
                startActivity(intent);
            }
        });
    }
}
