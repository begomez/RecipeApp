package com.recipe_app.client.ui.ingredients;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.recipe_app.client.BaseFragment;
import com.recipe_app.client.R;


public class IngredientsMainFragment extends BaseFragment {

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
    }

    protected void addAdapter() {
        RecyclerView recyclerView = (RecyclerView) this.getView().findViewById(R.id.list_ingredients);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());

        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(layoutManager);

//        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
//                                                                                    ((LinearLayoutManager) layoutManager).getOrientation());
//        recyclerView.addItemDecoration(mDividerItemDecoration);

        IngredientsAdapter mAdapter = new IngredientsAdapter();            //TODO database
        recyclerView.setAdapter(mAdapter);
    }
}
