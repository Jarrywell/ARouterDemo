package com.android.test.arouter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.test.module1.Test;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private final String TAG = "MainApp";
    private Button mBtnTest;
    private Test mTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_testmodule1);
        mTest = new Test("this is main module!!!");


        mBtnTest = findViewById(R.id.id_btn_test);
        mBtnTest.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mBtnTest) {
            mTest.printContent();
        }
    }
}
