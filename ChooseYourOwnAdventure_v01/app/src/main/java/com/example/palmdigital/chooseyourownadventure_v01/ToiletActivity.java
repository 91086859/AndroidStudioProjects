package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToiletActivity extends AppCompatActivity implements View.OnClickListener {

    Button yes;
    Button heckyes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        yes = findViewById(R.id.button_yes);
        yes.setOnClickListener(this);

        heckyes = findViewById(R.id.button_heckyes);
        heckyes.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.button_yes || view.getId() == R.id.button_heckyes)
        {
            Intent i = new Intent(this, NinjaTurtleActivity.class);
            startActivity(i);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            finish();
        }
    }
}
