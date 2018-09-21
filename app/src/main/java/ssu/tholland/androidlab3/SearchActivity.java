package ssu.tholland.androidlab3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import ssu.tholland.androidlab3.network.RecipeSearchAsyncTask;

public class SearchActivity extends AppCompatActivity {

    private EditText searchEditText;
    private Button searchButton;
    private TextView recipeName;
    private ImageView recipeImage;
    private RecipeSearchAsyncTask.RecipeCallbackListener recipeCallbackListener;

    private RecipeSearchAsyncTask.RecipeCallbackListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchEditText = findViewById(R.id.search_edit_text);
                searchButton = findViewById(R.id.search_button);
                recipeName = findViewById(R.id.recipe_name);
                recipeImage = findViewById(R.id.recipe_image);

                recipeCallbackListener = new RecipeCallbackListener() {
                    @Override
                    public void onRecipeCallback ( RecipeModel recipeModel){
                        recipeName.setText(recipeModel.getRecipeName());
                    }
                };
                RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();
                task.setRecipeCallbackListener(recipeCallbackListener);
                task.execute(searchEditText.getText().toString());
            }
        });
    }
}
