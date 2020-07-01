package com.recipe_app.client.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "recipe_ingredients", primaryKeys = {"id_recipe", "id_ingredient"})
public class TableRecipeIngredients {

    @NonNull
    @ColumnInfo(name = "id_recipe")
    private int idRecipe;

    @NonNull
    @ColumnInfo(name = "id_ingredient")
    private int idIngredient;

    @NonNull
    @ColumnInfo(name = "qty")
    private int qty;

    @NonNull
    @ColumnInfo(name = "uom")
    private String uom;

    @ColumnInfo(name = "optional")
    private boolean optionalInRecipe;


    @NonNull
    public int getIdRecipe() { return idRecipe; }
    public void setIdRecipe(@NonNull int idRecipe) { this.idRecipe = idRecipe; }

    @NonNull
    public int getIdIngredient() { return idIngredient; }
    public void setIdIngredient(@NonNull int idIngredient) { this.idIngredient = idIngredient; }

    @NonNull
    public int getQty() { return qty; }
    public void setQty(@NonNull int qty) { this.qty = qty; }

    @NonNull
    public String getUom() { return uom; }
    public void setUom(@NonNull String uom) { this.uom = uom; }

    @NonNull
    public boolean getOptionalInRecipe() { return optionalInRecipe; }
    public void setOptionalInRecipe(@NonNull boolean optionalInRecipe) { this.optionalInRecipe = optionalInRecipe; }

}
