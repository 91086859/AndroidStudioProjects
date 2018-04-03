package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BackyardActivity extends AppCompatActivity implements View.OnClickListener {

    Button scream;
    Button faint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backyard);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        scream = findViewById(R.id.button_scream);
        scream.setOnClickListener(this);

        faint = findViewById(R.id.button_faint);
        faint.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.button_scream)
        {
            Intent i = getBaseContext().getPackageManager()
                    .getLaunchIntentForPackage( getBaseContext().getPackageName() );
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            finish();
        }
        else if(view.getId() == R.id.button_faint)
        {
            Intent i2 = new Intent(this, FaintActivity.class);
            startActivity(i2);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            finish();
        }
    }
}
