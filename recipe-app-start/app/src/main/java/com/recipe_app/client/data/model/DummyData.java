package com.recipe_app.client.data.model;

import java.util.ArrayList;

public class DummyData {

    public static ArrayList<Ingredient> getListOfIngredients(int length) {
        ArrayList<Ingredient> ingList = new ArrayList<Ingredient>(length);
        for(int i = 0; i < length; i++) {
            ingList.add(new Ingredient("", "Ingredient " + i, "Veritas", "bla bla bla"));
        }
        return ingList;
    }

    public static ArrayList<Recipe> getListOfRecipes(int length) {
        ArrayList<Recipe> recList = new ArrayList<Recipe>(length);

        for(int i = 0; i < length; i++) {
            recList.add(new Recipe("", "Recipe " + i, "", "", "15-20 min.", "Easy"));
        }
        return recList;
    }

    public static ArrayList<RecipeIngredient> getListOfRecipeIngredients(int length) {
        ArrayList<RecipeIngredient> recIngList = new ArrayList<RecipeIngredient>(length);
        ArrayList<Ingredient> ingList = getListOfIngredients(length);
        for(int i = 0; i < length; i++) {
            recIngList.add(new RecipeIngredient(ingList.get(i), 1, "cs"));
        }
        return recIngList;
    }

    public static ArrayList<RecipePreparation> getListOfRecipePreparationSteps(int length) {
        ArrayList<RecipePreparation> recPrepList = new ArrayList<RecipePreparation>(length);
        for(int i = 0; i < length; i++) {
            recPrepList.add(new RecipePreparation(i, "Preparation Step " + i));
        }
        return recPrepList;
    }

    public static ArrayList<RecipeNote> getListOfRecipeNotes(int length) {
        ArrayList<RecipeNote> recNotesList = new ArrayList<RecipeNote>(length);
        for(int i = 0; i < length; i++) {
            recNotesList.add(new RecipeNote("Jane Doe", "June 5th 2019 11:55", "This Recipe is awesome!" ));
        }
        return recNotesList;
    }


//    public static RecipeIngredient[] getListOfRecipeIngredients(int length) {
//        RecipeIngredient[] recIngList = new RecipeIngredient[length];
//        ArrayList<Ingredient> ingList = getListOfIngredients(length);
//        for(int i = 0; i < length; i++) {
//            recIngList[i] = new RecipeIngredient(ingList.get(i), 1, "cs");
//        }
//        return recIngList;
//    }
//
//    public static RecipePreparation[] getListOfRecipePreparationSteps(int length) {
//        RecipePreparation[] recPrepList = new RecipePreparation[length];
//
//        for(int i = 0; i < length; i++) {
//            recPrepList[i] = new RecipePreparation(i, "Preparation Step " + i);
//        }
//        return recPrepList;
//    }
//
//
//    public static RecipeNote[] getListOfRecipeNotes(int length) {
//        RecipeNote[] recNotesList = new RecipeNote[length];;
//
//        for(int i = 0; i < length; i++) {
//            recNotesList[i] = new RecipeNote("Jane Doe", "June 5th 2019 11:55", "This Recipe is awesome!" );
//        }
//        return recNotesList;
//    }
}
