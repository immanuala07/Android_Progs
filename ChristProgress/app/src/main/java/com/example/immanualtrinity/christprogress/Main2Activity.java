package com.example.immanualtrinity.christprogress;

import android.os.*;
import android.app.*;
import android.widget.*;
import android.view.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    Button b1, b2;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog = new ProgressDialog(Main2Activity.this);
                progressDialog.setMessage("Downloading..."); // Setting Message
                progressDialog.setTitle("Please Wait"); // Setting Title
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // Progress Dialog Style Spinner
                progressDialog.show(); // Display Progress Dialog
                progressDialog.setCancelable(false);
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(5000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        progressDialog.dismiss();
                    }
                }).start();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            Handler handle = new Handler() {
                public void handleMessage(Message msg) {
                    super.handleMessage(msg);
                    progressDialog.incrementProgressBy(2); // Incremented By Value 2
                }
            };

            @Override
            public void onClick(View v) {
                progressDialog = new ProgressDialog(Main2Activity.this);
                progressDialog.setMax(100); // Progress Dialog Max Value
                progressDialog.setMessage("Downloading..."); // Setting Message
                progressDialog.setTitle("Please Wait"); // Setting Title
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL); // Progress Dialog Style Horizontal
                progressDialog.show(); // Display Progress Dialog
                progressDialog.setCancelable(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            while (progressDialog.getProgress() <= progressDialog.getMax()) {
                                Thread.sleep(200);
                                handle.sendMessage(handle.obtainMessage());
                                if (progressDialog.getProgress() == progressDialog.getMax()) {
                                    progressDialog.dismiss();
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });

    }
}
