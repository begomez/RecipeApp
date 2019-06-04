package com.recipe_app.client.ui.recipes;


import android.os.Bundle;
import android.support.annotation.Nullable;

import com.recipe_app.client.BaseFragment;
import com.recipe_app.client.R;


public class RecipeDetailFragmentNotes extends BaseFragment {

    public static RecipeDetailFragmentNotes newInstance() {
        return newInstance(new Bundle());
    }

    public static RecipeDetailFragmentNotes newInstance(Bundle b) {
        RecipeDetailFragmentNotes frag = new RecipeDetailFragmentNotes();

        frag.setArguments(b);

        return frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.layout = R.layout.fragment_recipes_detail_notes;

        super.onCreate(savedInstanceState);
    }
}
