package com.recipe_app.client.ui.recipes;


import android.os.Bundle;
import android.support.annotation.Nullable;

import com.recipe_app.client.BaseFragment;
import com.recipe_app.client.R;


public class RecipeDetailFragmentPrep extends BaseFragment {

    public static RecipeDetailFragmentPrep newInstance() {
        return newInstance(new Bundle());
    }

    public static RecipeDetailFragmentPrep newInstance(Bundle b) {
        RecipeDetailFragmentPrep frag = new RecipeDetailFragmentPrep();

        frag.setArguments(b);

        return frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.layout = R.layout.fragment_recipes_detail_prep;

        super.onCreate(savedInstanceState);
    }
}
