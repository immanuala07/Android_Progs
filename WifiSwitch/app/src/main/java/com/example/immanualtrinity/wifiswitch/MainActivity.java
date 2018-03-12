package com.example.immanualtrinity.wifiswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.wifi.WifiManager;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.app.Activity;
import android.content.Context;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Switch toggle = (Switch) findViewById(R.id.switch1);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggleWiFi(true);
                    Toast.makeText(getApplicationContext(), "Wi-Fi Enabled!", Toast.LENGTH_LONG).show();
                } else {
                    toggleWiFi(false);
                    Toast.makeText(getApplicationContext(), "Wi-Fi Disabled!", Toast.LENGTH_LONG).show();
                }
            }
        });


    }

    public void toggleWiFi(boolean status) {
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        if (status == true && !wifiManager.isWifiEnabled()) {
            wifiManager.setWifiEnabled(true);
        } else if (status == false && wifiManager.isWifiEnabled()) {
            wifiManager.setWifiEnabled(false);
        }
    }



}
