package com.example.palmdigital.inputvalidation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText input;
    Button generateOutput;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.et_verb);

        generateOutput = findViewById(R.id.buttonOutput);
        generateOutput.setOnClickListener(this);

        output = findViewById(R.id.tv_verboutput);
    }

    public void onClick(View view)
    {
        String inputStr = input.getText().toString();
        if(inputStr.matches("\\d+(?:\\.\\d+)?") || inputStr.matches(""))
        {
            input.setText("");
            output.setText("Zoinks! That's a verb, not a number! Listen to instructions!");
        }
        else
        {
            output.setText(inputStr);
        }
    }
}
