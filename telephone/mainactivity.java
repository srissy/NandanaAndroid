package com.example.call;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button dialPhNumber;
    EditText phNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        dialPhNumber = findViewById(R.id.dialPhNumber);
        dialPhNumber.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Mobile is Calling",Toast.LENGTH_SHORT).show();
                try {
                    phNumber =findViewById(R.id.phNumber);
                    Intent implicit1 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phNumber.getText().toString()));
                    startActivity(implicit1);
                    Toast.makeText(getApplicationContext(),"Mobile is Calling",Toast.LENGTH_SHORT).show();
                }
                catch (SecurityException e)
                {}
            }
        });
    }
}
