package com.example.palmdigital.multibuttons01;

import android.support.v4.graphics.ColorUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView tvObject01;
    public Button buttonObjectBlue;
    public Button buttonObjectGreen;
    public Button buttonObjectRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //objects
        tvObject01 = (TextView) findViewById(R.id.textView1);
        buttonObjectBlue = (Button) findViewById(R.id.buttonBlue);
        buttonObjectGreen = (Button) findViewById(R.id.buttonGreen);
        buttonObjectRed = (Button) findViewById(R.id.buttonRed);
        //listeners
        buttonObjectBlue.setOnClickListener(this);
        buttonObjectGreen.setOnClickListener(this);
        buttonObjectRed.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonBlue)
        {
            setColor(0xff0000ff, "Text background is now blue! Changed the text color to red too", 0xffff0000);
        }
        else if(view.getId() == R.id.buttonGreen)
        {
            setColor(0xff00ff00, "Text background is now green! Changed the text color to blue too", 0xff0000ff);
        }
        else
        {
            setColor(0xffff0000, "Text background is now red! Changed the text color to green too", 0xff00ff00);
        }
    }

    public void setColor(int hexCode, String textDisplay, int textColor)
    {
        tvObject01.setBackgroundColor(hexCode);
        tvObject01.setText(textDisplay);
        tvObject01.setTextColor(textColor);
    }

}
