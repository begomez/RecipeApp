package com.recipe_app.client.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "recipe_notes", primaryKeys = {"id_recipe", "id_note"})
public class TableRecipeNotes {

    @NonNull
    @ColumnInfo(name = "id_recipe")
    private int idRecipe;

    @NonNull
    @ColumnInfo(name = "id_note")
    private int idNote;

    @NonNull
    @ColumnInfo(name = "id_created_by")
    private int idCreatedBy;

    @NonNull
    @ColumnInfo(name = "created_on")
    private String createdOn;

    @NonNull
    @ColumnInfo(name = "contents")
    private String contents;

    @NonNull
    public int getIdRecipe() { return idRecipe; }
    public void setIdRecipe(@NonNull int idRecipe) { this.idRecipe = idRecipe; }

    @NonNull
    public int getIdNote() { return idNote; }
    public void setIdNote(@NonNull int idNote) { this.idNote = idNote; }

    @NonNull
    public int getIdCreatedBy() { return idCreatedBy; }
    public void setIdCreatedBy(@NonNull int idCreatedBy) { this.idCreatedBy = idCreatedBy; }

    @NonNull
    public String getCreatedOn() { return createdOn; }
    public void setCreatedOn(@NonNull String createdOn) { this.createdOn = createdOn; }

    @NonNull
    public String getContents() { return contents; }
    public void setContents(@NonNull String contents) { this.contents = contents; }
}
