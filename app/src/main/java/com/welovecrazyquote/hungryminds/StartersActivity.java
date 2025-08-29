package com.welovecrazyquote.hungryminds;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StartersActivity extends AppCompatActivity {

    ImageView backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_starters);
        backbutton = findViewById(R.id.backButton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getOnBackPressedDispatcher().onBackPressed();
            }
        });
        ListView startersList = findViewById(R.id.list_view_starters);


        Dish[] dishes = {
                new Dish(
                        "Mushroom and tofu maki",
                        "Delicate sushi rolls filled with marinated tofu and earthy mushrooms, wrapped in seasoned rice and nori for a light yet satisfying bite.",
                        999
                ),
                new Dish(
                        "Egg and avocado uramaki",
                        "A fresh inside-out sushi roll featuring creamy avocado and soft-cooked egg, topped with sesame seeds for extra flavor and texture.",
                        800
                ),
                new Dish(
                        "Melon and lemon soup",
                        "A refreshing chilled soup made with sweet melon and zesty lemon, perfect as a light and vibrant appetizer or palate cleanser.",
                        2000
                )

        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        startersList.setAdapter(dishesAdapter);
    }
}