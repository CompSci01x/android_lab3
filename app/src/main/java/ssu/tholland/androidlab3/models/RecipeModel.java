package ssu.tholland.androidlab3.models;

public class RecipeModel {

    // class member variables
    String recipeName;
    String recipeImageUrl;

    public String getRecipeName() {
        return recipeName;
    }

    public String getRecipeImageUrl() {
        return recipeImageUrl;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void setRecipeImageUrl(String recipeImageUrl) {
        this.recipeImageUrl = recipeImageUrl;
    }
}
