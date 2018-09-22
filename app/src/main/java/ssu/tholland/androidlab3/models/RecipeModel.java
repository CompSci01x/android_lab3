package ssu.tholland.androidlab3.models;

import android.os.Build;

public class RecipeModel {

    private RecipeModel(){

    }


    // class member variables
    private String recipeName;
    private String recipeImageUrl;

    public String getRecipeName() {
        return recipeName;
    }

    public String getRecipeImageUrl() {
        return recipeImageUrl;
    }


    public static class Builder{
        private String recipeName;
        private String recipeImageUrl;

        private RecipeModel instance;

        public Builder(){
            instance = new RecipeModel();
        }

        public Builder setRecipeName(String recipeName){
            this.recipeName = recipeName;
            return this;
        }

        public Builder setRecipeImage(String recipeImageUrl){
            this.recipeImageUrl = recipeImageUrl;
            return this;
        }

        public RecipeModel build(){
            RecipeModel model = new RecipeModel();
            model.recipeName = this.recipeName;
            model.recipeImageUrl = this.recipeImageUrl;

            return model;
        }
    }
}
