package ssu.tholland.androidlab3.models;

public class RecipeModel {

    private static String recipeName; // class member variables
    private static String recipeImageUrl;

    public static String getrecipeName() {
        return recipeName;
    }
    public static void setrecipeName(String description) {
        recipeName = description;
    }

    public static String getrecipeImageUrl() {
        return recipeImageUrl;
    }
    public static void setrecipeImageUrl(String imageurl) {
        recipeImageUrl = imageurl;
    }
}
