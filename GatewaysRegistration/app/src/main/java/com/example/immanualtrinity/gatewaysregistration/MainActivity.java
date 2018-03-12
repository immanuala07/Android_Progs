package com.example.immanualtrinity.gatewaysregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ToProceed(View v)
    {

        EditText t1=findViewById(R.id.t1);
        EditText t2=findViewById(R.id.t2);
        EditText t3=findViewById(R.id.t3);
        EditText t4=findViewById(R.id.t4);
        EditText t5=findViewById(R.id.t5);
        EditText t6=findViewById(R.id.t6);
        Spinner spinner=findViewById(R.id.spinner);
        RadioGroup radiogroup1 =findViewById(R.id.radioGroup1);
        RadioGroup radiogroup =findViewById(R.id.radioGroup);

        if(t1.getText().toString().length()==0)
        {
            t1.setError("Name is blank");
            return;
        }

        if(radiogroup1.getCheckedRadioButtonId()==-1)
        {
            Toast.makeText(getApplicationContext(),"Select the Gender",Toast.LENGTH_SHORT).show();
            return;
        }

        if(t2.getText().length()==0)
        {
            t2.setError("Mobile Number is blank");
            return;
        }

        if(t3.getText().toString().length()==0)
        {
            t3.setError("Address is blank");
            return;
        }

        if(radiogroup.getCheckedRadioButtonId()==-1)
        {
            Toast.makeText(getApplicationContext(),"Select the Food",Toast.LENGTH_SHORT).show();
            return;
        }

        if(t4.getText().length()==0)
        {
            t4.setError("Email is blank");
            return;
        }

        if(t5.getText().length()==0)
        {
            t5.setError("Password is blank");
            return;
        }

        if(t6.getText().toString().length()==0)
        {
            t6.setError("College Name is blank");
            return;
        }



        String EventList=String.valueOf(spinner.getSelectedItem());
        if(EventList.equals("Choose a Event"))
        {
            Toast.makeText(getApplicationContext(),"Please Select the Event",Toast.LENGTH_SHORT).show();
            return;
        }



        Intent nxt = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(nxt);



    }

}
