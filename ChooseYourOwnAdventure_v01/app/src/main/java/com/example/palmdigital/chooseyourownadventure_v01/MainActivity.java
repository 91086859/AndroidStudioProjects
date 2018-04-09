package com.example.palmdigital.chooseyourownadventure_v01;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static junit.framework.Assert.assertTrue;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button startButton;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        startButton = findViewById(R.id.startbutton);
        startButton.setOnClickListener(this);

        GifImageView gifImageView = findViewById(R.id.GifImageView);
        gifImageView.setGifImageResource(R.drawable.sleeping);

        mp = MediaPlayer.create(this, R.raw.dreamharp);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.startbutton)
        {
            Intent i = new Intent(this, BeginActivity.class);
            startActivity(i);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            finish();
            mp.start();
            mp.seekTo(5000);
        }
        else if(view.getId() == R.id.button_explore)
        {
            Intent i2 = new Intent(this, ExploreActivity.class);
            startActivity(i2);
        }
    }
}
