package com.example.subarushiozaki.af04_4homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickDonut(View view) {
        mImageView = findViewById(R.id.donutImage);

        Intent intent = new Intent(MainActivity.this, donutActivity.class);
        startActivity(intent);
    }

    public void clickIce(View view) {
        Intent intent = new Intent(MainActivity.this, IceActivity.class);
        startActivity(intent);
    }

    public void clickFroyo(View view) {
        Intent intent = new Intent(MainActivity.this, Froyo.class);
        startActivity(intent);
    }
}
