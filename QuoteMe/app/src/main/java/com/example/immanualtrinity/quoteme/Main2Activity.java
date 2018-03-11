package com.example.immanualtrinity.quoteme;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Calendar;
import android.content.SharedPreferences;

public class Main2Activity extends AppCompatActivity {

    public int qimg;
    SQLiteDatabase db;
    TextView t,quotes;
    ImageView imageView;
    int images[] = {R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b5, R.drawable.b6, R.drawable.b7};
    public static final long GET_DATA_INTERVAL = 5000;
    int index = 0;
    final Handler hand = new Handler();
    Button reg,cquotes;
    Cursor dataCount;
    int count=0,x=0;
    String message,dmsg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        quotes=(TextView)findViewById(R.id.quo);


        SharedPreferences sharedpreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);
        t=(TextView)findViewById(R.id.textView);
        t.setText("Welcome "+sharedpreferences.getString("name",""));

        reg=(Button)findViewById(R.id.reg);
        cquotes=(Button)findViewById(R.id.cquotes);



        imageView = (ImageView) findViewById(R.id.imageView);
        hand.postDelayed(run, GET_DATA_INTERVAL);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });

        cquotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(i);
            }
        });


        db = openOrCreateDatabase("quoteDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS quote(id INTEGER PRIMARY KEY AUTOINCREMENT, message VARCHAR, c INTEGER);");
        // Toast.makeText(Main2Activity.this,"Database Created",Toast.LENGTH_SHORT).show();

        count=countjournals();
        //Toast.makeText(Main2Activity.this,"Count = "+6count,Toast.LENGTH_SHORT).show();


        startAlert();
    }

    Runnable run = new Runnable() {
        @Override
        public void run() {

            imageView.setBackgroundDrawable(getResources().getDrawable(images[index++]));
            qimg=index;
            if (index == images.length || x ==count)
            {
                index = 0;
                x = 1;
            }

            Cursor cc = db.rawQuery("SELECT message FROM quote", null);
                //cc.moveToFirst();
            if(cc.getCount()>=1) {
                cc.move(x);

                try {
                    for (int i = 0; i < cc.getCount(); i++) {
                        message = cc.getString(0);
                        quotes.setText("\""+message+".\"");
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                }
                cc.close();
            }
                x++;
                        hand.postDelayed(run, GET_DATA_INTERVAL);
        }
    };

    public int countjournals() {
        dataCount = db.rawQuery("select count(*) from quote", null);
        dataCount.moveToFirst();
        int jcount = dataCount.getInt(0);
        dataCount.close();
        return jcount;
    }

    public void startAlert() {
        Toast.makeText(Main2Activity.this, "Notificiation is ready", Toast.LENGTH_SHORT).show();
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.HOUR_OF_DAY,06);
        calendar.set(Calendar.MINUTE,30);
        calendar.set(Calendar.SECOND,00);

        Intent intent = new Intent(getApplicationContext(),Notification_reciever.class);
        SharedPreferences sharedpreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);
        intent.putExtra("name", sharedpreferences.getString("name",""));
        intent.putExtra("txtquote",dmsg);
        intent.putExtra("imgquote",qimg);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(),100,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
        //   alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),alarmManager.INTERVAL_DAY,pendingIntent);

        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),30000,pendingIntent);
    }


}
