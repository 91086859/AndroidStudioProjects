package com.example.palmdigital.challenge03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayNumberSix(View view) {
        Toast.makeText(this, "six", Toast.LENGTH_SHORT).show();
    }
}
