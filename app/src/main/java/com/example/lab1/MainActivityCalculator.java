package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityCalculator extends AppCompatActivity {
    EditText editTextOne;
    EditText editTextTwo;
    TextView textView;
    Button btnPlus;
    Button btnMine;
    Button btnMultiplication;
    Button btnDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);

        editTextOne = findViewById(R.id.oneEdit);
        editTextTwo = findViewById(R.id.twoEdit);
        textView = findViewById(R.id.textView);

        btnPlus = findViewById(R.id.plus);
        btnMine = findViewById(R.id.mine);
        btnMultiplication = findViewById(R.id.multiplication);
        btnDivision = findViewById(R.id.division);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(editTextOne.getText().toString()) | TextUtils.isEmpty(editTextTwo.getText().toString())) {
                    editTextOne.setError("Ошибка!");
                    editTextTwo.setError("Ошибка!");
                    textView.setText("Поле не заполнено!");
                    return;
                }
                try {
                    textView.setText(editTextOne.getText().toString()+ " + "+editTextTwo.getText().toString()+" = " + Plus(editTextOne,editTextTwo));
                    editTextOne.getText().clear();
                    editTextTwo.getText().clear();
                }catch (Exception ex)
                {
                    textView.setText("Не верные данные!");
                }
            }
        });

        btnMine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(editTextOne.getText().toString()) | TextUtils.isEmpty(editTextTwo.getText().toString())) {
                    editTextOne.setError("Ошибка!");
                    editTextTwo.setError("Ошибка!");
                    textView.setText("Поле не заполнено!");
                    return;
                }

                try {
                    textView.setText(editTextOne.getText().toString()+ " - "+editTextTwo.getText().toString()+" = " + Mine(editTextOne,editTextTwo));
                    editTextOne.getText().clear();
                    editTextTwo.getText().clear();
                }catch (Exception ex)
                {
                    textView.setText("Не верные данные!");
                }
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(editTextOne.getText().toString()) | TextUtils.isEmpty(editTextTwo.getText().toString())) {
                    editTextOne.setError("Ошибка!");
                    editTextTwo.setError("Ошибка!");
                    textView.setText("Поле не заполнено!");
                    return;
                }

                try {
                    textView.setText(editTextOne.getText().toString()+ " * "+editTextTwo.getText().toString()+" = " + Multiplication(editTextOne,editTextTwo));
                    editTextOne.getText().clear();
                    editTextTwo.getText().clear();
                }catch (Exception ex)
                {
                    textView.setText("Не верные данные!");
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(editTextOne.getText().toString()) | TextUtils.isEmpty(editTextTwo.getText().toString())) {
                    editTextOne.setError("Ошибка!");
                    editTextTwo.setError("Ошибка!");
                    textView.setText("Поле не заполнено!");
                    return;
                }

                try {
                    textView.setText(editTextOne.getText().toString()+ " / "+editTextTwo.getText().toString()+" = " + Division(editTextOne,editTextTwo));
                    editTextOne.getText().clear();
                    editTextTwo.getText().clear();
                }catch (Exception ex)
                {
                    textView.setText("Не верные данные!");
                }
            }
        });
    }

    double Plus (EditText one, EditText two)
    {

        double oneEditText= Double.parseDouble(one.getText().toString());
        double twoEditText= Double.parseDouble(two.getText().toString());

        return  oneEditText+twoEditText;
    }
    double Mine (EditText one, EditText two)
    {
        double oneEditText= Double.parseDouble(one.getText().toString());
        double twoEditText= Double.parseDouble(two.getText().toString());

        return oneEditText-twoEditText;
    }

    double Multiplication(EditText one, EditText two)
    {
        double oneEditText= Double.parseDouble(one.getText().toString());
        double twoEditText= Double.parseDouble(two.getText().toString());

        return oneEditText*twoEditText;
    }
    double Division (EditText one, EditText two)
    {
        double oneEditText= Double.parseDouble(one.getText().toString());
        double twoEditText= Double.parseDouble(two.getText().toString());

        return oneEditText/twoEditText;
    }

}