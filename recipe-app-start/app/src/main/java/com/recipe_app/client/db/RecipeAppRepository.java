package com.recipe_app.client.db;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;
import java.util.List;

public class RecipeAppRepository {

    private RecipeAppDao mDao;
    private LiveData<List<TableRecipe>> mAllRecipes;

    RecipeAppRepository(Application application) {
        RecipeAppDatabase db = RecipeAppDatabase.getDatabase(application);
        mDao = db.recipeDao();
        mAllRecipes = mDao.getAllRecipes();
    }

    LiveData<List<TableRecipe>> getAllRecipes() {
        return mAllRecipes;
    }

    public void insertRecipe(TableRecipe recipe) {
        new insertAsyncTask(mDao).execute(recipe);
    }


    private static class insertAsyncTask extends AsyncTask<TableRecipe, Void, Void> {

        private RecipeAppDao mAsyncTaskDao;

        insertAsyncTask(RecipeAppDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final TableRecipe... params) {
            mAsyncTaskDao.insertRecipe(params[0]);
            return null;
        }
    }

}
