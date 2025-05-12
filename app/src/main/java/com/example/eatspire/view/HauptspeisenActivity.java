package com.example.eatspire.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eatspire.R;
import com.example.eatspire.model.Nahrung.BasisEssen;
import com.example.eatspire.model.Nahrung.Hauptspeise;

import java.util.List;

public class HauptspeisenActivity extends AppCompatActivity {

    private LinearLayout containerHauptspeisen;
    private TextView textViewRestaurantName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hauptspeisen_activity);

        containerHauptspeisen = findViewById(R.id.containerHauptspeisen);
        textViewRestaurantName = findViewById(R.id.textViewRestaurantName);

        String restaurantName = getIntent().getStringExtra("restaurant_name");

        if (restaurantName == null || restaurantName.trim().isEmpty()) {
            textViewRestaurantName.setText("Kein Restaurant angegeben");
            return;
        }

        textViewRestaurantName.setText(restaurantName);

        List<Hauptspeise> hauptspeisen = MainActivity.controller.getHauptspeisenVon(restaurantName);
        zeigeHauptspeisen(hauptspeisen);
    }

    private void zeigeHauptspeisen(List<? extends BasisEssen> hauptspeisen) {
        if (hauptspeisen == null || hauptspeisen.isEmpty()) {
            TextView leerText = new TextView(this);
            leerText.setText("Keine Hauptspeisen verfügbar.");
            containerHauptspeisen.addView(leerText);
            return;
        }

        for (int i = 0; i < hauptspeisen.size(); i++) {
            BasisEssen essen = hauptspeisen.get(i);

            // Layout für Gerichtseintrag
            LinearLayout itemLayout = new LinearLayout(this);
            itemLayout.setOrientation(LinearLayout.HORIZONTAL);
            itemLayout.setPadding(24, 24, 24, 24);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(0, 0, 0, 0); // kein zusätzlicher Abstand unten – die Linie übernimmt das
            itemLayout.setLayoutParams(params);

            // Bild dynamisch aus dem Namen ermitteln
            int bildId = MainActivity.controller.getBildResIdAusName(this, essen.getName());
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(bildId != 0 ? bildId : R.drawable.ic_placeholder_essen);
            LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(120, 120);
            imageParams.setMargins(0, 0, 24, 0);
            imageView.setLayoutParams(imageParams);

            // Text: Name + Preis
            TextView textView = new TextView(this);
            textView.setText(essen.getName() + " (" + essen.getPreis() + " €)");
            textView.setTextSize(16);
            textView.setTextColor(0xFF004700);

            // Zusammenfügen
            itemLayout.addView(imageView);
            itemLayout.addView(textView);
            containerHauptspeisen.addView(itemLayout);

            // Optional: Linie NACH jedem Gericht (außer dem letzten)
            if (i < hauptspeisen.size() - 1) {
                View trennlinie = new View(this);
                LinearLayout.LayoutParams trennParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        2
                );
                trennParams.setMargins(0, 16, 0, 16); // Abstand oberhalb und unterhalb der Linie
                trennlinie.setLayoutParams(trennParams);
                trennlinie.setBackgroundColor(0xFFBDBDBD); // hellgrau
                containerHauptspeisen.addView(trennlinie);
            }
        }
    }
}