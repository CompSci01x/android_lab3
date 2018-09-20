package ssu.tholland.androidlab3.network;

import android.os.AsyncTask;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import ssu.tholland.androidlab3.models.RecipeModel;
import ssu.tholland.androidlab3.utilities.RecipeParser;

public class RecipeSearchAsyncTask extends AsyncTask<String, Void, RecipeModel> {

    private final String baseApiUrl = "http://api.yummly.com/v1/api/recipes";
    private final String apiKey = "ec3e34e0bb6801670dbd3dbd02ce7608";
    private final String appId = "4911b643";


    @Override
    protected RecipeModel doInBackground(String... params) {

        return null;
    }


    public interface RecipeCallbackListener {
        void onRecipeCallback(RecipeModel model);
    }
}
