package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.en1);
        et2 = (EditText) findViewById(R.id.en2);
        tv = (TextView) findViewById(R.id.tv);
    }

    public void btnSuma(View view) {

        int x = Integer.parseInt(et1.getText().toString());
        int y = Integer.parseInt(et2.getText().toString());

        int z = x + y;

        tv.setText(String.valueOf(z));
    }

    public void btnResta(View view) {
        int x = Integer.parseInt(et1.getText().toString());
        int y = Integer.parseInt(et2.getText().toString());

        int z = x - y;

        tv.setText(String.valueOf(z));
    }

    public void btnMultiplicacion(View view) {
        int x = Integer.parseInt(et1.getText().toString());
        int y = Integer.parseInt(et2.getText().toString());

        int z = x * y;

        tv.setText(String.valueOf(z));
    }

    public void btnDivision(View view) {
        int x = Integer.parseInt(et1.getText().toString());
        int y = Integer.parseInt(et2.getText().toString());

        int z = x / y;

        tv.setText(String.valueOf(z));
    }
}