package com.example.immanualtrinity.screenmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity  implements OnClickListener {

    EditText text2,text1;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         text1 = (EditText) findViewById(R.id.editView);
         text2 = (EditText) findViewById(R.id.editView2);
        btnSubmit = (Button) findViewById(R.id.button);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        i.putExtra("fname", text1.getText().toString());
        i.putExtra("lname", text2.getText().toString());
        startActivity(i);
    }
}
