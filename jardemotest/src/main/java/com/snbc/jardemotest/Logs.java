package com.snbc.jardemotest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.InputStream;

/**
 * author: zhougaoxiong
 * date: 2019/12/11,9:31
 * projectName:jardemo
 * packageName:com.snbc.jardemotest
 */
public class Logs {
    public static void error() {
        LogUtli.e();
    }

    public static Bitmap getAssets(Context context) {
        Bitmap bitmap = null;
        try {
            InputStream resourceAsStream = context.getClass().getClassLoader().getResourceAsStream("assets/" + "d.jpg");
            bitmap = BitmapFactory.decodeStream(resourceAsStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }
}