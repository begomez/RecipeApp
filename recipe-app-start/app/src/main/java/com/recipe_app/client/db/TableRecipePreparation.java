package com.recipe_app.client.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "recipe_preparation", primaryKeys = {"id_recipe", "id_preparation"})
public class TableRecipePreparation {

    @NonNull
    @ColumnInfo(name = "id_recipe")
    private int idRecipe;

    @NonNull
    @ColumnInfo(name = "id_preparation")
    private int idPreparation;

    @NonNull
    @ColumnInfo(name = "step")
    private int step;

    @NonNull
    @ColumnInfo(name = "description")
    private String description;


    @NonNull
    public int getIdRecipe() { return idRecipe; }
    public void setIdRecipe(@NonNull int idRecipe) { this.idRecipe = idRecipe; }

    @NonNull
    public int getIdPreparation() { return idPreparation; }
    public void setIdPreparation(@NonNull int idPreparation) { this.idPreparation = idPreparation; }

    @NonNull
    public int getStep() { return step; }
    public void setStep(@NonNull int step) { this.step = step; }

    @NonNull
    public String getDescription() { return description; }
    public void setDescription(@NonNull String description) { this.description = description; }

}
