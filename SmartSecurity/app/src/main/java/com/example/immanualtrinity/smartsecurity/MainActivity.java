package com.example.immanualtrinity.smartsecurity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e;
    Button b;
    String txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.button1);
        e=(EditText)findViewById(R.id.editText);
        final WebView mywebview = (WebView) findViewById(R.id.webview1);
        WebSettings webSettings=mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //  mywebview.loadUrl("http://192.168.137.94:8080/flash.html");

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt=e.getText().toString();
                mywebview.loadUrl(txt);
            }
        });
    }





}
