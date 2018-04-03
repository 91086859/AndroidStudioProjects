package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener {

    Button backyard;
    Button toilet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        backyard = findViewById(R.id.button_yard);
        backyard.setOnClickListener(this);

        toilet = findViewById(R.id.button_toilet);
        toilet.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.button_toilet)
        {
            Intent i = new Intent(this, ToiletActivity.class);
            startActivity(i);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            finish();
        }
        else if(view.getId() == R.id.button_yard)
        {
            Intent i2 = new Intent(this, BackyardActivity.class);
            startActivity(i2);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            finish();
        }
    }
}
