package ssu.tholland.androidlab3.models;

public class RecipeModel {

    // class member variables
    private String recipeName;
    private String recipeImageUrl;

    public String getrecipeName() {
        return recipeName;
    }

    public String getrecipeImageUrl() {
        return recipeImageUrl;
    }

    public void setRecipeImageUrl(String recipeImageUrl) {
        this.recipeImageUrl = recipeImageUrl;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
}

