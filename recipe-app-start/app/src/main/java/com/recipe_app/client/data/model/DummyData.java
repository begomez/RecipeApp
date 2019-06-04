package com.recipe_app.client.data.model;

public class DummyData {

    public static Ingredient[] getListOfIngredients(int length) {
        Ingredient[] ingList = new Ingredient[length];
        for(int i = 0; i < length; i++) {
            ingList[i] = new Ingredient("", "Ingredient " + i, "Veritas", "bla bla bla");
        }
        return ingList;
    }

    public static Recipe[] getListOfRecipes(int length) {
        Recipe[] recList = new Recipe[length];

        for(int i = 0; i < length; i++) {
            recList[i] = new Recipe("", "Recipe " + i, "", "", "15-20 min.", "Easy");
        }
        return recList;
    }
}
