package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int myInt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // declare a local variable
        // dataType variableName; <-- this is a local variable declaration

        //some examples of primitive types and declarations
        myInt = 100; // int is a Java primitive type
        myInt = 200;
        double myDouble; // double is a Java primitive type
        char myChar;
        float myFloat;
        boolean myBool;
        long myLong;
        byte myByte;

        // these are not primitive they are classes
        String myString;
        Integer myInt2;
        Float myFloat2;
        Double myDouble2;
        // assign values to these variables
        myString = "this is an awesome string";
        myInt = 5;
        myInt = awesomeMethod(myInt);
        Log.i("info", "myInt = " + myInt);
        myDouble = 5.6;
        myFloat = 5.7f;
        myBool = true;
        myBool = false;

        TextView tv_Num1Display = findViewById(R.id.tv_top);
        TextView tv_Num2Display;

        ImageView iv_stuff;
        Button button;

        awesomeMethod2();

    } // end of onCreate

    // let's try to put a method here
    public int awesomeMethod(int input)
    {
        myInt = 69;
        return input + 5;
    }

    public void awesomeMethod2()
    {
        myInt = 420;
        for(int i = 1; i < 2147483647; i++)
        {
            System.out.println("No spam, outside links, or videos. r/dankmemes is strictly for memes. Post videos to r/dankvideos. This is not a platform to advertise your social media network. If you can't grow it organically, it probably isn't very good anyways. Linking to your instagram or twitter, or spamming links with it watermarked can result in a ban.");
        }
    }


} // end of MainActivity class