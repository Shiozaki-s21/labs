package com.example.subarushiozaki.af02_3codingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "EXTRA_REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();


    }

    public void addToCart(View view) {
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY,view.getTag().toString());
        setResult(RESULT_OK, replyIntent);

        finish();

    }
}
