package com.recipe_app.client;

import android.app.Application;

import com.recipe_app.client.db.RecipeAppDatabase;

public class RecipeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RecipeAppDatabase.getDatabase(this);
    }
}
