package ssu.tholland.androidlab3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import ssu.tholland.androidlab3.models.RecipeModel;
import ssu.tholland.androidlab3.network.RecipeSearchAsyncTask;

public class SearchActivity extends AppCompatActivity {

    private EditText searchEditText;

    private Button searchButton;

    private RecipeSearchAsyncTask.RecipeCallbackListener recipeCallbackListener;
    public void setRecipeCallbackListener(RecipeSearchAsyncTask.RecipeCallbackListener recipeCallbackListener) {
        this.recipeCallbackListener = recipeCallbackListener;
    }

    private TextView recipeName;
    public CharSequence getRecipeName() {
        return (CharSequence) recipeName;
    }
    public void setRecipeName(TextView recipeName) {
        this.recipeName = recipeName;
    }

    private ImageView recipeImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        searchEditText = (EditText)findViewById(R.id.search_edit_text);
        recipeName = (TextView)findViewById(R.id.recipe_name);
        recipeImage = (ImageView)findViewById(R.id.recipe_image);
        searchButton = findViewById(R.id.search_button);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeCallbackListener = new RecipeSearchAsyncTask.RecipeCallbackListener() {
                    @Override
                    public void onRecipeCallback(RecipeModel recipeModel) {
                        recipeName.setText(getRecipeName());
                    }

                };
                RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();
                task.setRecipeCallbackListener(recipeCallbackListener);
                task.execute(searchEditText.getText().toString());
            }
        });
    }
}
