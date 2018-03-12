package com.example.immanualtrinity.musicmp3;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.*;
import android.view.View.OnTouchListener;

import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    Boolean play1 = false;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Intialize Buttons
        Button play = (Button) findViewById(R.id.button);
        Button pause = (Button) findViewById(R.id.button2);
        Button stop = (Button) findViewById(R.id.button3);
        Button volplus = (Button) findViewById(R.id.ib2);
        Button volmin = (Button) findViewById(R.id.ib1);


        //initalize media player class
        final MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.human);


        //initalize audio class
        final AudioManager am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);


        //Initialize Seekbar
    /*
        SeekBar sb = (SeekBar) findViewById(R.id.seekBar);
        sb.setMax(mp.getDuration());
*/

        //Listen on play button
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!play1) {
                    mp.start();
                    play1 = true;
                }
            }
        });


        // code to pause the music
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (play1) {
                    mp.pause();
                    play1 = false;
                }
            }
        });


        // code to stop the music
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (play1) {
                    mp.stop();
                    play1 = false;
                }
                // exit audio player class
                MainActivity.this.finish();
            }
        });

        volplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Increase Vol
                am.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            }
        });

        volmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Decrease Vol
                am.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
            }
        });

/*
        sb.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                seekToPosition(v);
                return false;
            }
        });


*/

    }
/*
    public void seekToPosition(View v) {
        if (mp.isPlaying()) {
            SeekBar sb = (SeekBar) v;
            mp.seekTo(sb.getProgress());
        }
    }
    */
}

