package com.example.palmdigital.buttonchallenge01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button buttonObject01;
    public Button buttonObject02;
    public Button buttonObject03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find id and add listeners
        buttonObject01 = findViewById(R.id.button1);
        buttonObject01.setOnClickListener(this);
        buttonObject02 = findViewById(R.id.button2);
        buttonObject02.setOnClickListener(this);
        buttonObject03 = findViewById(R.id.button3);
        buttonObject03.setOnClickListener(this);

        //set text and color
        buttonObject01.setText("Contacts");
        buttonObject01.setBackgroundColor(0xffff0000);
        buttonObject02.setText("Email");
        buttonObject02.setBackgroundColor(0xff00ff00);
        buttonObject03.setText("Messages");
        buttonObject03.setBackgroundColor(0xff0000ff);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.button1)
        {
            Toast.makeText(this, "You selected Contacts!", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected Contacts!");
        }
        else if(view.getId() == R.id.button2)
        {
            Toast.makeText(this, "You selected Email!", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected Email!");
        }
        else
        {
            Toast.makeText(this, "You selected Messages!", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected Messages!");
        }
    }
}
