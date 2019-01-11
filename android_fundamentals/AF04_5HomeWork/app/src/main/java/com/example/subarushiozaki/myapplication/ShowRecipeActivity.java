package com.example.subarushiozaki.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowRecipeActivity extends Activity {

    private TextView recipeTitle;
    private ImageView mRecipeImageView;
    private TextView mRecipeDescriptionView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_recipe);

        Intent intent = getIntent();

        // Set title
        String title = intent.getStringExtra(RecipeListAdapter.RECIPE_TITLE);
        recipeTitle = findViewById(R.id.recipeTitle);
        recipeTitle.setText(title);

        title = title.toLowerCase().replace(" ", "_");

        // Set Image resource
        int picId = getResources().getIdentifier(title,"drawable", getPackageName());
        mRecipeImageView.setImageResource(picId);

        // Set text description
        int descId = getResources().getIdentifier(title, "")

    }
}
