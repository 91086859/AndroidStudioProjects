package com.example.palmdigital.caesarcipher01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText strInput;
    EditText strShiftFactor;
    TextView output;
    Button btnGenOutput;
    Button btnChangeActivity;
    String outputStr;
    int shiftFactorInt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strInput = findViewById(R.id.et_String);

        strShiftFactor = findViewById(R.id.et_shiftFactor);

        output = findViewById(R.id.tv_encryptedText);

        btnGenOutput = findViewById(R.id.buttonEncrypt);
        btnGenOutput.setOnClickListener(this);

        btnChangeActivity = findViewById(R.id.buttonChangePageToDecrypt);
        btnChangeActivity.setOnClickListener(this);

        Bundle extras = getIntent().getExtras();
        String strEtInput = strInput.getText().toString();

        if(extras != null)
        {
            strEtInput = extras.getString("output");
            strInput.setText(strEtInput);
        }
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonEncrypt)
        {
            String inputStr = strInput.getText().toString();
            String shiftFactorStr = strShiftFactor.getText().toString();
            if(shiftFactorStr.matches("\\d+(?:\\.\\d+)?"))
            {
                shiftFactorInt = Integer.parseInt(shiftFactorStr);
                outputStr = encrypt(inputStr, shiftFactorInt);
                output.setText(outputStr);
            }
            else
            {
                outputStr = "Please enter your shift factor as a number!";
                output.setText(outputStr);
            }
        }
        else if(view.getId() == R.id.buttonChangePageToDecrypt)
        {
            Intent i = new Intent(this, DecryptActivity.class);
            i.putExtra("output", outputStr);
            i.putExtra("factor", shiftFactorInt);
            startActivity(i);
        }
    }

    public static String encrypt(String input, int shift)
    {
        String output = "";
        int alphabetSize = 26;
        char[] alphabet = new char[alphabetSize];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        // make every character in input uppercase
        input = input.toUpperCase();
        // for each character in the input string
        for (int i = 0; i < input.length(); i++)
        {
            char thisVal = input.charAt(i);
            if (thisVal == ' ')
            {
                output += ' ';
            }
            else
            {
                for (int j = 0; j < alphabetSize; j++)
                {
                    if (alphabet[j] == thisVal)
                    {
                        int shiftedIndex = (j + shift) % alphabetSize;
                        output += alphabet[shiftedIndex];
                    }
                }
            }
        }
        return output;
    }
}
