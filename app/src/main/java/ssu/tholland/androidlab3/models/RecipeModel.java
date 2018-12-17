package ssu.tholland.androidlab3.models;

public class RecipeModel {

    // class member variables
    private String recipeName;
    private String recipeImageUrl;

    private RecipeModel(){
        recipeName = "";
        recipeImageUrl = "";
    }

    public String getRecipeName(){
        return recipeName;
    }

    public String getRecipeImageUrl(){
        return recipeImageUrl;
    }


    /*public void setRecipeName(String name){
        this.recipeName = name;
    }

    public void setRecipeImageUrl(String url){
        this.recipeImageUrl = url;
    }*/

    public static class Builder {
        private RecipeModel instance;

        public Builder() {
            instance = new RecipeModel();
        }
        public Builder setRecipeName(String rName) {
            instance.recipeName = rName;
            return this;
        }
        public Builder setRecipeImageUrl(String rImageUrl) {
            instance.recipeImageUrl = rImageUrl;
            return this;
        }
        public RecipeModel build(){
            return instance;
        }
    }

}
