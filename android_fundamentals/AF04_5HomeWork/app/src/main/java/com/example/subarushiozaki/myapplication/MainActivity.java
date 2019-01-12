package com.example.subarushiozaki.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;
import java.util.Scanner;

// TODO Chenge text view on show recipe act!!
public class MainActivity extends AppCompatActivity {

    // word list for title
    private final LinkedList<String> mRecipeList = new LinkedList<>();
    private final LinkedList<String> mRecipeDescriptionList = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private RecipeListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // add title for example
        for (RecipeTitles r: RecipeTitles.values()) {
            mRecipeList.add(r.getName());
        }


        // add description for example
        for (String title: mRecipeList) {
            String fileName = (title.toLowerCase().replace(' ', '_')) + "_small_description";
            int id = getResources().getIdentifier(fileName, "raw", getPackageName());
            Scanner in = new Scanner(getResources().openRawResource(id));
            String result = "";
            while(in.hasNext()) {
                result += in.nextLine();
            }
            mRecipeDescriptionList.add(result);
        }


        mRecyclerView = findViewById(R.id.reyclerview);
        mAdapter = new RecipeListAdapter(this, mRecipeList, mRecipeDescriptionList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        Intent intent = new Intent(this,ShowRecipeActivity.class);
    }
}
