package com.example.eatspire.view;

import static com.example.eatspire.view.MainActivity.controller;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eatspire.R;
import com.example.eatspire.model.EssensOrte.Restaurant;

public class RestaurantActivity extends AppCompatActivity {

    private TextView textViewRestaurantName;
    private Button buttonVorspeisen, buttonHauptspeisen, buttonNachspeisen, buttonGetraenke;
    private Restaurant restaurant;
    private String restaurantName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_activity);

        // Views initialisieren
        textViewRestaurantName = findViewById(R.id.textViewRestaurantName);
        buttonVorspeisen = findViewById(R.id.buttonVorspeisen);
        buttonHauptspeisen = findViewById(R.id.buttonHauptspeisen);
        buttonNachspeisen = findViewById(R.id.buttonNachspeisen);
        buttonGetraenke = findViewById(R.id.buttonGetraenke);

        // Controller & Restaurantdaten
        this.restaurantName = getIntent().getStringExtra("restaurant_name");
        restaurant = controller.getRestaurantByName(restaurantName);

        // UI befüllen
        if (restaurant != null) {
            textViewRestaurantName.setText(restaurant.getName());
            setupButtonListeners();
        } else {
            textViewRestaurantName.setText("Restaurant nicht gefunden");
        }
    }

    private void setupButtonListeners() {
        buttonHauptspeisen.setOnClickListener(v -> {
            Intent intent = new Intent(RestaurantActivity.this, HauptspeisenActivity.class);
            intent.putExtra("restaurant_name", restaurant.getName());
            startActivity(intent);
        });
        buttonVorspeisen.setOnClickListener(v -> {
            Intent intent = new Intent(RestaurantActivity.this, VorspeisenActivity.class);
            intent.putExtra("restaurant_name", restaurant.getName());
            startActivity(intent);
        });

        buttonNachspeisen.setOnClickListener(v -> {
            Intent intent = new Intent(RestaurantActivity.this, NachspeisenActivity.class);
            intent.putExtra("restaurant_name", restaurant.getName());
            startActivity(intent);
        });

        buttonGetraenke.setOnClickListener(v -> {
            Intent intent = new Intent(RestaurantActivity.this, GetraenkeActivity.class);
            intent.putExtra("restaurant_name", restaurant.getName());
            startActivity(intent);
        });
    }
}
