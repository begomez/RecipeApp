package com.recipe_app.client.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "recipe")
public class TableRecipe {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id_recipe")
    private int idRecipe;

    @NonNull
    @ColumnInfo(name = "name")
    private String name;

    @NonNull
    @ColumnInfo(name = "id_user")
    private int idUser;

    @ColumnInfo(name = "picture")
    private String picture;

    @ColumnInfo(name = "prep_time")
    private String prepTime;

    @ColumnInfo(name = "level")
    private String level;


    public TableRecipe(String name) {
        this.name = name;
        this.idUser = 0;
        this.picture = "empty";
        this.prepTime = "15 min.";
        this.level = "easy";
    }

    @NonNull
    public int getIdRecipe() { return idRecipe; }
    public void setIdRecipe(@NonNull int idRecipe) { this.idRecipe = idRecipe; }

    @NonNull
    public String getName() { return name; }
    public void setName(@NonNull String name) { this.name = name; }

    @NonNull
    public int getIdUser() { return idUser; }
    public void setIdUser(@NonNull int idUser) { this.idUser = idUser; }

    public String getPicture() { return picture; }
    public void setPicture(String picture) { this.picture = picture; }

    public String getPrepTime() { return prepTime; }
    public void setPrepTime(String prepTime) { this.prepTime = prepTime; }

    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
}
