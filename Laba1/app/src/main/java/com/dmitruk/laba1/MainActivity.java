package com.dmitruk.laba1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button firstButton;
    private Button secondButton;
    private Button thirdButton;
    private Button fourthButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setOnClickListener();
    }

    private void initViews() {
        firstButton = findViewById(R.id.btnOne);
        secondButton = findViewById(R.id.btnTwo);
        thirdButton = findViewById(R.id.btnThree);
        fourthButton = findViewById(R.id.btnFour);
    }

    private void setOnClickListener() {
        firstButton.setOnClickListener(this);
        secondButton.setOnClickListener(this);
        thirdButton.setOnClickListener(this);
        fourthButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        ((Button) view).setText(getString(R.string.title_stars));
    }
}