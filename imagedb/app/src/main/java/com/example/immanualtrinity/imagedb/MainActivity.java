package com.example.immanualtrinity.imagedb;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;
    Button a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db=openOrCreateDatabase("imageDB", Context.MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS quo(id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, img BLOB,counter INTEGER);");
        Toast.makeText(MainActivity.this,"Database Created",Toast.LENGTH_LONG).show();


        a=(Button)findViewById(R.id.button);
        b=(Button)findViewById(R.id.button2);

            a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
            }
        });

    }
}
