package com.recipe_app.client.data.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Ingredient implements Parcelable {

    private String photo;
    private String name;
    private String whereToBuy;
    private String notes;

    public Ingredient() {
    }
    public Ingredient(String photo, String name, String whereToBuy, String notes) {
        this.photo = photo;
        this.name = name;
        this.whereToBuy = whereToBuy;
        this.notes = notes;
    }

    protected Ingredient(Parcel in) {
        photo = in.readString();
        name = in.readString();
        whereToBuy = in.readString();
        notes = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(photo);
        dest.writeString(name);
        dest.writeString(whereToBuy);
        dest.writeString(notes);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Ingredient> CREATOR = new Creator<Ingredient>() {
        @Override
        public Ingredient createFromParcel(Parcel in) {
            return new Ingredient(in);
        }

        @Override
        public Ingredient[] newArray(int size) {
            return new Ingredient[size];
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

    public String getWhereToBuy() {
        return whereToBuy;
    }

    public void setWhereToBuy(String whereToBuy) {
        this.whereToBuy = whereToBuy;
    }

}
