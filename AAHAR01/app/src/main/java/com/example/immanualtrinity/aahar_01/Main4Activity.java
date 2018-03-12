package com.example.immanualtrinity.aahar_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    TextView t;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        b=(Button)findViewById(R.id.button5);
        t=(TextView)findViewById(R.id.textView2);

        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        if(bd != null)
        {
            String getName = (String) bd.get("rst");
            t.setText(getName);
        }

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main4Activity.this,Main5Activity.class);
                startActivity(i);
            }
        });
    }

}
