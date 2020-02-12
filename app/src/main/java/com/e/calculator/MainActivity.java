package com.e.calculator;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Calculator calc;
    TextView
            tablo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setBackgroundColor(Color.rgb(0xE6, 0xF3, 0xFF));
        tablo = findViewById(R.id.TABLO);
        calc = new Calculator();
    }

    public void btn1Click(View view) {
        if (tablo.getText().equals("0")) {
            tablo.setText("1");
        } else {
            tablo.setText(tablo.getText() + "1");

        }
    }

    public void btn2Click(View view) {
        if (tablo.getText().equals("0")) {
            tablo.setText("2");
        } else {
            tablo.setText(tablo.getText() + "2");

        }
    }

    public void btnPlusClick(View view) {
        calc.setNum1(Double.parseDouble(String.valueOf(tablo.getText())));
        calc.setOperation(Calculator.Operation.plus);
        tablo.setText("0");
    }

    public void btnEqualClick(View view) {
        calc.setNum2(Double.parseDouble(String.valueOf(tablo.getText())));
        calc.calculate();
        tablo.setText(calc.getRes());
    }
}
