package com.recipe_app.client.ui.recipes;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.recipe_app.client.BaseActivity;
import com.recipe_app.client.BaseFragment;
import com.recipe_app.client.Navigator;
import com.recipe_app.client.R;
import com.recipe_app.client.ui.ingredients.IngredientsAdapter;


public class RecipeMainFragment extends BaseFragment {

    public static RecipeMainFragment getInstance() {
        return getInstance(new Bundle());
    }

    public static RecipeMainFragment getInstance(Bundle b) {
        RecipeMainFragment frag = new RecipeMainFragment();
        frag.setArguments(b);
        return frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.layout = R.layout.fragment_recipes_main;
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.addAdapter();
        this.addFloatingButton();
    }

    protected void addAdapter() {
        RecyclerView recyclerView = (RecyclerView) this.getView().findViewById(R.id.list_recipes);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());

        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(layoutManager);

//        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
//                                                                                    ((LinearLayoutManager) layoutManager).getOrientation());
//        recyclerView.addItemDecoration(mDividerItemDecoration);

        RecipeAdapter mAdapter = new RecipeAdapter();            //TODO database
        recyclerView.setAdapter(mAdapter);
    }

    protected void addFloatingButton() {
        FloatingActionButton fab = this.getView().findViewById(R.id.rec_btn_add);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigator.toRecipesDetail((BaseActivity) getActivity(), new Bundle());
                //Snackbar.make(view, "New Recipe!", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();
            }
        });

    }
}
