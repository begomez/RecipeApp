package com.recipe_app.client.ui.ingredients;

import android.os.Bundle;

import com.recipe_app.client.BaseActivity;
import com.recipe_app.client.R;


public class IngredientsScreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.layout = (R.layout.screen_ingredients);

        super.onCreate(savedInstanceState);
    }
}
