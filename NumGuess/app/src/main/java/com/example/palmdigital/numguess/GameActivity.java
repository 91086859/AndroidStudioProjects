package com.example.palmdigital.numguess;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    EditText guessInput;
    Button checkButton;
    TextView rateText;
    int numGuesses;
    String guessStr;
    int guess;
    Random rand = new Random();
    int answer = rand.nextInt(100) + 1;
    int numTries;
    Button retryButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        guessInput = findViewById(R.id.et_numGuess);

        checkButton = findViewById(R.id.btn_checkGuess);
        checkButton.setOnClickListener(this);

        rateText = findViewById(R.id.tv_guessRating);

        retryButton = findViewById(R.id.btn_retry);
        retryButton.setVisibility(View.INVISIBLE);
        retryButton.setOnClickListener(this);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Bundle extras = getIntent().getExtras();

        if(extras != null)
        {
            numGuesses = extras.getInt("guesses");
        }
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.btn_checkGuess)
        {
                String answerStr = String.valueOf(answer);
                Log.i("info", answerStr);
                int upperRange = 100;
                guessStr = guessInput.getText().toString();
                guess = Integer.parseInt(guessStr);
                numGuesses--;
                numTries++;
                if(guessStr.matches("\\d+(?:\\.\\d+)?")) {
                    if (guess == answer) {
                        rateText.setText("You got the answer, " + answer + ", in " + numTries + " tries! Press 'RETRY' if you want to play again.");
                        retryButton.setVisibility(View.VISIBLE);
                    } else if (guess > answer) {
                        rateText.setText("Too high! " + numGuesses + " guesses left!");
                    } else if (guess < answer) {
                        rateText.setText("Too low! " + numGuesses + " guesses left!");
                    }
                    if (numGuesses <= 0) {
                        rateText.setText("You ran out of attempts (rip). The answer was " + answer + "! Press 'RETRY' if you want to play again.");
                        retryButton.setVisibility(View.VISIBLE);
                    }
                }
            else
            {
                guessInput.setText("Enter an integer!");
            }
        }
        else if(view.getId() == R.id.btn_retry)
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
