package ssu.tholland.androidlab3.models;

public class RecipeModel {

    // class member variables
    private String recipeName;
    private String recipeImageUrl;

    public String getRecipeName() {
        return recipeName;
    }

    public String getRecipeImageUrl() {
        return recipeImageUrl;
    }

    public void setRecipeName(String R){
        recipeName = R;
    }

    public void setRecipeImageUrl(String R){
        recipeImageUrl = R;
    }

}
