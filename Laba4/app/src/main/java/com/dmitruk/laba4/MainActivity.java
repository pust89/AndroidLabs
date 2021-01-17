package com.dmitruk.laba4;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etFirstOperand;
    private EditText etSecondOperand;
    private TextView tvResult;

    private double firstOperand;
    private double secondOperand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        etFirstOperand = findViewById(R.id.etFirstOperand);
        etSecondOperand = findViewById(R.id.etSecondOperand);
        tvResult = findViewById(R.id.tvResult);
    }

    public void btnPlusClick(View view) {
        String firstOperandString = etFirstOperand.getText().toString();
        String secondOperandString = etSecondOperand.getText().toString();

        firstOperand = fetchOperandFromStringValue(firstOperandString);
        secondOperand = fetchOperandFromStringValue(secondOperandString);

        double result = firstOperand + secondOperand;

        tvResult.setText(firstOperand + " + " + secondOperand + " = " + result);
    }

    public void btnMinusClick(View view) {
        String firstOperandString = etFirstOperand.getText().toString();
        String secondOperandString = etSecondOperand.getText().toString();

        firstOperand = fetchOperandFromStringValue(firstOperandString);
        secondOperand = fetchOperandFromStringValue(secondOperandString);

        double result = firstOperand - secondOperand;

        tvResult.setText(firstOperand + " - " + secondOperand + " = " + result);
    }

    public void btnMultiplyClick(View view) {
        String firstOperandString = etFirstOperand.getText().toString();
        String secondOperandString = etSecondOperand.getText().toString();

        firstOperand = fetchOperandFromStringValue(firstOperandString);
        secondOperand = fetchOperandFromStringValue(secondOperandString);

        double result = firstOperand * secondOperand;

        tvResult.setText(firstOperand + " * " + secondOperand + " = " + result);
    }

    public void btnDivisionClick(View view) {
        String firstOperandString = etFirstOperand.getText().toString();
        String secondOperandString = etSecondOperand.getText().toString();

        firstOperand = fetchOperandFromStringValue(firstOperandString);
        secondOperand = fetchOperandFromStringValue(secondOperandString);

        double result = firstOperand / secondOperand;

        tvResult.setText(firstOperand + " / " + secondOperand + " = " + result);
    }

    private double fetchOperandFromStringValue(String stringValue) {
        if (stringValue.length() > 0) {
            return Double.parseDouble(stringValue);
        }
        return 0.0;
    }
}