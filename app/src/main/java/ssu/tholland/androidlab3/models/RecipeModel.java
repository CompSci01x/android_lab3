package ssu.tholland.androidlab3.models;

public class RecipeModel {

    // class member variables
    private String recipeDescription;
    private String recipeImage;
    private String recipeName;

    public String getrecipeName() {
        return recipeName;
    }

    public void setrecipeName(String recipeName) {
        this.recipeName = recipeName;
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
