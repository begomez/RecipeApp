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

        recyclerView = (RecyclerView) findViewById(R.id.list_ingredients);
        //recyclerView.setHasFixedSize(true);

        //use a linear layout manager
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

//        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
//                                                                                    ((LinearLayoutManager) layoutManager).getOrientation());
//        recyclerView.addItemDecoration(mDividerItemDecoration);

        mAdapter = new IngredientsAdapter();            //TODO database
        recyclerView.setAdapter(mAdapter);
    }

}
