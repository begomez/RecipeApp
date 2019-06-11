package com.recipe_app.client.ui.ingredients;


import android.os.Bundle;
import android.support.annotation.Nullable;
import com.recipe_app.client.BaseFragment;
import com.recipe_app.client.R;


public class IngredientsDetailFragment extends BaseFragment {

    public static IngredientsDetailFragment getInstance() {
        return getInstance(new Bundle());
    }

    public static IngredientsDetailFragment getInstance(Bundle b) {
        IngredientsDetailFragment frag = new IngredientsDetailFragment();
        frag.setArguments(b);
        return frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.layout = R.layout.fragment_ingredients_detail;
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}
