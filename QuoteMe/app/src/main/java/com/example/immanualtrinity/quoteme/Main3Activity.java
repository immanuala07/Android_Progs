package com.example.immanualtrinity.quoteme;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    Button enroll;
    EditText name,mob,email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        enroll=(Button)findViewById(R.id.button);
        name=(EditText)findViewById(R.id.editText);
        mob=(EditText)findViewById(R.id.editText2);
        email=(EditText)findViewById(R.id.editText3);


        enroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String x=name.getText().toString();
                String y=mob.getText().toString();
                String z=email.getText().toString();

                if(name.length()==0 || mob.length()==0 || email.length()==0)
                {
                    Toast.makeText(Main3Activity.this, "Enter the required fields", Toast.LENGTH_SHORT).show();
                   return;
                }
                else
                {
                    SharedPreferences sharedpreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);
                    sharedpreferences.getString("name","");
                    sharedpreferences.getString("mob","");
                    sharedpreferences.getString("email","");

                    SharedPreferences.Editor ed = sharedpreferences.edit();

                    ed.putString("name",x);
                    ed.putString("mob",y);
                    ed.putString("email",z);

                    ed.apply();

                    Intent i=new Intent(Main3Activity.this,MainActivity.class);
                    startActivity(i);
                }

            }
        });
    }
}
