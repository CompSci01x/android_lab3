package ssu.tholland.androidlab3.models;

public class RecipeModel {
    // class member variables
    private String recipeName;
    private String recipeImageUrl;

    public static class Builder {
        private RecipeModel instance;

        public Builder() {
            instance = new RecipeModel();
        }

        public Builder setRecipeName(String newRecipeName) {
            instance.recipeName = newRecipeName;
            return this;
        }

        public Builder setRecipeImage(String newRecipeImageUrl) {
            instance.recipeImageUrl = newRecipeImageUrl;
            return this;
        }

        public RecipeModel build() {
            return instance;
        }
    }
        // get method for recipe name to access private var recipeName
    public String getRecipeName() {
            return recipeName;
    }
        // get method for url of recipe image to access private var recipeImageUrl
    public String getRecipeImageUrl() {
            return recipeImageUrl;
    }
        // changed by implementing builder
        // set method for recipe name to access priv. var. recipeName
        //public void setRecipeName(String newRecipeName) {
        //    recipeName = newRecipeName; //}
        // set method for url of recipe image to access priv. var. recipeImageUrl
        //public void setRecipeImage(String newRecipeImageUrl) {
        //    recipeImageUrl = newRecipeImageUrl; //}
}
