package com.example.subarushiozaki.af02_3codingchallenge;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int TEXT_REQUEST_CODE = 1;
    private LinearLayout mCartList;
    private EditText mStoreName;
    private Button mSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCartList = findViewById(R.id.cartList);
        mStoreName = findViewById(R.id.storeName);
        mSearchButton = findViewById(R.id.SearchButton);

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

                String tagName = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                TextView textView = new TextView(this);
                textView.setText(tagName);
                mCartList.addView(textView,mCartList.getChildCount());
            }
        }
    }

    public void searchStoreLocate(View view) {
        String storeName = mStoreName.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?=" + storeName);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent");
        }
    }
}
