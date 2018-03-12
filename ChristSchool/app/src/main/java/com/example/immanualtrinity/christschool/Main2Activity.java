package com.example.immanualtrinity.christschool;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText name,reg,s1,s2,s3,s4,m;
    Button insert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        insert=(Button)findViewById(R.id.insert1);
        name=(EditText)findViewById(R.id.name);
        reg=(EditText)findViewById(R.id.reg);
        s1=(EditText)findViewById(R.id.sub1);
        s2=(EditText)findViewById(R.id.sub2);
        s3=(EditText)findViewById(R.id.sub3);
        s4=(EditText)findViewById(R.id.sub4);
        m=(EditText)findViewById(R.id.mob);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=name.getText().toString();
                String r=reg.getText().toString();
                String sub1=s1.getText().toString();
                String sub2=s2.getText().toString();
                String sub3=s3.getText().toString();
                String sub4=s4.getText().toString();
                String mob=m.getText().toString();

                Float su1=Float.parseFloat(sub1);
                Float su2=Float.parseFloat(sub2);
                Float su3=Float.parseFloat(sub3);
                Float su4=Float.parseFloat(sub4);
                Float per=(((su1+su2+su3+su4)*100)/400);

                SharedPreferences sharedpreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);
                sharedpreferences.getString("name","");
                sharedpreferences.getString("reg","");
                sharedpreferences.getString("s1","");
                sharedpreferences.getString("s2","");
                sharedpreferences.getString("s3","");
                sharedpreferences.getString("s4","");
                sharedpreferences.getString("per","");
                sharedpreferences.getString("mob","");

                SharedPreferences.Editor ed = sharedpreferences.edit();


                ed.putString("name",n);
                ed.putString("mob",r);
                ed.putString("s1",sub1);
                ed.putString("s2",sub2);
                ed.putString("s3",sub3);
                ed.putString("s4",sub4);
                ed.putFloat("percent",per);
                ed.putString("mobile",mob);


                ed.apply();
                // or
                //  ed.commit();



                    Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(i);


            }
        });


    }

}
