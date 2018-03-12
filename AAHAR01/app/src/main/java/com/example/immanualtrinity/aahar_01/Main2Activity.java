package com.example.immanualtrinity.aahar_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    CheckBox a,b,c;
    Button x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        a=(CheckBox)findViewById(R.id.checkBox);
        b=(CheckBox)findViewById(R.id.checkBox2);
        c=(CheckBox)findViewById(R.id.checkBox3);
        x=(Button)findViewById(R.id.button3);

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int totalamount=0;
                StringBuilder result=new StringBuilder();
                    result.append("Selected Items:       \n");
                if(a.isChecked()){
                    result.append("\nMixed Veg Roll 100Rs\n");
                    totalamount+=100;
                }
                if(b.isChecked()){
                    result.append("\nPanneer Roll   200Rs\n");
                    totalamount+=200;
                }
                if(c.isChecked()){
                    result.append("\nTomato Soup    300Rs\n");
                    totalamount+=300;
                }
                    result.append("\nTotal:              "+totalamount+"Rs");

                Intent intent = new Intent(Main2Activity.this, Main4Activity.class);
                intent.putExtra("rst", result.toString());
                startActivity(intent);

                //Displaying the message on the toast
                //  Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }


        });

    }
}
