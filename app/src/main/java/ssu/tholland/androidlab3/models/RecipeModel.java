package ssu.tholland.androidlab3.models;

public class RecipeModel {

    // class member variables
    String recipeName;
    String recipeImageUrl;

    public String getRecipeImageUrl() {
        return recipeImageUrl;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeImageUrl(String recipeImageUrl) {
        this.recipeImageUrl = recipeImageUrl;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
}
