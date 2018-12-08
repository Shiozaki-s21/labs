package com.example.subarushiozaki.af02_2;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int TEXT_REQUEST_CODE = 1;
    private LinearLayout mCartList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCartList = findViewById(R.id.cartList);

    }

    public void launchSecond(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TEXT_REQUEST_CODE) {
            if(resultCode == RESULT_OK) {
                //get data inside linear



                String tagName = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                TextView textView = new TextView(this);
                textView.setText(tagName);
                mCartList.addView(textView,mCartList.getChildCount());
            }
        }
    }
}
