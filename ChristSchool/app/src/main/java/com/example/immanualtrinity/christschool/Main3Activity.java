package com.example.immanualtrinity.christschool;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    TextView t;
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        t=(TextView)findViewById(R.id.text1);

      /*  if(savedInstanceState!=null)
        {
        */
        sharedpreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);
        /*
        ed.putString("name",n);
                ed.putString("mob",r);
                ed.putString("home",sub1);
                ed.putString("mob",sub2);
                ed.putString("home",sub3);
                ed.putString("home",sub4);
                ed.putFloat("percent",per);


         */

        Float per;
        per=sharedpreferences.getFloat("percent",0);

        if(per > 75)
        {

            String reply="Enter your reply here";

            Toast.makeText(Main3Activity.this, "Result on Notification", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Main3Activity.this,Main3Activity.class);
            PendingIntent contentIntent =PendingIntent.getActivity(Main3Activity.this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);


            NotificationCompat.BigPictureStyle bpstyle=new NotificationCompat.BigPictureStyle();
            bpstyle.bigPicture(BitmapFactory.decodeResource(getResources(),R.drawable.christ)).build();

            NotificationCompat.Builder builder=new NotificationCompat.Builder(Main3Activity.this)
                    .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                    .setContentTitle("Hello "+sharedpreferences.getString("name",""))
                    .setColor(101)
                    .setStyle(bpstyle)
                    .setContentText("Your Percentage is "+sharedpreferences.getFloat("percent",0)+"%.For more details refer to the website");

            builder.addAction(R.drawable.ic_reply_black_24dp,"Reply",contentIntent);
            builder.setContentIntent(contentIntent);

            NotificationManager manager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
            manager.notify(0,builder.build());

            Toast.makeText(Main3Activity.this, "Result on Notification", Toast.LENGTH_SHORT).show();



            t.setText("Marks Card for Christite\n\n"+"Name: "+sharedpreferences.getString("name","")+"\n\nRegister Number: "+sharedpreferences.getString("mob","")+"\n\nSub 1 Marks: "+sharedpreferences.getString("s1","")+"\n\nSub 2 Marks: "+sharedpreferences.getString("s2","")+"\n\nSub 3 Marks: "+sharedpreferences.getString("s3","")+"\n\nSub 4 Marks: "+sharedpreferences.getString("s4","")+"\n\nPercentage: "+sharedpreferences.getFloat("percent",0)+"%");

        }
        else if (per < 50)
        {

            String phoneNo =sharedpreferences.getString("mobile","");;

            String message = "Your child has secured less than 50% in the exam.For more details refer to the website";

            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0, intent,0);

            SmsManager sms=SmsManager.getDefault();
            sms.sendTextMessage(phoneNo, null, message, pi,null);

            Toast.makeText(getApplicationContext(), "Message Sent successfully!",Toast.LENGTH_LONG).show();


        }


        //    }

    }
}
