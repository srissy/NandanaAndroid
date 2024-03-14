package com.example.playaudiofile;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button playbtn, stopbtn;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playbtn = findViewById(R.id.play);
        stopbtn = findViewById(R.id.stop);
        mp= MediaPlayer.create(getApplicationContext(),R.raw.myfile);
//        mp = MediaPlayer.create(getApplicationContext(),R.raw.myfile);
        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                Toast.makeText(getBaseContext(), "Music is playing, Connect Ear Phone to Listen the Ringtone", Toast.LENGTH_SHORT).show();
            }
        });
        stopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
            }
        });
    }
}
