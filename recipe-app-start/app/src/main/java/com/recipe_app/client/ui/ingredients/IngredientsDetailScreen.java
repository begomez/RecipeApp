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
//        EditTextWidget edtxtIngredientName = ((EditTextWidget) this.findViewById(R.id.ingr_edittxt_dtl_name));
//        edtxtIngredientName.setText(target.getName());
        ((EditTextWidget) this.findViewById(R.id.ingr_edittxt_dtl_name)).setText(target.getName());
        ((EditTextWidget) this.findViewById(R.id.ingr_edittxt_whereToBuy)).setText(target.getWhereToBuy());
        ((EditTextWidget) this.findViewById(R.id.ingr_edittxt_notes)).setText(target.getNotes());
    }
}
