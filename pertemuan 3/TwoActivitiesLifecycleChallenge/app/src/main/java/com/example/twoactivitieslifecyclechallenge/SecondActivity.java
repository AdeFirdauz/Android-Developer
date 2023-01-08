package com.example.twoactivitieslifecyclechallenge;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
    private TextView text6;
    private TextView text7;
    private TextView text8;
    private TextView text9;
    private TextView text10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setTitle("ade");

        text1 = findViewById(R.id.textView_1);
        text2 = findViewById(R.id.textView_2);
        text3 = findViewById(R.id.textView_3);
        text4 = findViewById(R.id.textView_4);
        text5 = findViewById(R.id.textView_5);
        text6 = findViewById(R.id.textView_6);
        text7 = findViewById(R.id.textView_7);
        text8 = findViewById(R.id.textView_8);
        text9 = findViewById(R.id.textView_9);
        text10 = findViewById(R.id.textView_10);
    }

    public void keju(View view) {
        String keju1 = "keju";
        if (text1 != null) {
            text1.setText(keju1);
        } else if (text2 != null) {
            text2.setText(keju1);
        }   else if (text3 == null) {
            text3.setText(keju1);
        }else if (text4 == null) {
            text4.setText(keju1);
        }else if (text5 == null) {
            text5.setText(keju1);
        }else if (text6 == null) {
            text6.setText(keju1);
        }else if (text7 == null) {
            text7.setText(keju1);
        }else if (text8 == null) {
            text8.setText(keju1);
        }else if (text9 == null) {
            text9.setText(keju1);
        }else {
            text10.setText(keju1);
        }
    }

    public void susu(View view) {

    }

    public void nasi(View view) {

    }

    public void ikan(View view) {

    }
}