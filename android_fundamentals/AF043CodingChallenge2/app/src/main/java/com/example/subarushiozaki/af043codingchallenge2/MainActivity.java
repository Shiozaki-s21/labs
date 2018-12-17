package com.example.subarushiozaki.af043codingchallenge2;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button mTimerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTimerButton = findViewById(R.id.timer_button);
    }

    public void callTimer(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.timepicker));
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = "00";

        if(hourOfDay < 13) {
            int hour = hourOfDay - 12;
            hour_string = "AM " + Integer.toString(hour);
        } else {
            hour_string = "PM " + Integer.toString(hourOfDay);
        }

        if(minute < 10) {
            minute_string = "0" + Integer.toString(minute);
        } else {
            minute_string = Integer.toString(minute);
        }

        String timeMessage = (hour_string + ":" + minute_string);

        Toast.makeText(this,getString(R.string.time_toast)
                + timeMessage, Toast.LENGTH_SHORT).show();
    }
}
