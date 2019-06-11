package com.recipe_app.client.ui.ingredients;


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
import com.recipe_app.client.data.model.DummyData;
import com.recipe_app.client.data.model.Ingredient;
import com.recipe_app.client.ui.ExtrasFactory;


public class IngredientsMainFragment extends BaseFragment {

    private IIngredientClick onIngrClickListener = new IIngredientClick() {
        @Override
        public void onIngredientClick(Ingredient ingr) {
            //TODO: call when exists
            //Navigator.toIngredientsDetail((BaseActivity) getActivity(), ExtrasFactory.getIngredientExtras(ingr));
        }
    };

    public static IngredientsMainFragment getInstance() {
        return getInstance(new Bundle());
    }

    public static IngredientsMainFragment getInstance(Bundle b) {
        IngredientsMainFragment frag = new IngredientsMainFragment();
        frag.setArguments(b);
        return frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.layout = R.layout.fragment_ingredients_main;
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.addAdapter();
        this.addFloatingButton();
    }

    protected void addAdapter() {
        RecyclerView recyclerView = (RecyclerView) this.getView().findViewById(R.id.list_ingredients);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());

        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(layoutManager);

//        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
//                                                                                    ((LinearLayoutManager) layoutManager).getOrientation());
//        recyclerView.addItemDecoration(mDividerItemDecoration);

        IngredientsAdapter mAdapter = new IngredientsAdapter(DummyData.getListOfIngredients(15), onIngrClickListener);
        recyclerView.setAdapter(mAdapter);
    }

    protected void addFloatingButton() {
        FloatingActionButton fab = this.getView().findViewById(R.id.ingr_btn_add);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "New Ingredient!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
}
