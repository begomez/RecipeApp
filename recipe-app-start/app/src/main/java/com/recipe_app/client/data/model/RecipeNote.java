package com.recipe_app.client.data.model;

public class RecipeNote {

    private Recipe      recipe;
    private String      noteMadeBy; //TODO to show also the picture!
    private String      noteMadeOn;
    private String      noteText;

    public RecipeNote() {
    }

    public RecipeNote(String noteMadeBy, String noteMadeOn, String noteText) {
        this.noteMadeBy = noteMadeBy;
        this.noteMadeOn = noteMadeOn;
        this.noteText = noteText;
    }

    public Recipe getRecipe() { return recipe; }
    public void setRecipe(Recipe recipe) { this.recipe = recipe; }

    public String getNoteMadeBy() { return noteMadeBy; }
    public void setNoteMadeBy(String noteMadeBy) { this.noteMadeBy = noteMadeBy; }

    public String getNoteMadeOn() { return noteMadeOn; }
    public void setNoteMadeOn(String noteMadeOn) { this.noteMadeOn = noteMadeOn; }

    public String getNoteText() { return noteText; }
    public void setNoteText(String noteText) { this.noteText = noteText; }
}
