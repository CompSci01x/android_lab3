package ssu.tholland.androidlab3.models;

public class RecipeModel {

    // class member variables
    private String recipeName;
    private String recipeImageURL;

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeImageURL() {
        return recipeImageURL;
    }

    public void setRecipeImageURL(String recipeImageURL) {
        this.recipeImageURL = recipeImageURL;
    }

    public RecipeModel() {
        recipeName = "NULL";
        recipeImageURL = "NULL";
    }

    public String getRecipeName() {
        return recipeName;
    }
    public String getRecipeImageUrl() {return recipeImageURL;}

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
            instance.recipeImageURL = url;
            return this;
        }
        public RecipeModel build(){
            return instance;
        }
    }
}
