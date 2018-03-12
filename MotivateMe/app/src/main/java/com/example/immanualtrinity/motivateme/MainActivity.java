package com.example.immanualtrinity.motivateme;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;

import static android.content.Context.ALARM_SERVICE;
import static android.content.Context.ALARM_SERVICE;

public class MainActivity extends AppCompatActivity {

    Button b;
    MediaPlayer mp;
    public int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b=(Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Toast.makeText(MainActivity.this, "Noticiation is ready", Toast.LENGTH_SHORT).show();
                    Calendar calendar = Calendar.getInstance();

                    calendar.set(Calendar.HOUR_OF_DAY,10);
                    calendar.set(Calendar.MINUTE,56);
                    calendar.set(Calendar.SECOND,00);

                    Intent intent = new Intent(getApplicationContext(),Notification_reciever.class);
                    PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(),100,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                    AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
                 //   alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),alarmManager.INTERVAL_DAY,pendingIntent);

                    alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),30000,pendingIntent);



//                alarmNote();

            }
        });


    }
/*
    public void alarmNote()
    {
        Calendar calendar = Calendar.getInstance();


        calendar.set(Calendar.HOUR_OF_DAY,10);
        calendar.set(Calendar.MINUTE,58);
        calendar.set(Calendar.SECOND,00);

        Intent intent = new Intent(getApplicationContext(),Notification_reciever.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(),100,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),alarmManager.INTERVAL_DAY,pendingIntent);


    }

    */
}
