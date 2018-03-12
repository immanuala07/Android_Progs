package com.example.immanualtrinity.christdata;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    Button insert;
    EditText name,regnum,cname,dob,mob;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        insert=(Button)findViewById(R.id.insert1);
        name=(EditText)findViewById(R.id.name);
        regnum=(EditText)findViewById(R.id.reg);
        cname=(EditText)findViewById(R.id.cname);
        mob=(EditText)findViewById(R.id.mob);


        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Log.i("Insert","*********Inserting..***********");
                String a=name.getText().toString();
                String bb=regnum.getText().toString();
                String d=mob.getText().toString();
                String e=cname.getText().toString();

                if(a.isEmpty() || bb.isEmpty() || d.isEmpty() || e.isEmpty())
                {
                    Toast.makeText(Main3Activity.this, "Enter the required details",Toast.LENGTH_SHORT).show();

                }
                else
                {

                    db=openOrCreateDatabase("christiteDB", Context.MODE_PRIVATE,null);
                    db.execSQL("INSERT INTO student VALUES('"+name.getText()+"','"+regnum.getText()+"','"+mob.getText()+"','"+cname.getText()+"');");
                    Log.i("Insert","*********Insertion done.***********");
                    Toast.makeText(Main3Activity.this,"Inserted",Toast.LENGTH_LONG).show();
                    name.setText("");
                    cname.setText("");
                    regnum.setText("");
                    mob.setText("");
              }

            }
        });

    }
}
