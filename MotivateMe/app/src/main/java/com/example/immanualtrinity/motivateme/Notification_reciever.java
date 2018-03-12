package com.example.immanualtrinity.motivateme;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v4.app.NotificationCompat;

import java.util.Date;
import java.util.Random;

/**
 * Created by Immanual Trinity on 07-03-2018.
 */

public class Notification_reciever extends BroadcastReceiver {

    MediaPlayer mp;

    @Override
    public void onReceive(Context context, Intent intent) {

        NotificationManager notificationManager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        Intent reporting_intent =new Intent(context,Main2Activity.class);

        reporting_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pendingIntent = PendingIntent.getActivity(context,100,reporting_intent,PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context)
                .setContentIntent(pendingIntent)
                .setSmallIcon(R.drawable.ic_notifications_black_24dp )
                .setContentTitle("Notification Title")
                .setContentText("Notification Text")
                .setAutoCancel(true);

        int m = (int) ((new Date().getTime() / 1000L) % Integer.MAX_VALUE);

        notificationManager.notify(m,builder.build());

        mp= MediaPlayer.create(context, R.raw.plucky);
        mp.start();

    }
}
