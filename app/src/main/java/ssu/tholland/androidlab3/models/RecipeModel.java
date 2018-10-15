package ssu.tholland.androidlab3.models;

import android.net.http.SslCertificate;

public class RecipeModel {

    // class member variables
    private String recipeName;
    private String recipeImageUrl;

    public void setRecipeImageUrl(String recipeImageUrl) {
        this.recipeImageUrl = recipeImageUrl;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeImageUrl() {
        return recipeImageUrl;
    }

    public String getRecipeName() {
        return recipeName;
    }
}