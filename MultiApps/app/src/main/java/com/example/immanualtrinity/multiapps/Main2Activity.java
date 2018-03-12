package com.example.immanualtrinity.multiapps;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b1= findViewById(R.id.button);
        Button b2= findViewById(R.id.button2);
        Button b3= findViewById(R.id.button3);
        Button b4= findViewById(R.id.button4);






        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo: 12.935656, 77.605901"));
                Intent chooser = Intent.createChooser(i, "Launch Maps");
                startActivity(chooser);    // select the app in your phone to open the location ex: google map, uber, ola ….etc
            }
        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Intent.ACTION_DIAL);
                startActivity(i);

            }
        });



        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("email"));
                String[] s={"immanual.a@mca.christuniversity.in","immanuala07@gmail.com"};
                i.putExtra(Intent.EXTRA_EMAIL,s);
                i.putExtra(Intent.EXTRA_SUBJECT,"This is a Subject");
                i.putExtra(Intent.EXTRA_TEXT,"Hi. This is the Email Body");
                i.setType("message/rfc822");    //setting MIME Email Multipurpose Internet Mail Extensions
                Intent chooser = Intent.createChooser(i,"Launch Email");
                startActivity(chooser);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.medium.com"));
                startActivity(i);

            }
        });


    }
}
