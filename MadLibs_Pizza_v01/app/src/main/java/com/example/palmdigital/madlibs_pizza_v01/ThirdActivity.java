package com.example.palmdigital.madlibs_pizza_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    Button button3;
    Button next3;
    EditText pluralNoun;
    EditText noun3;
    EditText number;
    EditText shape;
    String story3;
    TextView tvstory3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);

        next3 = findViewById(R.id.next_button3);
        next3.setOnClickListener(this);

        pluralNoun = findViewById(R.id.et_plural_noun);

        noun3 = findViewById(R.id.et_noun3);

        number = findViewById(R.id.et_number);

        shape = findViewById(R.id.et_shape);

        tvstory3 = findViewById(R.id.tvStory3);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.button3)
        {
            Bundle extras = getIntent().getExtras();
            String pluralNounStr = pluralNoun.getText().toString();
            String noun3Str = noun3.getText().toString();
            String numberStr = number.getText().toString();
            String shapeStr = shape.getText().toString();

            if(extras != null)
            {
                story3 = extras.getString("story");
            }

            story3 = story3 + " and fresh chopped " + pluralNounStr + ".";
            story3 = story3 + " Next you have to bake it in a very hot " + noun3Str + ".";
            story3 = story3 + " When it is done, cut it into " + numberStr + " " + shapeStr + ".";

            tvstory3.setText(story3);
        }

        else if(view.getId() == R.id.next_button3)
        {
            Intent i = new Intent(this, FourthActivity.class);
            i.putExtra("story", story3);
            startActivity(i);
        }
    }
}
