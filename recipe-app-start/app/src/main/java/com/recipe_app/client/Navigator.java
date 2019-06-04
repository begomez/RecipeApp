package com.recipe_app.client;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.recipe_app.client.ui.home.HomeScreen;
import com.recipe_app.client.ui.ingredients.IngredientsScreen;
import com.recipe_app.client.ui.recipes.RecipesDetailScreen;
import com.recipe_app.client.ui.recipes.RecipesScreen;


public abstract class Navigator {

    public static void toHome(Context cntxt, Bundle b) {
        launch(cntxt, HomeScreen.class, b);
    }

    public static void toRecipes(Context cntxt, Bundle b) {
        launch(cntxt, RecipesScreen.class, b);
    }

    public static void toRecipesDetail(Context cntxt, Bundle b) {
        launch(cntxt, RecipesDetailScreen.class, b);
    }

    public static void toIngredients(Context cntxt, Bundle b) {
        launch(cntxt, IngredientsScreen.class, b);
    }

    private static void launch(Context cntxt, Class cl, Bundle b) {
        Intent i = new Intent(cntxt, cl);

        i.putExtras(b);

        cntxt.startActivity(i);
    }
}
