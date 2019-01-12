package com.example.subarushiozaki.myapplication;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.LinkedList;

public class RecipeListAdapter extends
        RecyclerView.Adapter<RecipeListAdapter.RecipeViewHolder>  {

    private final LinkedList<String> mRecipeList;
    private final LinkedList<String> mRecipeDescriptionList;
    private LayoutInflater mInflater;
    private Context mContext;
    public static final String RECIPE_TITLE = "recipeTitle";

    public RecipeListAdapter(Context context, LinkedList<String> mRecipeList,
                             LinkedList<String> mRecipeDescriptionList) {

        mInflater = LayoutInflater.from(context);
        this.mRecipeList = mRecipeList;
        this.mRecipeDescriptionList = mRecipeDescriptionList;
        this.mContext = context;
    }

    class RecipeViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        public final TextView recipeItemView;
        public final TextView recipeDescription;
        final RecipeListAdapter mAdapter;

        public RecipeViewHolder(View item, RecipeListAdapter adapter) {
            super(item);
            recipeItemView = itemView.findViewById(R.id.recipe);
            recipeDescription = itemView.findViewById(R.id.recipeSmallDescription);
            this.mAdapter = adapter;

            //TODO Don't forget set Click Listener!!!
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // Get title
            int mPosition = getLayoutPosition();
            String title = mRecipeList.get(mPosition);

            //TODO Can't Do that because This class doesn't extend Activity
                // get picture ID

                // get recipe ID

            // create intent
            Intent intent = new Intent(mContext, ShowRecipeActivity.class);
            intent.putExtra(RECIPE_TITLE,title);

            // set intent title and Picture/recipe ID

            // start Activity
            mContext.startActivity(intent);
        }
    }

    @Override
    public RecipeListAdapter.RecipeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.recipelist_item,
                parent, false);
        return new RecipeViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(RecipeListAdapter.RecipeViewHolder holder, int position) {
        String mCurrent = mRecipeList.get(position);
        String mCurrentDescription = mRecipeDescriptionList.get(position);
        holder.recipeItemView.setText(mCurrent);
        holder.recipeDescription.setText(mCurrentDescription);
    }

    @Override
    public int getItemCount() {
        return mRecipeList.size();
    }

}
