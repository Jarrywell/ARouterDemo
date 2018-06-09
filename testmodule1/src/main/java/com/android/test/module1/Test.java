package com.android.test.module1;

import android.util.Log;

public class Test {
    private static final String TAG = "TestModule1";

    private final String content;

    public Test(String content) {
        this.content = content;
    }

    public void printContent() {
        Log.i(TAG, "content: " + content);
    }
}
