package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnCalculators = findViewById(R.id.calculator);
        Button btnConvert = findViewById(R.id.convert);

        btnCalculators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityBtnCal();
            }
        });

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityBtnCon();
            }
        });

    }

    void activityBtnCal()
    {
        Intent intent = new Intent(this, MainActivityCalculator.class);
        startActivity(intent);
    }
    void activityBtnCon()
    {
        Intent integer = new Intent(this,MainActivityConvert.class);
        startActivity(integer);
    }
}