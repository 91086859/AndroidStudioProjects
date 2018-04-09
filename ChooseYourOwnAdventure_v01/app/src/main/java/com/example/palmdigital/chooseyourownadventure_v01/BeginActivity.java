package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class BeginActivity extends AppCompatActivity implements View.OnClickListener {
    Button wakeup;
    Button explore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        wakeup = findViewById(R.id.button_wake);
        wakeup.setOnClickListener(this);

        explore = findViewById(R.id.button_explore);
        explore.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.button_wake)
        {
            Intent i = new Intent(this, WakeUpActivity.class);
            startActivity(i);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            finish();
        }
        else if(view.getId() == R.id.button_explore)
        {
            Intent i2 = new Intent(this, ExploreActivity.class);
            startActivity(i2);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            finish();
        }
    }
}
