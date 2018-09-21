package ssu.tholland.androidlab3.models;

public class RecipeModel {

    private String recipeName;
    private String recipeImageUrl;


    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public String getRecipeImageUrl() {
        return recipeImageUrl;
    }

    public void setRecipeImageUrl(String recipeImageUrl) {
        this.recipeImageUrl = recipeImageUrl;
    }
}
