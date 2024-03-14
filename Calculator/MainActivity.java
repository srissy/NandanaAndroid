package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button addbtn, subbtn, mulbtn, divbtn;
    EditText number1, number2;
    TextView tv;
    int num1, num2;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addbtn = findViewById(R.id.add);
        subbtn = findViewById(R.id.sub);
        mulbtn = findViewById(R.id.mul);
        divbtn = findViewById(R.id.div);
        number1 = findViewById(R.id.num1);
        number2 = findViewById(R.id.num2);
        tv = findViewById(R.id.answer);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String s1 = number1.getText().toString();
                    String s2 = number2.getText().toString();
                    num1 = Integer.parseInt(s1);
                    num2 = Integer.parseInt(s2);
                    int sum = num1+num2;
                    tv.setText("Addition : "+sum);
                }
                catch(NumberFormatException e){

                }
            }
        });

        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String s1 = number1.getText().toString();
                    String s2 = number2.getText().toString();
                    num1 = Integer.parseInt(s1);
                    num2 = Integer.parseInt(s2);
                    int sub = num1-num2;
                    tv.setText("Subtraction : "+sub);
                }
                catch(NumberFormatException e){

                }
            }
        });

        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String s1 = number1.getText().toString();
                    String s2 = number2.getText().toString();
                    num1 = Integer.parseInt(s1);
                    num2 = Integer.parseInt(s2);
                    int mul = num1 * num2;
                    tv.setText("Multiplication : "+ mul);
                }
                catch(NumberFormatException e){

                }
            }
        });

        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String s1 = number1.getText().toString();
                    String s2 = number2.getText().toString();
                    num1 = Integer.parseInt(s1);
                    num2 = Integer.parseInt(s2);
                    int div = num1 / num2;
                    tv.setText("Division : "+ div);
                }
                catch(NumberFormatException e){

                }
            }
        });
    }
}
