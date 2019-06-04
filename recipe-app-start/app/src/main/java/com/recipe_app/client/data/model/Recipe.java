package com.recipe_app.client.data.model;

public class Recipe {

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
