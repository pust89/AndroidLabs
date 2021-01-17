package com.dmitruk.laba3;

import android.os.Bundle;
import android.view.View;
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
        parentLayout = findViewById(R.id.parentLayout);
        firstTextView = findViewById(R.id.textView1);
        secondTextView = findViewById(R.id.textView2);
    }

    public void btnRedGreenClick(View view){
        firstTextView.setBackgroundColor(getResources().getColor(R.color.red));
        firstTextView.setTextColor(getResources().getColor(R.color.green));
        secondTextView.setBackgroundColor(getResources().getColor(R.color.red));
        secondTextView.setTextColor(getResources().getColor(R.color.green));
    }

    public void btnYellowBlueClick(View view){
        firstTextView.setBackgroundColor(getResources().getColor(R.color.yellow));
        firstTextView.setTextColor(getResources().getColor(R.color.blue));
        secondTextView.setBackgroundColor(getResources().getColor(R.color.yellow));
        secondTextView.setTextColor(getResources().getColor(R.color.blue));
    }

    public void btnBlackWhiteClick(View view){
        firstTextView.setBackgroundColor(getResources().getColor(R.color.black));
        firstTextView.setTextColor(getResources().getColor(R.color.white));
        secondTextView.setBackgroundColor(getResources().getColor(R.color.black));
        secondTextView.setTextColor(getResources().getColor(R.color.white));
    }

    public void btnRedClick(View view){
        parentLayout.setBackgroundColor(getResources().getColor(R.color.red));
    }

    public void btnBlueClick(View view){
        parentLayout.setBackgroundColor(getResources().getColor(R.color.blue));
    }

    public void btnBlackClick(View view){
        parentLayout.setBackgroundColor(getResources().getColor(R.color.black));
    }
}