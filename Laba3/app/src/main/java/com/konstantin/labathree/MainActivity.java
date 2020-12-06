package com.konstantin.labathree;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout parentLayout;

    private TextView firstTextView;
    private TextView secondTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        /* Находим вьюшки (которым будим менять цвета) по id */
        parentLayout = findViewById(R.id.parentLayout);
        firstTextView = findViewById(R.id.textView1);
        secondTextView = findViewById(R.id.textView2);
    }

    /* Обработчик нажатия на кнопку  btnRedGreen */
    public void btnRedGreenClick(View view){
        firstTextView.setBackgroundColor(getResources().getColor(R.color.red));
        firstTextView.setTextColor(getResources().getColor(R.color.green));
        secondTextView.setBackgroundColor(getResources().getColor(R.color.red));
        secondTextView.setTextColor(getResources().getColor(R.color.green));
    }

    /* Обработчик нажатия на кнопку  btnYellowBlue */
    public void btnYellowBlueClick(View view){
        firstTextView.setBackgroundColor(getResources().getColor(R.color.yellow));
        firstTextView.setTextColor(getResources().getColor(R.color.blue));
        secondTextView.setBackgroundColor(getResources().getColor(R.color.yellow));
        secondTextView.setTextColor(getResources().getColor(R.color.blue));
    }

    /* Обработчик нажатия на кнопку  btnBlackWhite */
    public void btnBlackWhiteClick(View view){
        firstTextView.setBackgroundColor(getResources().getColor(R.color.black));
        firstTextView.setTextColor(getResources().getColor(R.color.white));
        secondTextView.setBackgroundColor(getResources().getColor(R.color.black));
        secondTextView.setTextColor(getResources().getColor(R.color.white));
    }

    /* Обработчик нажатия на кнопку  btnRed */
    public void btnRedClick(View view){
        parentLayout.setBackgroundColor(getResources().getColor(R.color.red));
    }

    /* Обработчик нажатия на кнопку  btnBlue */
    public void btnBlueClick(View view){
        parentLayout.setBackgroundColor(getResources().getColor(R.color.blue));
    }

    /* Обработчик нажатия на кнопку  btnBlack */
    public void btnBlackClick(View view){
        parentLayout.setBackgroundColor(getResources().getColor(R.color.black));
    }
}