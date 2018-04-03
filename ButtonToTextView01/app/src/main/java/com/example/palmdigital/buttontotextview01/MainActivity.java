package com.example.palmdigital.buttontotextview01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonObject1 = (Button) findViewById(R.id.button01);
    }

    public void onClick(View view)
    {
        TextView tvObject1 = (TextView) findViewById(R.id.textview01);
        String status = tvObject1.getText().toString();
        if(status == "ON") {
            tvObject1.setText("OFF");
        }
        else {
            tvObject1.setText("ON");
        }
    }
}
