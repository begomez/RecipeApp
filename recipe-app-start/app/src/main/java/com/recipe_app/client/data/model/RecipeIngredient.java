package com.recipe_app.client.data.model;

public class RecipeIngredient {

    private Ingredient  ingredient;
    private int         quantity;
    private String      uom;

    public RecipeIngredient() {
    }

    public RecipeIngredient(Ingredient ingredient, int quantity, String uom) {
        this.ingredient = ingredient;
        this.quantity = quantity;
        this.uom = uom;
    }

    public RecipeIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
        this.quantity = 1;
        this.uom = "";
    }

    public Ingredient getIngredient() { return ingredient; }
    public void setIngredient(Ingredient ingredient) { this.ingredient = ingredient; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getUom() { return uom; }
    public void setUom(String uom) { this.uom = uom; }
}
