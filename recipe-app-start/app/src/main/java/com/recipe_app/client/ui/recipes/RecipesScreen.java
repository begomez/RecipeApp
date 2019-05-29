package com.recipe_app.client.ui.recipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.recipe_app.client.BaseActivity;
import com.recipe_app.client.R;

public class RecipesScreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.layout = (R.layout.screen_recipes);

        super.onCreate(savedInstanceState);
    }
}
