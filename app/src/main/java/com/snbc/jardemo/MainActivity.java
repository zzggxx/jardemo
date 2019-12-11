package com.snbc.jardemo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import com.snbc.jardemotest.Logs;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logs.error();

        Bitmap assets = Logs.getAssets(this);

        ((ImageView) findViewById(R.id.img)).setImageBitmap(assets);
    }
}
