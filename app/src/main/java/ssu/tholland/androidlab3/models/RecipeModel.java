package ssu.tholland.androidlab3.models;

public class RecipeModel {

    private RecipeModel() {}

    // class member variables

    private String recipeName;
    private String recipeImageURL;

    public String getRecipeName() {
        return recipeName;
    }
    public String getRecipeImageURL() {
        return recipeImageURL;
    }

    public static class Builder {
        private String recipeName;
        private String recipeImageUrl;
        private RecipeModel instance;

        public Builder() {}

        public Builder setRecipeName(String name) {
            this.recipeName = name;
            return this;
        }

        public Builder setRecipeImageUrl(String url) {
            this.recipeImageUrl = url;
            return this;
        }

        public RecipeModel build() {
            instance = new RecipeModel();
            instance.recipeName = this.recipeName;
            instance.recipeImageURL = this.recipeImageUrl;
            return instance;
        }
    }


}
