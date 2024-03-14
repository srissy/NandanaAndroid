package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.annotation.SuppressLint;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {
    TextView tv;
    @Override
    @SuppressLint("MissingInflatedID")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv = findViewById(R.id.txt1);
        Intent intent = getIntent();
        String data = intent.getStringExtra("data");
        tv.setText("Your Output is : "+ data);

    }
}
