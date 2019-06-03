package com.recipe_app.client.data.model;

public class DummyData {

    public static Ingredient[] getListOfIngredients(int length) {
        Ingredient[] ingList = new Ingredient[length];
        for(int i = 0; i < length; i++) {
            ingList[i] = new Ingredient("", "Ingredient " + i, "Veritas", "bla bla bla");
        }
        return ingList;
    }
}
