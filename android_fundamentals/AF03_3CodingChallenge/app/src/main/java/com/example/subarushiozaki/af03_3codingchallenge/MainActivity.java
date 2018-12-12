package com.example.subarushiozaki.af03_3codingchallenge;

import android.os.Build;
import android.os.PersistableBundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView mHelloTextView;
    private String[] mColorArray = {"red", "pink", "purple", "deep_purple",
            "indigo", "blue", "light_blue", "cyan", "teal", "green",
            "light_green", "lime", "yellow", "amber", "orange", "deep_orange",
            "brown", "grey", "blue_grey", "black" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = findViewById(R.id.hello_textview);

        if (savedInstanceState != null) {
            mHelloTextView.setTextColor(savedInstanceState.getInt("color"));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putInt("color", mHelloTextView.getCurrentTextColor());
    }

    /**
     * This method handles the click of the Change Color button by
     * picking a random color from a color array.
     *
     * @param view The view that was clicked
     */
    public void changeColor(View view) {
        Random random = new Random();
        String colorName = mColorArray[random.nextInt(20)];
        int colorResourceName = getResources().getIdentifier(colorName,"color", getApplicationContext().getPackageName());

        int colorRes = 0;

        // SDK_INT return API LEVEL which is using on Mobile
        // VERSION_CODE has a fixed number which is a each API LEVEL
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            // Process for Android Level 23 or more
            colorRes = getResources().getColor(colorResourceName, this.getTheme());
        } else {
            // Process for Android Level 22 or less
            colorRes = ContextCompat.getColor(this, colorResourceName);
        }

        mHelloTextView.setTextColor(colorRes);
    }
}
