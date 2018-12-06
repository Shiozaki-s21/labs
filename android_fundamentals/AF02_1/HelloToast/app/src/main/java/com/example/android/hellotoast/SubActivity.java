package com.example.android.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView mCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        // Connect to counter as a TextView on View
        mCounter = findViewById(R.id.Counter);

        // Get Intent from MainActivity
        Intent intent = getIntent();

        // Get number as a String through Intent
        String counter = intent.getStringExtra(MainActivity.COUNTER);
        // Set counter on View
        mCounter.setText(counter);
    }
}
