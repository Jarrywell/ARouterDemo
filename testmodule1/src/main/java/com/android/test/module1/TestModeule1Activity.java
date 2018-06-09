package com.android.test.module1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class TestModeule1Activity extends AppCompatActivity {
    private Test mTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_testmodule1);

        mTest = new Test("this is testmoudle1!!!");
        mTest.printContent();
    }
}
