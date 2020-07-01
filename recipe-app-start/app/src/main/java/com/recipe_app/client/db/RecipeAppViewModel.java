package com.recipe_app.client.db;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

public class RecipeAppViewModel extends AndroidViewModel {

    private RecipeAppRepository mRepository;
    private LiveData<List<TableRecipe>> mAllRecipes;

    public RecipeAppViewModel(Application application) {
        super(application);
        mRepository = new RecipeAppRepository(application);
        mAllRecipes = mRepository.getAllRecipes();
    }

    LiveData<List<TableRecipe>> getAllRecipes() { return mAllRecipes; }

    public void insertRecipe(TableRecipe recipe) { mRepository.insertRecipe(recipe);}
}
