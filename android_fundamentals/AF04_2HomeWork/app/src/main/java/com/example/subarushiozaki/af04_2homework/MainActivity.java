package com.example.subarushiozaki.af04_2homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CheckBox mChocolate;
    private CheckBox mSprinkles;
    private CheckBox mNuts;
    private CheckBox mCherries;
    private CheckBox mOrio;
    private List<CheckBox> mCheckList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCheckList = new ArrayList<>();
        mCheckList.add((CheckBox)findViewById(R.id.chocosyrup));
        mCheckList.add((CheckBox)findViewById(R.id.sprinkles));
        mCheckList.add((CheckBox)findViewById(R.id.nuts));
        mCheckList.add((CheckBox)findViewById(R.id.cherries));
        mCheckList.add((CheckBox)findViewById(R.id.orio));

    }


    public void showCheckBox(View view) {
        String showText = "";
        for (CheckBox c: mCheckList) {
            if(c.isChecked()) {
                showText += c.getText().toString();
            }
        }

        showToast(showText);

    }

    private void showToast (String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}
