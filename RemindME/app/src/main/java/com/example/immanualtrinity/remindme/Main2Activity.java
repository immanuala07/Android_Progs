package com.example.immanualtrinity.remindme;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main2Activity extends AppCompatActivity {


    int count = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);

        Timer timer = new Timer ();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        // Retrieve the Layout Inflater and inflate the layout from xml
                        LayoutInflater inflater = getLayoutInflater();
                        View layout = inflater.inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.toast_layout_root));
                        // get the reference of TextView and ImageVIew from inflated layout

                        TextView toastTextView = (TextView) layout.findViewById(R.id.toastTextView);
                        ImageView toastImageView = (ImageView) layout.findViewById(R.id.toastImageView);
                        // set the text in the TextView
                        toastTextView.setText("5 Second Reminder");
                        // set the Image in the ImageView
                        toastImageView.setImageResource(R.drawable.ic_notifications_black_24dp);
                        // create a new Toast using context
                        final Toast toast = new Toast(getApplicationContext());
                       layout.setBackgroundColor(getRandomColor());
                        //layout.setBackgroundColor(Color.parseColor(String.valueOf(color)));
                        //toast.setBackgroundColor(Color.parseColor(String.valueOf(color)));
                        toast.setDuration(Toast.LENGTH_LONG); // set the duration for the Toast
                        toast.setView(layout); // set the inflated layout
                        toast.show(); // display the custom Toast
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 5000);

                    }
                });
            }
        }, 0, 5000);



    }

    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
}
