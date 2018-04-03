package com.example.palmdigital.switch01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    public TextView tvObject1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch switchObject1 = findViewById(R.id.switch1);
        switchObject1.setOnClickListener(this);

        tvObject1 = findViewById(R.id.textView1);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.switch1)
        {
            String tvText = tvObject1.getText().toString();
            if(tvText == "ON")
                tvObject1.setText("OFF");
            else
                tvObject1.setText("ON");
        }
    }
}
