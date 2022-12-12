package com.group6.group6calculator;

import static com.group6.group6calculator.R.id.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText no1 ;
    Button calc, equal, clear;
    TextView answer;    double ans = 0;  // global variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // for text views
        no1 = findViewById(R.id.Rad);

        // for button with operations
        calc = findViewById(R.id.calc);

        // for equal to button
        equal = findViewById(R.id.equals);

        //for clear
        clear = findViewById(R.id.clear);

        // for answer field
        answer = findViewById(R.id.answer);








                calc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String num1 = no1.getText().toString();

                        if (num1.isEmpty() ) {
                            Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                        }
                        else {
                            double a = Double.parseDouble(no1.getText().toString());
                            ans =(22*a*a)/7 ;

                        }
                    }
                });


                equal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String ans1 = String.valueOf(ans);
                        answer.setText(ans1);
                        ans= 0;
                    }
                });


    }
}