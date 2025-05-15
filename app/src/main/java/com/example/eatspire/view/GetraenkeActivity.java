package com.example.eatspire.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eatspire.R;
import com.example.eatspire.businesslogik.Nahrung.BasisGetränk;

import java.util.List;

public class GetraenkeActivity extends AppCompatActivity {
    private LinearLayout containerGetraenke;
    private TextView textViewRestaurantName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getraenke_des_restaurants);

        containerGetraenke = findViewById(R.id.getraenkeLayout);
        textViewRestaurantName = findViewById(R.id.textViewRestaurantName);

        String restaurantName = getIntent().getStringExtra("restaurant_name");

        if (restaurantName == null || restaurantName.trim().isEmpty()) {
            textViewRestaurantName.setText("Kein Restaurant angegeben");
            return;
        }
        textViewRestaurantName.setText(restaurantName);

        List<BasisGetränk> getraenke = MainActivity.controller.getGetränkeVon(restaurantName);
        zeigeGetraenke(getraenke, restaurantName);
    }

    private void zeigeGetraenke(List<BasisGetränk> getränke, String restaurantName) {
        if (getränke == null || getränke.isEmpty()) {
            TextView leerText = new TextView(this);
            leerText.setText("Keine Nachspeisen verfügbar.");
            containerGetraenke.addView(leerText);
            return;
        }

        for (int i = 0; i < getränke.size(); i++) {
            BasisGetränk getränk = getränke.get(i);

            LinearLayout itemLayout = new LinearLayout(this);
            itemLayout.setOrientation(LinearLayout.HORIZONTAL);
            itemLayout.setPadding(24, 24, 24, 24);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(0, 0, 0, 0);
            itemLayout.setLayoutParams(params);

            int bildId = MainActivity.controller.getBildResIdAusName(this, getränk.getName(), restaurantName);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(bildId != 0 ? bildId : R.drawable.ic_placeholder_essen);

            LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(120, 120);
            imageParams.setMargins(0, 0, 24, 0);
            imageView.setLayoutParams(imageParams);

            TextView textView = new TextView(this);
            textView.setText(getränk.getName() + " (" + getränk.getPreis() + " €)");
            textView.setTextSize(16);
            textView.setTextColor(0xFF004700);

            itemLayout.addView(imageView);
            itemLayout.addView(textView);
            containerGetraenke.addView(itemLayout);

            if (i < getränke.size() - 1) {
                View trennlinie = new View(this);
                LinearLayout.LayoutParams trennParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        2
                );
                trennParams.setMargins(0, 16, 0, 16);
                trennlinie.setLayoutParams(trennParams);
                trennlinie.setBackgroundColor(0xFFBDBDBD);
                containerGetraenke.addView(trennlinie);
            }
        }
    }
}
