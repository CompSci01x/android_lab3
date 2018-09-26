package ssu.tholland.androidlab3.models;

public class RecipeModel {

    private String recipeName;
    private String recipeImageUrl;
    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeImageUrl() {
        return recipeImageUrl;
    }

    public void setRecipeImageUrl(String recipeImageUrl) {
        this.recipeImageUrl = recipeImageUrl;
    }



    // class member variables
    private String recipeDescription;
    private String recipeImage;

    public String getrecipeName() {
        return recipeName;
    }


    public String getRecipeDescription() {
        return recipeDescription;
    }

    public String getrecipeImage() {
        return recipeImage;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    public void setrecipeImage(String recipeImage) {
        this.recipeImage = recipeImage;
    }
}
