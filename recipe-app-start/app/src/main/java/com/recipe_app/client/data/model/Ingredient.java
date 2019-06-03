package com.recipe_app.client.data.model;

public class Ingredient {

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
