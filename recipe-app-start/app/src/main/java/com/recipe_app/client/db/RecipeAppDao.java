package com.recipe_app.client.db;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.recipe_app.client.data.model.Recipe;

import java.util.List;

@Dao
public interface RecipeAppDao {

    @Insert
    void insertRecipe(TableRecipe word);

    @Query("DELETE FROM recipe")
    void deleteAllRecipes();

    @Query("SELECT * from recipe ORDER BY name ASC")
    LiveData<List<TableRecipe>> getAllRecipes();
}
