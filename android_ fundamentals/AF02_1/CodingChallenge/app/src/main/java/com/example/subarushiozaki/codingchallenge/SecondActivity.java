package com.example.subarushiozaki.codingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textInScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        textInScroll =findViewById(R.id.textViewInScroll);
        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        textInScroll.setText(message);

        String title = intent.getStringExtra(MainActivity.TITLE);
        setTitle(title);

    }
}
