package com.example.immanualtrinity.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addr(View v){
// creating the instances
        EditText t1=(EditText)findViewById(R.id.t1);
        EditText t2=(EditText)findViewById(R.id.t2);
        TextView tv1=(TextView)findViewById(R.id.result);

// storing the values entered by the user in the text boxes
        int num1 = Integer.parseInt(t1.getText().toString());
        int num2 = Integer.parseInt(t2.getText().toString());
        int sum = num1 + num2;
        tv1.setText(Integer.toString(sum));


// Displaying the custom message
        Toast.makeText(MainActivity.this,"Addition",1000).show();
    }

    public void subr(View v){
// creating the instances
        EditText t1=(EditText)findViewById(R.id.t1);
        EditText t2=(EditText)findViewById(R.id.t2);
        TextView tv1=(TextView)findViewById(R.id.result);

// storing the values entered by the user in the text boxes
        int num1 = Integer.parseInt(t1.getText().toString());
        int num2 = Integer.parseInt(t2.getText().toString());
        int sum = num1 - num2;
        tv1.setText(Integer.toString(sum));


// Displaying the custom message
        Toast.makeText(MainActivity.this,"Substraction",1000).show();
    }

    public void divr(View v){
// creating the instances
        EditText t1=(EditText)findViewById(R.id.t1);
        EditText t2=(EditText)findViewById(R.id.t2);
        TextView tv1=(TextView)findViewById(R.id.result);

// storing the values entered by the user in the text boxes
        Float num1 = Float.parseFloat(t1.getText().toString());
        Float num2 = Float.parseFloat(t2.getText().toString());
        Float sum = num1 / num2;
        tv1.setText(Float.toString(sum));


// Displaying the custom message
        Toast.makeText(MainActivity.this,"Division",1000).show();
    }

    public void mult(View v){
// creating the instances
        EditText t1=(EditText)findViewById(R.id.t1);
        EditText t2=(EditText)findViewById(R.id.t2);
        TextView tv1=(TextView)findViewById(R.id.result);

// storing the values entered by the user in the text boxes
        int num1 = Integer.parseInt(t1.getText().toString());
        int num2 = Integer.parseInt(t2.getText().toString());
        int sum = num1 * num2;
        tv1.setText(Integer.toString(sum));


// Displaying the custom message
        Toast.makeText(MainActivity.this,"Multiplication",1000).show();
    }

    public void cls(View v)
    {
        ((EditText) findViewById(R.id.t1)).setText("");
        ((EditText) findViewById(R.id.t2)).setText("");
        ((TextView)findViewById(R.id.result)).setText("Result");
        Toast.makeText(MainActivity.this,"EditText Cleared",1000).show();
    }
}
