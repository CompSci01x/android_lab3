package ssu.tholland.androidlab3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import ssu.tholland.androidlab3.network.RecipeSearchAsyncTask;

//added this
import ssu.tholland.androidlab3.models.RecipeModel;

public class SearchActivity extends AppCompatActivity {

    private EditText searchEditText =findViewById(R.id.search_edit_text);
    private Button searchButton = findViewById(R.id.search_button);
    private TextView recipeName = findViewById(R.id.recipe_name);
    private ImageView recipeImage = findViewById(R.id.recipe_image);

    private RecipeSearchAsyncTask.RecipeCallbackListener listener;

    private RecipeSearchAsyncTask.RecipeCallbackListener recipeCallbackListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeCallbackListener = new RecipeSearchAsyncTask.RecipeCallbackListener() {
                    @Override
                    public void onRecipeCallback(RecipeModel recipeModel) {
                        recipeName.setText(recipeModel.getRecipeName());
                        //recipeImage.setImage(recipeModel.getRecipeImageUrl() );
                        //i'm not sure if this is in the right place

                        listener.onRecipeCallback(recipeModel);
                    }
                };

                RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();
                task.setRecipeCallbackListener(recipeCallbackListener);
                task.execute(searchEditText.getText().toString());
            }
        });
    }
}
