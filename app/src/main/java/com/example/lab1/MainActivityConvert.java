package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityConvert extends AppCompatActivity {
    EditText editText;
    Button btnRel;
    TextView textViewConvert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_convert);

        textViewConvert = findViewById(R.id.textViewConvert);
        editText = findViewById(R.id.convertEdit);
        btnRel = findViewById(R.id.rel);
        btnRel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(editText.getText().toString())) {
                    editText.setError("Ошибка!");
                    textViewConvert.setText("Поле не заполнено!");
                    return;
                }
                try {
                   double relConvert = Double.parseDouble(editText.getText().toString())+61.62;
                    textViewConvert.setText(relConvert+"");
                }catch (Exception ex)
                {
                    textViewConvert.setText("Не верные данные!");
                }
            }
        });
    }

}