package com.recipe_app.client.ui.recipes;


import android.os.Bundle;
import android.support.annotation.Nullable;

import com.recipe_app.client.BaseFragment;
import com.recipe_app.client.R;


public class RecipeDetailFragmentIngr extends BaseFragment {

    public static RecipeDetailFragmentIngr newInstance() {
        return newInstance(new Bundle());
    }

    public static RecipeDetailFragmentIngr newInstance(Bundle b) {
        RecipeDetailFragmentIngr frag = new RecipeDetailFragmentIngr();

        frag.setArguments(b);

        return frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.layout = R.layout.fragment_recipes_detail_ingr;

        super.onCreate(savedInstanceState);
    }
}
