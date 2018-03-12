package com.example.immanualtrinity.christdata;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.app.AlertDialog.Builder;

public class Main5Activity extends AppCompatActivity {

    Button bdel;
    SQLiteDatabase db;
    EditText reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        bdel=(Button)findViewById(R.id.del);
        reg=(EditText)findViewById(R.id.regn);
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                db = openOrCreateDatabase("christiteDB", Context.MODE_PRIVATE, null);

                if(reg.getText().toString().trim().length()==0)
                {
                    showMessage("Error", "Please enter Rollno");
                    return;
                }
                Cursor c=db.rawQuery("SELECT * FROM student WHERE regno='"+reg.getText()+"'", null);
                if(c.moveToFirst())
                {
                    db.execSQL("DELETE FROM student WHERE regno='"+reg.getText()+"'");
                    showMessage("Success", "Record Deleted");
                }
                else
                {
                    showMessage("Error", "Invalid Rollno");
                }
                reg.setText("");
            }
        });

    }

    public void showMessage(String title,String message)
    {
        Builder builder=new Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

}
