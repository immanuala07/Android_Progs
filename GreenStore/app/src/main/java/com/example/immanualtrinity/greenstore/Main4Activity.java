package com.example.immanualtrinity.greenstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.*;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button b1=(Button)findViewById(R.id.button);
        EditText t1=findViewById(R.id.editText);
        EditText t2=findViewById(R.id.editText2);
        EditText t3=findViewById(R.id.editText3);
        EditText t4=findViewById(R.id.editText4);
        Spinner spinner=findViewById(R.id.spinner);



/*
        if(t1.getText().toString().length()==0)
        {
            t1.setError("Name is blank");
            return;
        }

        if(t2.getText().length()==0)
        {
            t2.setError("Mobile Number is blank");
            return;
        }

        if(t3.getText().toString().length()==0)
        {
            t1.setError("Name is blank");
            return;
        }

        if(t4.getText().length()==0)
        {
            t2.setError("Mobile Number is blank");
            return;
        }

        String EventList=String.valueOf(spinner.getSelectedItem());
        if(EventList.equals("Choose a Product"))
        {
            Toast.makeText(getApplicationContext(),"Please Select the Product Category",Toast.LENGTH_SHORT).show();
            return;
        }

*/
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //
                Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(intent);
            }
        });

    }
}
