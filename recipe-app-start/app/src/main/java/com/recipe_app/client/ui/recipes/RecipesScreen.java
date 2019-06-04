package com.recipe_app.client.ui.recipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.recipe_app.client.BaseActivity;
import com.recipe_app.client.R;
import com.recipe_app.client.ui.ingredients.IngredientsMainFragment;

public class RecipesScreen extends BaseActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.layout = (R.layout.screen_recipes);
        super.onCreate(savedInstanceState);
        this.launchMainFragment(R.id.screen_recipes_frag_container, RecipeMainFragment.getInstance(), false);
    }

}
