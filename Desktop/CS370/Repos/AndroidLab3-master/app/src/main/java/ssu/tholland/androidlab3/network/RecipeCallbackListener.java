package ssu.tholland.androidlab3.network;
import ssu.tholland.androidlab3.models.RecipeModel;


public interface RecipeCallbackListener {
    void onRecipeCallback(RecipeModel recipeModel);
}