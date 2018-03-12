package com.example.immanualtrinity.alarm;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;
import android.support.v4.app.NotificationCompat;

/**
 * Created by Immanual Trinity on 06-03-2018.
 */

public class MyBroadcastReciever extends BroadcastReceiver {

    MediaPlayer mp;

    @Override
    public void onReceive(Context context, Intent intent) {

        /*
        PendingIntent contentIntent =PendingIntent.getBroadcast(context,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder builder=new NotificationCompat.Builder(context)
                .setContentText("Never Give up")
                .setContentTitle("Hello Christities..");

        NotificationManager manager=(NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(1,builder.build());
        */

        mp=MediaPlayer.create(context, R.raw.flute);
        mp.start();
        Toast.makeText(context, "Alarm....", Toast.LENGTH_LONG).show();

    }


}
