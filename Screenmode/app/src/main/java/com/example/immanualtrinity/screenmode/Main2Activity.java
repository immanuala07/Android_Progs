package com.example.immanualtrinity.screenmode;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.*;
import android.widget.TextView;
import android.widget.*;

public class Main2Activity extends AppCompatActivity {

    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tView=(TextView)findViewById(R.id.txt1);
        Intent i = getIntent();

        String txt11=i.getStringExtra("fname");
        String txt2=i.getStringExtra("lname");

        tView.setText(txt11+" "+txt2);

    }

    public void cToast(View v)
    {
        LayoutInflater li=getLayoutInflater();
        View layout=li.inflate(R.layout.customlayout,(ViewGroup)findViewById(R.id.toastlayout));

        Toast toast=new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setView(layout);
        toast.show();

        /*
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custom_toast_layout_id));

        // set a message
        TextView text = (TextView) layout.findViewById(R.id.message);
        text.setText("Hi, Immanual Trinity..!");

        // Toast...
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();


        Toast toast=Toast.makeText(this,"Hi, Immanual Trinity",Toast.LENGTH_LONG);
        View toastView = toast.getView();
        TextView toastMessage =(TextView) toastView.findViewById(R.id.message);
        toastMessage.setTextSize(25);
        toastMessage.setTextColor(Color.RED);
        toastMessage.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_face_black_24dp,0,0,0);
        toastMessage.setGravity(Gravity.CENTER);
        toastMessage.setCompoundDrawablePadding(16);
        toastView.setBackgroundColor(Color.CYAN);
        toast.show();
*/
    }


}
