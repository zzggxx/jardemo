package com.snbc.jardemotest;

import android.content.Context;
import android.widget.Toast;

/**
 * author: zhougaoxiong
 * date: 2019/12/11,9:33
 * projectName:jardemo
 * packageName:com.snbc.jardemotest
 */
public class ToastUtil {
    public static void show(Context context, String txt) {
        adshow(context, txt);
    }

    private static void adshow(Context context, String txt) {
        Toast.makeText(context, txt, Toast.LENGTH_LONG).show();
    }
}
