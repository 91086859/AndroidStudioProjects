package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WakeUpActivity extends AppCompatActivity implements View.OnClickListener {

    Button restartButton;
    GifImageView alarmGif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        restartButton = findViewById(R.id.button_restart1);
        restartButton.setOnClickListener(this);

        alarmGif = findViewById(R.id.Alarm);
        alarmGif.setGifImageResource(R.drawable.alarmclock);
    }

    public void onClick(View view)
    {
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        finish();
    }
}
