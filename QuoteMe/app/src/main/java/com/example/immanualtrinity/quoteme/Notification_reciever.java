package com.example.immanualtrinity.quoteme;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;

import java.util.Date;

import static java.lang.Thread.sleep;

/**
 * Created by Immanual Trinity on 10-03-2018.
 */

public class Notification_reciever extends BroadcastReceiver {

    MediaPlayer mp;
    String name,tquote;
    Integer iquote;
    public static final long GET_DATA_INTERVAL = 30000;
    int index = 0,i;
    final Handler hand = new Handler();
    NotificationCompat.BigPictureStyle bpstyle;
    int img;
    int images[] = {R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b5, R.drawable.b6, R.drawable.b7};

    @Override
    public void onReceive(Context context, Intent intent) {



        NotificationManager notificationManager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        Intent reporting_intent =new Intent(context,MainActivity.class);

        reporting_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pendingIntent = PendingIntent.getActivity(context,100,reporting_intent,PendingIntent.FLAG_UPDATE_CURRENT);

        name=intent.getExtras().getString("name");
        tquote=intent.getExtras().getString("txtquote");
        iquote=intent.getExtras().getInt("imgquote");



        bpstyle=new NotificationCompat.BigPictureStyle();
        bpstyle.bigPicture(BitmapFactory.decodeResource(context.getResources(), images[iquote])).build();

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context)
                .setContentIntent(pendingIntent)
                .setSmallIcon(R.drawable.ic_notifications_black_24dp )
                .setContentTitle(name)
                .setContentText(tquote)
                .setStyle(bpstyle)
                .setAutoCancel(true);

        int m = (int) ((new Date().getTime() / 1000L) % Integer.MAX_VALUE);

        notificationManager.notify(m,builder.build());

        mp= MediaPlayer.create(context, R.raw.plucky);
        mp.start();



    }



}
