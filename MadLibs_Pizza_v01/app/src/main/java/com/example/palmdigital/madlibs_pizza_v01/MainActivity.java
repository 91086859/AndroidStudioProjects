package com.example.palmdigital.madlibs_pizza_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button button;
    Button next;
    EditText adjective1;
    EditText nationality;
    EditText name;
    EditText noun;
    String story;
    TextView tvstory;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(this);

        adjective1 = findViewById(R.id.et_adjective1);

        nationality = findViewById(R.id.et_nationality);

        name = findViewById(R.id.et_name);

        noun = findViewById(R.id.et_noun);

        tvstory = findViewById(R.id.tvStory);

        next = findViewById(R.id.next_button);
        next.setOnClickListener(this);
    } // end of oncreate

    public void onClick(View view)
    {
        if(view.getId() == R.id.button)
        {
            // set edittext strings
            String adjective1Str = adjective1.getText().toString();
            String nationalityStr = nationality.getText().toString();
            String nameStr = name.getText().toString();
            String nounStr = noun.getText().toString();

            //make story
            story = "Pizza was invented by a ";
            story = story + adjective1Str;
            story = story + " " + nationalityStr;
            story = story + " chef named " + nameStr + ".";
            story = story + " To make a pizza, you need to take a lump of " + nounStr + ",";

            //set textview to story
            tvstory.setText(story);
        }

        else if(view.getId() == R.id.next_button)
        {
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("story", story);
            startActivity(i);
        }
    } // end of onclick
} // end of class
