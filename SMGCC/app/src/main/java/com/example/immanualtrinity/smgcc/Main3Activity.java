package com.example.immanualtrinity.smgcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void todecide(View view)
    {
        Spinner spinner=findViewById(R.id.spinner4);
        String EventList=String.valueOf(spinner.getSelectedItem());
        if(EventList.equals("Batting"))
        {
            Intent nxt = new Intent(Main3Activity.this,Main4Activity.class);
            startActivity(nxt);
        }
        else
        {
            Intent nxt = new Intent(Main3Activity.this,Main5Activity.class);
            startActivity(nxt);
        }






    }
}
