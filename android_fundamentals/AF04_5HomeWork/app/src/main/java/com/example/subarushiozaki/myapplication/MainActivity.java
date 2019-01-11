package com.example.subarushiozaki.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    // word list for title
    private final LinkedList<String> mRecipeList = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private RecipeListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // add title for example
        mRecipeList.add("Miso soup");
        mRecipeList.add("Subuta");
        mRecipeList.add("Ganmodoki");

        mRecyclerView = findViewById(R.id.reyclerview);
        mAdapter = new RecipeListAdapter(this, mRecipeList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        Intent intent = new Intent(this,ShowRecipeActivity.class);
    }
}
