package com.example.immanualtrinity.christnotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.app.RemoteInput;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String KEY_REPLY = "key_reply";
    Button b,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewSimpleNote();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewSimpleNoteIcon();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewSimpleNoteImage();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewSimpleNoteAction();
            }
        });
    }

    public void viewSimpleNote()
    {
        Toast.makeText(this, "Simple Notification", Toast.LENGTH_SHORT).show();

        NotificationCompat.Builder builder=new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                .setContentTitle("Hello Christities..");

        Intent intent = new Intent(this,MainActivity.class);
        PendingIntent contentIntent =PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationManager manager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0,builder.build());

        /*
        NotificationManager manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        Notification notification=new Notification.Builder(getApplicationContext())
                .setContentText("CHRIST (Deemed to be University) is a nurturing ground for an individual's holistic development to make effective contribution to the society in a dynamic environment.").build();


        notification.flags=Notification.FLAG_AUTO_CANCEL;
        manager.notify(0,notification);
        */
    }

    public void viewSimpleNoteIcon()
    {

        Toast.makeText(this, "Notification With ICON & TEXT", Toast.LENGTH_SHORT).show();

        NotificationCompat.Builder builder=new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                .setContentTitle("Hello Christities..")
                .setColor(101)
                .setContentText("CHRIST (Deemed to be University) is a nurturing ground for an individual's holistic development to make effective contribution to the society in a dynamic environment.");

        Intent intent = new Intent(this,MainActivity.class);
        PendingIntent contentIntent =PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationManager manager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0,builder.build());
    }


    public void viewSimpleNoteImage()
    {
        Toast.makeText(this, "Notification With IMAGE", Toast.LENGTH_SHORT).show();

        NotificationCompat.BigPictureStyle bpstyle=new NotificationCompat.BigPictureStyle();
        bpstyle.bigPicture(BitmapFactory.decodeResource(getResources(),R.drawable.christ)).build();
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                .setContentTitle("Hello Christities..")
                .setColor(101)
                .setContentText("CHRIST (Deemed to be University) is a nurturing ground for an individual's holistic development to make effective contribution to the society in a dynamic environment.")
                .setStyle(bpstyle);

        Intent intent = new Intent(this,MainActivity.class);
        PendingIntent contentIntent =PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationManager manager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(1,builder.build());
    }

    public void viewSimpleNoteAction()
    {
        String reply="Enter your reply here";

        Toast.makeText(this, "Notification With REPLY option", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,Main3Activity.class);
        PendingIntent contentIntent =PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);


            NotificationCompat.Builder builder=new NotificationCompat.Builder(this)
                    .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                    .setContentTitle("Hello Christities..")
                    .setColor(101)
                    .setContentText("CHRIST (Deemed to be University) is a nurturing ground for an individual's holistic development to make effective contribution to the society in a dynamic environment.");

        builder.addAction(R.drawable.ic_reply_black_24dp,"Reply",contentIntent);
        builder.setContentIntent(contentIntent);

            NotificationManager manager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
            manager.notify(0,builder.build());

    }
}
