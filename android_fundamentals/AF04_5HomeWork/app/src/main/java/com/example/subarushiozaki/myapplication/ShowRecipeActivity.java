package com.example.subarushiozaki.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Scanner;

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
        mRecipeImageView = findViewById(R.id.recipeImage);
        mRecipeImageView.setImageResource(picId);

        // Set text description
        int descId = getResources().getIdentifier(title, "raw", getPackageName());
        Scanner in = new Scanner(getResources().openRawResource(descId));
        String result = "";
        while (in.hasNext()) {
            String tmp = in.nextLine();
            if (tmp.equals("")) {
                result += "\n";
            } else {
                result += tmp;
            }

        }
        in.close();

        mRecipeDescriptionView = findViewById(R.id.recipeDescription);
        mRecipeDescriptionView.setText(result);
    }
}
