package com.example.immanualtrinity.smgcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void tocont(View view)
    {





        Intent nxt = new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(nxt);


    }


}
