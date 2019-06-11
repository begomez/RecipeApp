package com.recipe_app.client.data.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Recipe implements Parcelable {

    private String photo;
    private String name;
    private String preparation;
    private String timeToPrepare;
    private String levelOfDifficulty;
    private String notes;

    public Recipe() {
    }

    public Recipe(String photo, String name, String preparation, String notes, String timeToPrepare, String levelOfDifficulty) {
        this.photo = photo;
        this.name = name;
        this.preparation = preparation;
        this.notes = notes;
        this.timeToPrepare = timeToPrepare;
        this.levelOfDifficulty = levelOfDifficulty;
    }

    protected Recipe(Parcel in) {
        photo = in.readString();
        name = in.readString();
        preparation = in.readString();
        timeToPrepare = in.readString();
        levelOfDifficulty = in.readString();
        notes = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(photo);
        dest.writeString(name);
        dest.writeString(preparation);
        dest.writeString(timeToPrepare);
        dest.writeString(levelOfDifficulty);
        dest.writeString(notes);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Recipe> CREATOR = new Creator<Recipe>() {
        @Override
        public Recipe createFromParcel(Parcel in) {
            return new Recipe(in);
        }

        @Override
        public Recipe[] newArray(int size) {
            return new Recipe[size];
        }
    };

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPreparation() { return preparation; }
    public void setPreparation(String preparation) { this.preparation = preparation; }

    public String getTimeToPrepare() { return timeToPrepare; }
    public void setTimeToPrepare(String timeToPrepare) { this.timeToPrepare = timeToPrepare; }

    public String getLevelOfDifficulty() { return levelOfDifficulty; }
    public void setLevelOfDifficulty(String levelOfDifficulty) { this.levelOfDifficulty = levelOfDifficulty; }

}
