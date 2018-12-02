package ssu.tholland.androidlab3.models;

public class RecipeModel {

    // class member variables
    private String recipeName;
    private String recipeImageUrl;

    //getters and setters
    /*
    public void setRecipeName(String name) {
        recipeName = name;
    }
    public void setRecipeImageUrl(String url) {
        recipeImageUrl = url;
    }
    */

    private RecipeModel() {
        recipeName = "NULL";
        recipeImageUrl = "NULL";
    }

    public String getRecipeName() {
        return recipeName;
    }
    public String getRecipeImageUrl() {return recipeImageUrl;}

    //Builder pattern
    public static class Builder {
        private RecipeModel instance;

        public Builder() {
            instance = new RecipeModel();
        }
        public Builder setRecipeName(String name) {
            instance.recipeName = name;
            return this;
        }
        public Builder setRecipeImageUrl(String url) {
            instance.recipeImageUrl = url;
            return this;
        }
        public RecipeModel build(){
            return instance;
        }
    }
}
