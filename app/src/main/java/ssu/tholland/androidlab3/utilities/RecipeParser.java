package ssu.tholland.androidlab3.utilities;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

import ssu.tholland.androidlab3.models.RecipeModel;

import static ssu.tholland.androidlab3.models.RecipeModel.getrecipeName;

public class RecipeParser {

    public static RecipeModel recipeFromJson(String jsonString) {

        RecipeModel model = null;

        try {
            JSONObject response = new JSONObject(jsonString);
            JSONArray matches = response.getJSONArray("matches");
            JSONObject recipe = matches.getJSONObject(0);

            JSONArray url = response.getJSONArray("smallImageUrls");
            String smallurl = url.getString(0);
            JSONArray names = response.getJSONArray("recipeName");
            String name = names.getString(0);
            model = new RecipeModel();
            model.setrecipeImageUrl(smallurl);
            model.setrecipeName(name);

          // JSONObject smallImageUrl = matches.getJSONObject();




            // finish deserializing and creating a model

        } catch (JSONException ex) {
            // do something useful with exception
        }

        return null;
    }

}


// ******** SAMPLE RESPONSE FROM YUMMLY API ***********
// http://api.yummly.com/v1/api/recipes?_app_key=ec3e34e0bb6801670dbd3dbd02ce7608&_app_id=4911b643&q=eggs
/*
{
  "criteria": {
    "q": "lemon",
    "allowedIngredient": null,
    "excludedIngredient": null
  },
  "matches": [
    {
      "imageUrlsBySize": {
        "90": "https://lh3.googleusercontent.com/nFnxFbtS0-tPfFgeZSn4qVnHwJqVhdk1itSKcMO_H4Z-H_m85dm_-Dwx11lWn6M67KuZ_1ke1zrA9CnDEjm0aGQ=s90-c"
      },
      "sourceDisplayName": "Saving Room for Dessert",
      "ingredients": [
        "unsalted butter",
        "sugar",
        "lemon zest",
        "fresh lemon juice",
        "unbleached all purpose flour",
        "cornstarch",
        "salt",
        "confectioners' sugar"
      ],
      "id": "Lemon-Meltaways-1985782",
      "smallImageUrls": [
        "https://lh3.googleusercontent.com/jLDJ-mlRcQThw1mzfJYiHAtVf0jOcJZF6nVTxTITePMvsIoVrdUDPtiTt3UxBzRrXS0kr8SuDJxxpqvwND94WQ=s90"
      ],
      "recipeName": "Lemon Meltaways",
      "totalTimeInSeconds": 1980,
      "attributes": {
        "course": [
          "Desserts",
          "Afternoon Tea"
        ]
      },
      "flavors": {
        "piquant": 0.5,
        "meaty": 0.6666666666666666,
        "bitter": 0.16666666666666666,
        "sweet": 0.8333333333333334,
        "sour": 0.3333333333333333,
        "salty": 0.16666666666666666
      },
      "rating": 4
    },
    // more matches...
    { ... },
    { ... },
    { ... },
    { ... },
    { ... },
    { ... },
    { ... },
    { ... },
    { ... },
    { ... }
  ],
  "facetCounts": { ... },
  "totalMatchCount": 247614,
  "attribution": { ... }
}

*/
