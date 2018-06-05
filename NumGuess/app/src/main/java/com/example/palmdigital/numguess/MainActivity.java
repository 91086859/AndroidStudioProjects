package com.example.palmdigital.numguess;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button proceedButton;
    EditText amtGuessesEt;
    String numGuessesStr;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        proceedButton = findViewById(R.id.btn_proceed);
        proceedButton.setOnClickListener(this);

        amtGuessesEt = findViewById(R.id.et_guessAmount);
        amtGuessesEt.setOnClickListener(this);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.btn_proceed)
        {
            numGuessesStr = amtGuessesEt.getText().toString();
            if(numGuessesStr.matches("\\d+(?:\\.\\d+)?"))
            {
                int numGuesses = Integer.parseInt(numGuessesStr);
                Intent i = new Intent(this, GameActivity.class);
                i.putExtra("guesses", numGuesses);
                startActivity(i);
            }
            else
            {
                amtGuessesEt.setText("Enter an integer!");
            }
        }
    }
}
