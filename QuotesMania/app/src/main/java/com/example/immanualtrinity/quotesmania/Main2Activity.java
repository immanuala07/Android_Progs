package com.example.immanualtrinity.quotesmania;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView;
    public int images[] = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d};
    public int i=0;
    Button next,pre;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pre=(Button)findViewById(R.id.reg);
        next=(Button)findViewById(R.id.cquotes);
        imageView = (ImageView) findViewById(R.id.imageView);
        i=0;
        imageView.setBackgroundDrawable(getResources().getDrawable(images[i]));


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i<=2 && i>=0)
                {

                    imageView.setBackgroundDrawable(getResources().getDrawable(images[++i]));
                }
                else if(i>=3)
                {
                    imageView.setBackgroundDrawable(getResources().getDrawable(images[3]));
                    i=0;
                }
            }
        });

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(i<=0)
                {
                    imageView.setBackgroundDrawable(getResources().getDrawable(images[3]));
                    i=3;

                }

                if(i>=0 && i<=3)
                {
                    imageView.setBackgroundDrawable(getResources().getDrawable(images[i--]));

                }



            }
        });


    }
}
