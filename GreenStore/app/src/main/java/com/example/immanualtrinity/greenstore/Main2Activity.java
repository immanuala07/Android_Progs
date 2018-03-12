package com.example.immanualtrinity.greenstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b1=(Button)findViewById(R.id.button);
        Button b2=(Button)findViewById(R.id.button2);
        EditText t1=findViewById(R.id.editText);
        EditText t2=findViewById(R.id.editText2);

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

*/
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //linear
                Intent intent1 = new Intent(Main2Activity.this, Main4Activity.class);
                startActivity(intent1);
            }
        });
    }
}
