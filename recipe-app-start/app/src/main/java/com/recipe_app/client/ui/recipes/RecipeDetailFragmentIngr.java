package com.recipe_app.client.ui.recipes;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.recipe_app.client.BaseFragment;
import com.recipe_app.client.R;
import com.recipe_app.client.ui.ingredients.IngredientsAdapter;


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

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.addAdapter();
//        this.addFloatingButton();
    }

    protected void addAdapter() {
        RecyclerView recyclerView = (RecyclerView) this.getView().findViewById(R.id.list_recipe_ingredients);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(layoutManager);
//        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
//                                                                                    ((LinearLayoutManager) layoutManager).getOrientation());
//        recyclerView.addItemDecoration(mDividerItemDecoration);
        RecipeIngredientsAdapter mAdapter = new RecipeIngredientsAdapter();            //TODO database
        recyclerView.setAdapter(mAdapter);
    }

    //TODO add ingredients in recipe
    protected void addFloatingButton() {
      /*  FloatingActionButton fab = this.getView().findViewById(R.id.rec_ingr_btn_add);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "New Ingredient added to the Recipe!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
}
