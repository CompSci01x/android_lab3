package ssu.tholland.androidlab3.models;

public class RecipeModel {

    private String recipeName;
    private String recipeImageUrl;

    public String getRecipeName() {
        return  recipeName;
    }

    public String getRecipeImageUrl(){
        return recipeImageUrl;
    }

    public void setRecipeName(String name) {
        this.recipeName = name;
    }

    public void setRecipeImageUrl(String url) {
        this.recipeImageUrl = url;
    }

    // class member variables

}
