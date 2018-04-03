package com.example.palmdigital.buttontotoast01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonObject1 = (Button) findViewById(R.id.button);
    }

    public void Toaster(View view) {
        Toast.makeText(this, "Oh hello there", Toast.LENGTH_SHORT).show();
        Log.i("info", "Oh hello there");
    }
}
