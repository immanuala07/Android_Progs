package com.example.immanualtrinity.quoteme;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.SQLData;

public class Main4Activity extends AppCompatActivity {

    Button post;
    EditText message;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        post=(Button)findViewById(R.id.insert);
        message=(EditText)findViewById(R.id.msg);

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("Insert","*********Inserting..***********");
                String a=message.getText().toString();

                if(a.isEmpty())
                {
                    Toast.makeText(Main4Activity.this, "Enter your quotes",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    db = openOrCreateDatabase("quoteDB", Context.MODE_PRIVATE, null);
                    db.execSQL("INSERT INTO quote (message,c) VALUES('"+message.getText().toString()+"','0');");
                    Log.i("Insert","*********Insertion done.***********");
                    Toast.makeText(Main4Activity.this,"Inserted",Toast.LENGTH_LONG).show();
                    message.setText("");

                    Intent i =new Intent(Main4Activity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });

    }
}
