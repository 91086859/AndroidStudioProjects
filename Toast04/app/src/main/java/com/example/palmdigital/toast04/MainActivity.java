package com.example.palmdigital.toast04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Today is Wednesday", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "It is Jan 10", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "It is 2018", Toast.LENGTH_SHORT).show();
    }
}
