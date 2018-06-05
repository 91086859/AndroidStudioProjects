package com.example.palmdigital.madlibs_pizza_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity implements View.OnClickListener {
    Button button4;
    EditText food1;
    EditText food2;
    EditText number2;
    String story4;
    TextView tvstory4;
    ImageView masahiro;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);

        food1 = findViewById(R.id.et_food1);

        food2 = findViewById(R.id.et_food2);

        number2 = findViewById(R.id.et_number2);

        tvstory4 = findViewById(R.id.tvStory4);

        masahiro = findViewById(R.id.masahiro);
        masahiro.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.button4)
        {
            Bundle extras = getIntent().getExtras();
            String food1Str = food1.getText().toString();
            String food2Str = food2.getText().toString();
            String number2Str = number2.getText().toString();

            if(extras != null)
            {
                story4 = extras.getString("story");
            }

            story4 = story4 + " Some kids like " + food1Str + " pizza the best, but my favorite is the ";
            story4 = story4 + food2Str + " pizza. If I could, I would eat pizza ";
            story4 = story4 + number2Str + " times a day!";

            tvstory4.setText(story4);
        }

        else if(view.getId() == R.id.masahiro)
        {
            masahiro.setImageResource(R.drawable.masahiro);
        }
    }
}
