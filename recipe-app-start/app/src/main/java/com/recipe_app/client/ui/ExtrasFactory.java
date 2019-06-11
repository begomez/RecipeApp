package com.recipe_app.client.ui;

import android.os.Bundle;

import com.recipe_app.client.data.model.Ingredient;
import com.recipe_app.client.data.model.Recipe;

public abstract class ExtrasFactory {

    public interface Params {
        String PARAM_RECIPE = "recipe";
        String PARAM_INGR = "ingr";
    }

    public static Bundle getIngredientExtras(Ingredient ingr) {
        Bundle b = new Bundle();

        b.putParcelable(Params.PARAM_INGR, ingr != null? ingr : new Ingredient());

        return b;
    }

    public static Bundle getRecipeExtras(Recipe rec) {
        Bundle b = new Bundle();

        b.putParcelable(Params.PARAM_RECIPE, rec != null? rec : new Recipe());

        return b;
    }
}
