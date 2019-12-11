package com.snbc.jardemotest;

import android.util.Log;

/**
 * author: zhougaoxiong
 * date: 2019/12/11,9:32
 * projectName:jardemo
 * packageName:com.snbc.jardemotest
 */
public class LogUtli {
    public static void e() {
        for (int i = 0; i < 10; i++) {
            v();
            Log.e("123456", "eeeeeeeee");
        }
    }

    public static void v() {
        Log.v("123456", "vvvvvvvv");
    }

    public void i() {
        Log.i("123456", "iiiiiiiii");
    }

    private void d() {
        Log.d("123456", "ddddddddd");
    }
}