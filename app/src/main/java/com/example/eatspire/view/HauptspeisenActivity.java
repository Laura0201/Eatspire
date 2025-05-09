package com.example.eatspire.view;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eatspire.R;
import com.example.eatspire.model.EssensOrte.Restaurant;
import com.example.eatspire.model.Nahrung.BasisEssen;

import java.util.List;

/**
 * Activity zur Anzeige aller Hauptspeisen mit Buttons.
 */
public class HauptspeisenActivity extends AppCompatActivity {

    private LinearLayout containerHauptspeisen;
    private TextView textViewRestaurantName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hauptspeisen_activity);

        containerHauptspeisen = findViewById(R.id.containerHauptspeisen);
        textViewRestaurantName = findViewById(R.id.textViewRestaurantName);

        // Intent-Daten prüfen
        String restaurantName = getIntent().getStringExtra("restaurant_name");
        if (restaurantName == null || restaurantName.trim().isEmpty()) {
            textViewRestaurantName.setText("Kein Restaurant angegeben");
            return;
        }

        // Restaurant suchen
        Restaurant restaurant = MainActivity.controller.getRestaurantByName(restaurantName);

        if (restaurant != null) {
            textViewRestaurantName.setText(restaurant.getName());
            zeigeHauptspeisen(restaurant.getHauptspeisen());
        } else {
            textViewRestaurantName.setText("Restaurant nicht gefunden");
        }
    }

    /**
     * Fügt dynamisch Buttons für die übergebenen Hauptspeisen hinzu.
     */
    private void zeigeHauptspeisen(List<? extends BasisEssen> hauptspeisen) {
        if (hauptspeisen == null || hauptspeisen.isEmpty()) {
            TextView leerText = new TextView(this);
            leerText.setText("Keine Hauptspeisen verfügbar.");
            containerHauptspeisen.addView(leerText);
            return;
        }

        for (BasisEssen essen : hauptspeisen) {
            Button btn = new Button(this);
            btn.setText(essen.getName() + " (" + essen.getPreis() + " €)");
            btn.setContentDescription("Wähle Hauptspeise: " + essen.getName());

            btn.setOnClickListener(v ->
                    Toast.makeText(this, essen.getName() + " gewählt", Toast.LENGTH_SHORT).show());

            containerHauptspeisen.addView(btn);
        }
    }
}
