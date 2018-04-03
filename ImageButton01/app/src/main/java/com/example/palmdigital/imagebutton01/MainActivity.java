package com.example.palmdigital.imagebutton01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int cookies = 0;
    TextView cookiesstring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cookiesstring = findViewById(R.id.cookies);
    }

    public void onImageClick(View view)
    {
        cookies++;
        String strCookies = Integer.toString(cookies);
        cookiesstring.setText(strCookies);
    }
}
