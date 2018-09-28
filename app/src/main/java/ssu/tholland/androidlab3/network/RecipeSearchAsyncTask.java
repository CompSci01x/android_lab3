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

    private RecipeCallbackListener listener;


    @Override
    protected RecipeModel doInBackground(String... params) {
        String searchParams = params[0];
        OkHttpClient client = new OkHttpClient();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(baseApiUrl).newBuilder();
        urlBuilder.addQueryParameter("_app_key", apiKey);
        urlBuilder.addQueryParameter("_app_id", appId);
        urlBuilder.addQueryParameter("q",searchParams);
        String url = urlBuilder.build().toString();
        Request request = new Request.Builder().url(url).build();
        Response response = null;

        try{
            //response holds server's answer
            response = client.newCall(request).execute();
            if (response!=null){
                return RecipeParser.recipeFromJson(response.body().string());
            }
        } catch (IOException e){
            //do something with exception
        }
        return null;
    }

    @Override
    protected void onPostExecute(RecipeModel recipeModel) {
        super.onPostExecute(recipeModel);
        listener.onRecipeCallback(recipeModel);

    }
    public void setRecipeCallbackListener (RecipeCallbackListener L){
        listener = L;
    }


    public interface RecipeCallbackListener {
        void onRecipeCallback(RecipeModel model);
    }
}
