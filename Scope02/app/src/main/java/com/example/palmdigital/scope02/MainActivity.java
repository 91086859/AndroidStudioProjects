package com.example.palmdigital.scope02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // fields
    boolean isDank;
    float dankFloat;
    byte dankByte;
    long dankLong;
    char dankChar;
    short dankShort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("info", "" + isDank + dankFloat + dankByte + dankLong + dankChar + dankShort);
    }

    void myAwesomeMethod01()
    {
        int dankInt01;
        double dankDouble01;
        String dankString01;
        TextView dankTextView01;
        ImageView dankImageView01;
        Button dankButton01;
        dankInt01 = 42;
        dankDouble01 = 42.0;
        dankString01 = "number";
        isDank = true;
    }

    void myAwesomeMethod02()
    {
        int dankInt02;
        double dankDouble02;
        String dankString02;
        TextView dankTextView02;
        ImageView dankImageView02;
        Button dankButton02;
        dankInt02 = 69;
        dankDouble02 = 69.0;
        dankString02 = "15";
        dankFloat = 2147483647;
    }

    void myAwesomeMethod03()
    {
        int dankInt03;
        double dankDouble03;
        String dankString03;
        TextView dankTextView03;
        ImageView dankImageView03;
        Button dankButton03;
        dankInt03 = 420;
        dankDouble03 = 420.0;
        dankString03 = "burger";
        dankByte = 127;
    }

    void myAwesomeMethod04()
    {
        int dankInt04;
        double dankDouble04;
        String dankString04;
        TextView dankTextView04;
        ImageView dankImageView04;
        Button dankButton04;
        dankInt04 = 4269;
        dankDouble04 = 4269.0;
        dankString04 = "king";
        dankLong = 2147483647;
    }

    void myAwesomeMethod05()
    {
        int dankInt05;
        double dankDouble05;
        String dankString05;
        TextView dankTextView05;
        ImageView dankImageView05;
        Button dankButton05;
        dankInt05 = 42069;
        dankDouble05 = 42069.0;
        dankString05 = "foot lettuce";
        dankChar = 'x';
        dankShort = 32767;
    }
}
