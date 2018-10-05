package ssu.tholland.androidlab3.models;

public class RecipeModel {

    // class member variables
    private String recipeName;
    private String recipeImageUrl;

    //getters and setters
    public void setRecipeName(String name) {
        recipeName = name;
    }
    public void setRecipeImageUrl(String url) {
        recipeImageUrl = url;
    }

    public String getRecipeName() {
        return recipeName;
    }
}
