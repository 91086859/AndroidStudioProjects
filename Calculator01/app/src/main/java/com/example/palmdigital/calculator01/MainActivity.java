package com.example.palmdigital.calculator01;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String numberOneStr = "0";
    String numberTwoStr = "0";
    int numCount = 1;
    long result = 0;
    BigInteger resultBig = BigInteger.valueOf(result);
    double resultDub;
    ImageButton add;
    ImageButton sub;
    ImageButton mult;
    ImageButton equals;
    ImageButton backspace;
    ImageButton div;
    ImageButton expnt;
    ImageButton sqrt;
    TextView additionResult;
    TextView input;
    String unit = "";
    long numberOne;
    long numberTwo;
    double numberOneDub;
    double numberTwoDub;
    String resultStr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //find view by id & set listeners
        ImageButton numberOne = findViewById(R.id.numberone);
        numberOne.setOnClickListener(this);

        ImageButton numberTwo = findViewById(R.id.numbertwo);
        numberTwo.setOnClickListener(this);

        ImageButton numberThree = findViewById(R.id.numberthree);
        numberThree.setOnClickListener(this);

        ImageButton numberFour = findViewById(R.id.numberfour);
        numberFour.setOnClickListener(this);

        ImageButton numberFive = findViewById(R.id.numberfive);
        numberFive.setOnClickListener(this);

        ImageButton numberSix = findViewById(R.id.numbersix);
        numberSix.setOnClickListener(this);

        ImageButton numberSeven = findViewById(R.id.numberseven);
        numberSeven.setOnClickListener(this);

        ImageButton numberEight = findViewById(R.id.numbereight);
        numberEight.setOnClickListener(this);

        ImageButton numberNoine = findViewById(R.id.numbernoine);
        numberNoine.setOnClickListener(this);

        ImageButton numberZero = findViewById(R.id.numberzero);
        numberZero.setOnClickListener(this);

        add = findViewById(R.id.unitadd);
        add.setOnClickListener(this);

        sub = findViewById(R.id.unitsub);
        sub.setOnClickListener(this);

        mult = findViewById(R.id.unitmult);
        mult.setOnClickListener(this);

        div = findViewById(R.id.unitdiv);
        div.setOnClickListener(this);

        expnt = findViewById(R.id.unitexpnt);
        expnt.setOnClickListener(this);

        sqrt = findViewById(R.id.unitsqrt);
        sqrt.setOnClickListener(this);

        equals = findViewById(R.id.equals);
        equals.setOnClickListener(this);

        backspace = findViewById(R.id.unitbackspace);
        backspace.setOnClickListener(this);

        ImageButton clearstuff = findViewById(R.id.clear);
        clearstuff.setOnClickListener(this);

        additionResult = findViewById(R.id.result);

        input = findViewById(R.id.input);
    }

    @Override
    public void onClick(View view)
    {

        //if statements to update display
        if(view.getId() == R.id.numberone)
        {
            if(numCount == 1)
            {
                numberOneStr += (new StringBuilder()).append("1").toString();
            }
            else if(numCount == 2)
            {
                numberTwoStr += (new StringBuilder()).append("1").toString();
            }
        }

        else if(view.getId() == R.id.numbertwo)
        {
            if(numCount == 1)
            {
                numberOneStr += (new StringBuilder()).append("2").toString();
            }
            if(numCount == 2)
            {
                numberTwoStr += (new StringBuilder()).append("2").toString();
            }
        }

        else if(view.getId() == R.id.numberthree)
        {
            if(numCount == 1)
            {
                numberOneStr += (new StringBuilder()).append("3").toString();
            }
            else if(numCount == 2)
            {
                numberTwoStr += (new StringBuilder()).append("3").toString();
            }
        }

        else if(view.getId() == R.id.numberfour)
        {
            if(numCount == 1)
            {
                numberOneStr += (new StringBuilder()).append("4").toString();
            }
            else if(numCount == 2)
            {
                numberTwoStr += (new StringBuilder()).append("4").toString();
            }
        }

        else if(view.getId() == R.id.numberfive)
        {
            if(numCount == 1)
            {
                numberOneStr += (new StringBuilder()).append("5").toString();
            }
            else if(numCount == 2)
            {
                numberTwoStr += (new StringBuilder()).append("5").toString();
            }
        }

        else if(view.getId() == R.id.numbersix)
        {
            if(numCount == 1)
            {
                numberOneStr += (new StringBuilder()).append("6").toString();
            }
            else if(numCount == 2)
            {
                numberTwoStr += (new StringBuilder()).append("6").toString();
            }
        }

        else if(view.getId() == R.id.numberseven)
        {
            if(numCount == 1)
            {
                numberOneStr += (new StringBuilder()).append("7").toString();
            }
            else if(numCount == 2)
            {
                numberTwoStr += (new StringBuilder()).append("7").toString();
            }
        }

        else if(view.getId() == R.id.numbereight)
        {
            if(numCount == 1)
            {
                numberOneStr += (new StringBuilder()).append("8").toString();
            }
            else if(numCount == 2)
            {
                numberTwoStr += (new StringBuilder()).append("8").toString();
            }
        }

        else if(view.getId() == R.id.numbernoine)
        {
            if(numCount == 1)
            {
                numberOneStr += (new StringBuilder()).append("9").toString();
            }
            else if(numCount == 2)
            {
                numberTwoStr += (new StringBuilder()).append("9").toString();
            }
        }

        else if(view.getId() == R.id.numberzero)
        {
            if(numCount == 1)
            {
                numberOneStr += (new StringBuilder()).append("0").toString();
            }
            else if(numCount == 2)
            {
                numberTwoStr += (new StringBuilder()).append("0").toString();
            }
        }

        numberOne = Long.parseLong(numberOneStr);
        numberTwo = Long.parseLong(numberTwoStr);
        numberOneDub = Double.parseDouble(numberOneStr);
        numberTwoDub = Double.parseDouble(numberTwoStr);
        resultStr = String.valueOf(result);

        if(view.getId() == R.id.unitadd)
        {
            unit = "add";
            add.setBackgroundColor(0xffff0000);
            sub.setBackgroundColor(0x00000000);
            mult.setBackgroundColor(0x00000000);
            div.setBackgroundColor(0x00000000);
            expnt.setBackgroundColor(0x00000000);
            sqrt.setBackgroundColor(0x00000000);
        }

        else if(view.getId() == R.id.unitsub)
        {
            unit = "sub";
            add.setBackgroundColor(0x00000000);
            sub.setBackgroundColor(0xffff0000);
            mult.setBackgroundColor(0x00000000);
            div.setBackgroundColor(0x00000000);
            expnt.setBackgroundColor(0x00000000);
            sqrt.setBackgroundColor(0x00000000);
        }

        else if(view.getId() == R.id.unitmult)
        {
            unit = "mult";
            add.setBackgroundColor(0x00000000);
            sub.setBackgroundColor(0x00000000);
            mult.setBackgroundColor(0xffff0000);
            div.setBackgroundColor(0x00000000);
            expnt.setBackgroundColor(0x00000000);
            sqrt.setBackgroundColor(0x00000000);
        }

        else if(view.getId() == R.id.unitdiv)
        {
            unit = "div";
            add.setBackgroundColor(0x00000000);
            sub.setBackgroundColor(0x00000000);
            mult.setBackgroundColor(0x00000000);
            div.setBackgroundColor(0xffff0000);
            expnt.setBackgroundColor(0x00000000);
            sqrt.setBackgroundColor(0x00000000);
        }

        else if(view.getId() == R.id.unitexpnt)
        {
            unit = "expnt";
            add.setBackgroundColor(0x00000000);
            sub.setBackgroundColor(0x00000000);
            mult.setBackgroundColor(0x00000000);
            div.setBackgroundColor(0x00000000);
            expnt.setBackgroundColor(0xffff0000);
            sqrt.setBackgroundColor(0x00000000);
        }

        else if(view.getId() == R.id.unitsqrt)
        {
            unit = "sqrt";
            add.setBackgroundColor(0x00000000);
            sub.setBackgroundColor(0x00000000);
            mult.setBackgroundColor(0x00000000);
            div.setBackgroundColor(0x00000000);
            expnt.setBackgroundColor(0x00000000);
            sqrt.setBackgroundColor(0xffff0000);
        }

        if(numCount == 1 || numCount == 2)
        {
            Log.i("info", "Ta da! It's working!");
        }

        //more display stuff

        input.setText(numberOne + "");

            if (unit == "add") {
                numCount = 2;
                result = numberOne + numberTwo;
                input.setText(numberOne + " + " + numberTwo);
            }

            else if (unit == "sub") {
                numCount = 2;
                result = numberOne - numberTwo;
                input.setText(numberOne + " - " + numberTwo);
            }

            else if (unit == "mult") {
                numCount = 2;
                result = numberOne * numberTwo;
                input.setText(numberOne + " * " + numberTwo);
            }

            else if (unit == "div") {
                numCount = 2;
                resultDub = numberOneDub / numberTwoDub;
                input.setText(numberOne + " / " + numberTwo);
                if(numberOne == 0 && numberTwo == 0 || numberTwo == 0)
                {
                    Toast.makeText(this, "No answer. Do not divide by 0!", Toast.LENGTH_SHORT).show();
                }
            }

            else if (unit == "expnt") {
                numCount = 2;
                input.setText(numberOne + "^" + numberTwo);
            }

            else if(unit == "sqrt")
            {
                numCount = 1;
                input.setText("Square root of " + numberOne);
            }

        if(view.getId() == R.id.clear)
        {
            numberOneStr = "0";
            numberTwoStr = "0";
            numCount = 1;
            Toast.makeText(this, "Input cleared!", Toast.LENGTH_SHORT).show();
        }

        if(view.getId() == R.id.equals)
        {
            if (unit == "add") {
                numCount = 2;
                result = numberOne + numberTwo;
                input.setText(numberOne + " + " + numberTwo + " = " + result);
            }

            else if (unit == "sub") {
                numCount = 2;
                result = numberOne - numberTwo;
                input.setText(numberOne + " - " + numberTwo + " = " + result);
            }

            else if (unit == "mult") {
                numCount = 2;
                result = numberOne * numberTwo;
                input.setText(numberOne + " * " + numberTwo + " = " + result);
            }

            else if (unit == "div") {
                numCount = 2;
                resultDub = numberOneDub / numberTwoDub;
                input.setText(numberOne + " / " + numberTwo + " = " + resultDub);
                if(numberOne == 0 && numberTwo == 0 || numberTwo == 0)
                {
                    Toast.makeText(this, "No answer. Do not divide by 0!", Toast.LENGTH_SHORT).show();
                }
            }

            else if (unit == "expnt") {
                numCount = 2;
                input.setText(numberOne + "^" + numberTwo + " = " + expnt(numberOne, numberTwo));
            }

            else if(unit == "sqrt")
            {
                numCount = 1;
                input.setText("Square root of " + numberOne + " = " + Math.sqrt(numberOneDub));
            }
        }

        if(numberOneStr.length() == 20 || numberTwoStr.length() == 20)
        {
           Toast.makeText(this, "Your numbers are too big! Chill out.", Toast.LENGTH_SHORT).show();
           numberOneStr = "0";
           numberTwoStr = "0";
           numCount = 1;
        }

        if(view.getId() == R.id.unitbackspace)
        {
            if(numCount == 1)
            {
                if (numberOneStr != null && numberOneStr.length() > 1)
                {
                    numberOneStr = numberOneStr.substring(0, numberOneStr.length() - 1);
                }
                else if (numberOneStr == null || numberOneStr.length() <= 1)
                {
                    Toast.makeText(this, "You cannot remove nothing!", Toast.LENGTH_SHORT).show();
                }
            }
            else if(numCount == 2)
            {
                if (numberTwoStr != null && numberTwoStr.length() > 1)
                {
                    numberTwoStr = numberTwoStr.substring(0, numberTwoStr.length() - 1);
                }
                else if (numberTwoStr == null || numberTwoStr.length() <= 1)
                {
                    Toast.makeText(this, "You cannot remove nothing!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    public static long expnt(long base, long exponent)
    {
        long product = 1;
        for(int i = 0; i < exponent; i++)
        {
            product = product * base;
        }
        return product;
    }
}
