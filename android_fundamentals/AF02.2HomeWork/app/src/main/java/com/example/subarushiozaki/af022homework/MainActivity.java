package com.example.subarushiozaki.af022homework;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mCounterButton;
    private TextView mCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCounterButton = findViewById(R.id.counterButton);


        if (savedInstanceState != null) {
            String tmp = savedInstanceState.getString("counter");
            mCounter.setText(tmp);
        } else {
            mCounter = findViewById(R.id.counter);
        }
    }

    public void incrimentCounter(View view) {
        int count = Integer.valueOf(mCounter.getText().toString());
        count++;
        mCounter.setText(String.valueOf(count));

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("counter",mCounter.getText().toString());
    }
}
