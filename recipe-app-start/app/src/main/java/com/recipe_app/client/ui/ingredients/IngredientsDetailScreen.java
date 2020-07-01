package com.recipe_app.client.ui.ingredients;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.recipe_app.client.BaseActivity;
import com.recipe_app.client.R;
import com.recipe_app.client.data.model.Ingredient;
import com.recipe_app.client.data.model.Recipe;
import com.recipe_app.client.ui.ExtrasFactory;
import com.recipe_app.client.ui.widget.EditTextWidget;
import com.recipe_app.client.ui.widget.TextViewWidget;


public class IngredientsDetailScreen extends BaseActivity {

//    private RecyclerView recyclerView;
//    private RecyclerView.Adapter mAdapter;
//    private RecyclerView.LayoutManager layoutManager;
    private Ingredient target;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.layout = (R.layout.screen_ingredients_detail);
        super.onCreate(savedInstanceState);
        this.launchMainFragment(R.id.screen_ingredients_dtl_frag_container, IngredientsDetailFragment.getInstance(), false);
    }

    @Override
    protected void extractExtras(Intent i) {
        super.extractExtras(i);

        Bundle b = i.getExtras();

        if (b.containsKey(ExtrasFactory.Params.PARAM_INGR)) {
            this.target = b.getParcelable(ExtrasFactory.Params.PARAM_INGR);
        } else {
            //TODO:...
        }
    }

    protected void onStart() {
        super.onStart();

        this.setViewData();
    }

    private void setViewData() {
        EditTextWidget editxtIngrName = ((EditTextWidget) this.findViewById(R.id.ingr_edittxt_dtl_name));
        EditTextWidget editxtIngrWhereToBuy = ((EditTextWidget) this.findViewById(R.id.ingr_edittxt_whereToBuy));
        EditTextWidget editxtIngrNotes = ((EditTextWidget) this.findViewById(R.id.ingr_edittxt_notes));

        if(target != null) {
            editxtIngrName.setText(target.getName());
            editxtIngrWhereToBuy.setText(target.getWhereToBuy());
            editxtIngrNotes.setText(target.getNotes());
        } else {
            editxtIngrName.setText("Ingredient Name");
            editxtIngrWhereToBuy.setText("Shop Name");
            editxtIngrNotes.setText("Enter some notes");
        }
    }
}
