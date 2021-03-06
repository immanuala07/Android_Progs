package com.example.immanualtrinity.imagedb;

import android.Manifest;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main2Activity extends AppCompatActivity {

    SQLiteDatabase db;
    Button choose,upload;
    EditText e;
    ImageView imageView;

    final int REQUEST_CODE_GALLERY=999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        e=(EditText)findViewById(R.id.editText);
        imageView=(ImageView)findViewById(R.id.imageView);
        choose=(Button)findViewById(R.id.choose);
        upload=(Button)findViewById(R.id.upload);

        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCompat.requestPermissions(Main2Activity.this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},REQUEST_CODE_GALLERY);

            }
        });

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                db=openOrCreateDatabase("imageDB", Context.MODE_PRIVATE,null);
                db.execSQL("INSERT INTO quo (name,img,counter) VALUES('"+e.getText().toString()+"','"+regnum.getText()+"','"+mob.getText()+"','"+cname.getText()+"');");
                Log.i("Insert","*********Insertion done.***********");
                Toast.makeText(Main3Activity.this,"Inserted",Toast.LENGTH_LONG).show();
                e.setText("");



            }
        });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode==REQUEST_CODE_GALLERY)
        {
            if(grantResults.length>0 && grantResults[0]== PackageManager.PERMISSION_GRANTED)
            {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent,REQUEST_CODE_GALLERY);
            }
            else
            {
                Toast.makeText(this, "You dont have permission to access file location", Toast.LENGTH_SHORT).show();
            }
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==REQUEST_CODE_GALLERY && resultCode == RESULT_OK && data !=null)
        {
            Uri uri = data.getData();

            try {
                InputStream inputStream=getContentResolver().openInputStream(uri);
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                imageView.setImageBitmap(bitmap);


            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }



}
