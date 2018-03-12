package com.example.immanualtrinity.christdata;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.app.AlertDialog.Builder;


public class Main4Activity extends AppCompatActivity {

    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        db = openOrCreateDatabase("christiteDB", Context.MODE_PRIVATE, null);

        Cursor c = db.rawQuery("SELECT * FROM student", null);
        if (c.getCount() == 0) {
            Toast.makeText(Main4Activity.this, "Error - No records found", Toast.LENGTH_SHORT).show();
            return;
        }
        StringBuffer buffer = new StringBuffer();
        while (c.moveToNext()) {

            buffer.append("Name: " + c.getString(0) + "\n");
            buffer.append("Regno: " + c.getString(1) + "\n");
            buffer.append("Mobno: " + c.getString(2) + "\n");
            buffer.append("Course: " + c.getString(3) + "\n\n");
        }
        showMessage("Student Details", buffer.toString());
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
