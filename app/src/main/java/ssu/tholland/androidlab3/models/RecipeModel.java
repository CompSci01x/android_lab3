package ssu.tholland.androidlab3.models;

public class RecipeModel {
    // class member variables
    //make getters and setters
    private String recipeName;
    private String recipeImageUrl;

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void setRecipeImageUrl(String recipeImageUrl) {
        this.recipeImageUrl = recipeImageUrl;
    }

    public String getRecipeImageUrl() {
        return recipeImageUrl;
    }

    public String getRecipeName() {
        return recipeName;
    }
}
