package com.example.palmdigital.fizzbuzz01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText numInput;
    Button generateFB;
    TextView outputFB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numInput = findViewById(R.id.et_numInput);

        generateFB = findViewById(R.id.btn_genFizzBuzz);
        generateFB.setOnClickListener(this);

        outputFB = findViewById(R.id.tv_fizzBuzzOutput);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.btn_genFizzBuzz)
        {
            String strNums = numInput.getText().toString();
            int nums = Integer.parseInt(strNums);
            String FBStr = "";
            if(nums <= 20 && nums >= 1)
            {
                for (int i = 1  ; i < nums + 1; i++)
                {
                    if (i % 15 == 0)
                    {
                        FBStr += "FizzBuzz ";
                    }
                    else if (i % 3 == 0)
                    {
                        FBStr += "Fizz ";
                    }
                    else if (i % 5 == 0)
                    {
                        FBStr += "Buzz ";
                    }
                    else
                    {
                        FBStr += i + " ";
                    }
                    outputFB.setText(FBStr);
                }
            }
            else
            {
                String warningStr = "Please put a number greater than 0 and less than or equal to 20!";
                outputFB.setText(warningStr);
            }
        }
    }
}
