package com.example.yasaswi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v)
    {
        EditText t1=(EditText)findViewById(R.id.editText);
        EditText t2=(EditText)findViewById(R.id.editText2);
        TextView tv1=(TextView)findViewById(R.id.textView2);

        int num1 = Integer.parseInt(t1.getText().toString());
        int num2 = Integer.parseInt(t2.getText().toString());
        int sum = num1 + num2;
        tv1.setText(Integer.toString(sum));
        Toast.makeText(MainActivity.this,"RESLUT CALCULATED",Toast.LENGTH_LONG).show();
    }
    
    public  void click1(View v){
        EditText t1=(EditText)findViewById(R.id.editText);
        EditText t2=(EditText)findViewById(R.id.editText2);
        TextView tv1=(TextView)findViewById(R.id.textView2);

        int d1 = Integer.parseInt(t1.getText().toString());
        int d2 = Integer.parseInt(t2.getText().toString());
        int dif = d1 - d2;
        tv1.setText(Integer.toString(dif));
        Toast.makeText(MainActivity.this,"RESLUT CALCULATED",Toast.LENGTH_LONG).show();
    }

    public  void click2(View v) {
        EditText t1 = (EditText) findViewById(R.id.editText);
        EditText t2 = (EditText) findViewById(R.id.editText2);
        TextView tv1 = (TextView) findViewById(R.id.textView2);

        int m1 = Integer.parseInt(t1.getText().toString());
        int m2 = Integer.parseInt(t2.getText().toString());
        int mul = m1 * m2;
        tv1.setText(Integer.toString(mul));
        Toast.makeText(MainActivity.this, "RESLUT CALCULATED", Toast.LENGTH_LONG).show();
    }
    public  void click3(View v) {
        EditText t1 = (EditText) findViewById(R.id.editText);
        EditText t2 = (EditText) findViewById(R.id.editText2);
        TextView tv1 = (TextView) findViewById(R.id.textView2);

        float di1 = Float.parseFloat(t1.getText().toString());
        float di2 = Float.parseFloat(t2.getText().toString());
        float div = di1 / di2;
        tv1.setText(Float.toString(div));
        Toast.makeText(MainActivity.this, "RESLUT CALCULATED", Toast.LENGTH_LONG).show();
    }


}
