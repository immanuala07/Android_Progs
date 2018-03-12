package com.example.immanualtrinity.christdata;

import android.app.AlertDialog;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    SQLiteDatabase db;
    Button b;
    EditText e,e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        b=(Button)findViewById(R.id.update);
        e=(EditText)findViewById(R.id.edreg);
        e1=(EditText)findViewById(R.id.mobi);

        db = openOrCreateDatabase("christiteDB", Context.MODE_PRIVATE, null);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a=e.getText().toString();
                String bb=e1.getText().toString();

                if(a.isEmpty() || bb.isEmpty())
                {
                    Toast.makeText(Main6Activity.this, "Enter the required details",Toast.LENGTH_SHORT).show();
                }
                Cursor c=db.rawQuery("SELECT * FROM student WHERE regno='"+e.getText()+"'", null);
                if(c.moveToFirst())
                {
                    db.execSQL("UPDATE student SET mob='"+e1.getText()+"' WHERE regno='"+e.getText()+"'");
                    showMessage("Success", "Record Modified");
                }
                else
                {
                    showMessage("Error", "Invalid Rollno");
                }
                e.setText("");
                e1.setText("");
            }
        });

    }

    public void showMessage(String title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

}
