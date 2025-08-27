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
        String[] dishes = {
                "Mushroom and tofu maki",
                "Egg and avocado uramaki",
                "Melon and lemon soup",
                "Coconut and chocolate mousse",
                "Spinach and cabbage wontons",
                "Broccoli and cucumber soup",
                "Chilli and aubergine dip",
                "Chickpea and chilli gyoza",
                "Sprout and pineapple soup",
                "Egusi and borscht soup",
                "Aubergine and egg sushi",
                "Artichoke and mustard soup",
                "Peppercorn and tamarind soup",
                "Parsley and celeriac parcels",
                "Pasta and broccoli soup",
                "Potato and courgette soup",
                "Chickpea and cabbage parcels",
                "Coriander and peppercorn gyoza",
                "Pear and chestnut soup",
                "Pesto and garam masala parcels"
        };

        ArrayAdapter<String> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dishes);
        startersList.setAdapter(dishesAdapter);
    }
}