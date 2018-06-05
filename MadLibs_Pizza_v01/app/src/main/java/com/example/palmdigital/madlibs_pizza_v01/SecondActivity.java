package com.example.palmdigital.madlibs_pizza_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Button button2;
    Button next2;
    EditText adjective2;
    EditText noun2;
    EditText adjective3;
    EditText adjective4;
    String story2;
    TextView tvstory2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

        next2 = findViewById(R.id.next_button2);
        next2.setOnClickListener(this);

        adjective2 = findViewById(R.id.et_adjective2);

        noun2 = findViewById(R.id.et_noun2);

        adjective3 = findViewById(R.id.et_adjective3);

        adjective4 = findViewById(R.id.et_adjective4);

        tvstory2 = findViewById(R.id.tvStory2);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.button2)
        {
            Bundle extras = getIntent().getExtras();
            String adjective2Str = adjective2.getText().toString();
            String noun2Str = noun2.getText().toString();
            String adjective3Str = adjective3.getText().toString();
            String adjective4Str = adjective4.getText().toString();

            if(extras != null)
            {
                story2 = extras.getString("story");
            }

            story2 = story2 + " and make a thin, round " + adjective2Str + " " + noun2Str + ".";
            story2 = story2 + " Then you cover it with " + adjective3Str;
            story2 = story2 + " sauce, " + adjective4Str;
            story2 = story2 + " cheese, ";

            tvstory2.setText(story2);
        }

        else if(view.getId() == R.id.next_button2)
        {
            Intent i = new Intent(this, ThirdActivity.class);
            i.putExtra("story", story2);
            startActivity(i);
        }
    }
}
