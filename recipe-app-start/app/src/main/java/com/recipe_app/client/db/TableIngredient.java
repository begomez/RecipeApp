package com.recipe_app.client.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "ingredient")
public class TableIngredient {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id_ingredient")
    private int idIngredient;

    @NonNull
    @ColumnInfo(name = "name")
    private String name;

    @NonNull
    @ColumnInfo(name = "id_user")
    private int idUser;

    @ColumnInfo(name = "picture")
    private String picture;

    @ColumnInfo(name = "shop")
    private String shop;

    @ColumnInfo(name = "notes")
    private String notes;

    @NonNull
    public int getIdIngredient() { return idIngredient; }
    public void setIdIngredient(@NonNull int idIngredient) { this.idIngredient = idIngredient; }

    @NonNull
    public String getName() { return name; }
    public void setName(@NonNull String name) { this.name = name; }

    @NonNull
    public int getIdUser() { return idUser; }
    public void setIdUser(@NonNull int idUser) { this.idUser = idUser; }

    public String getPicture() { return picture; }
    public void setPicture(String picture) { this.picture = picture; }

    public String getShop() { return shop; }
    public void setShop(String shop) { this.shop = shop; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}
