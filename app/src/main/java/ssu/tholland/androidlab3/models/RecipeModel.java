package ssu.tholland.androidlab3.models;

public class RecipeModel {

    // class member variables

    private String recipeName;
    private String recipeImageUrl;

    // get method for recipe name to access
    // private variable recipeName
    public String getRecipeName()
    {
        return recipeName;
    }

    // get method for url of recipe image to access
    // private variable recipeImageUrl
    public String getRecipeImageUrl()
    {
        return recipeImageUrl;
    }


    // set method for recipe name to access
    // private variable recipeName
    public void setRecipeName(String newRecipeName)
    {
        recipeName = newRecipeName;
    }

    // set method for url of recipe image to access
    // private variable recipeImageUrl
    public void setRecipeImage(String newRecipeImageUrl)
    {
        recipeImageUrl = newRecipeImageUrl;
    }

}
