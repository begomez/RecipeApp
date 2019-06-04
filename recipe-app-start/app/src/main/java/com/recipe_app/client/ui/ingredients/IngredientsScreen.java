package com.recipe_app.client.ui.ingredients;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.recipe_app.client.BaseActivity;
import com.recipe_app.client.R;


public class IngredientsScreen extends BaseActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.layout = (R.layout.screen_ingredients);

        super.onCreate(savedInstanceState);

        this.launchMainFragment(R.id.screen_ingredients_frag_container, IngredientsMainFragment.getInstance(), false);
    }

}
