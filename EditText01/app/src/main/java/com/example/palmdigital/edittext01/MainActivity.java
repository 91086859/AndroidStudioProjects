package com.example.palmdigital.edittext01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    Button buttonGetName;
    ImageView masahiro;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGetName = findViewById(R.id.buttonName);
        buttonGetName.setOnTouchListener(this);

        masahiro = findViewById(R.id.masahiro);
        masahiro.setOnTouchListener(this);
    }

    public boolean onTouch(View view, MotionEvent event)
    {
        if(view.getId() == R.id.masahiro)
        {
            masahiro.setImageResource(R.drawable.masahiro);
        }
        EditText firstNameObject = findViewById(R.id.et_firstName);
        String firstStr = firstNameObject.getText().toString();
        EditText lastNameObject = findViewById(R.id.et_lName);
        String lastStr = lastNameObject.getText().toString();
        TextView firstNameDisplay = findViewById(R.id.tv_Name);
        firstNameDisplay.setText(firstStr + " " + lastStr);

        return false;
    }
}
