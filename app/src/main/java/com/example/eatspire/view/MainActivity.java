package com.example.eatspire.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eatspire.R;
import com.example.eatspire.controller.AppController;
import com.example.eatspire.model.Data.UserVerwaltung;
import com.example.eatspire.model.EssensOrte.Restaurant;
import com.example.eatspire.model.UserStuff.User;


public class MainActivity extends AppCompatActivity {

    private Button buttonRefresh, buttonCurrentLocation, buttonEinstellungen, buttonFilterSortieren;
    private LinearLayout linearLayoutElements;

    public static AppController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Prüfen ob Nutzer eingeloggt ist
        if (AppController.getInstance().getDataManager().getUserVerwaltung().getAktuellerUser() == null) {
            startActivity(new Intent(this, UserLoginActivity.class));
            finish();
            return;
        }
        setContentView(R.layout.activity_main);

        controller = AppController.getInstance();

        // UI
        buttonRefresh = findViewById(R.id.buttonRefresh);
        buttonCurrentLocation = findViewById(R.id.buttonStandortAnzeige);
        buttonEinstellungen = findViewById(R.id.buttonEinstellungen);
        buttonFilterSortieren = findViewById(R.id.buttonFilterSortieren);
        linearLayoutElements = findViewById(R.id.linearLayoutElements);

        // Buttons
        buttonRefresh.setOnClickListener(v ->
                recreate());

        buttonCurrentLocation.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, StandortActivity.class);
            startActivity(intent);
        });

        buttonEinstellungen.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, EinstellungenTabActivity.class);
            startActivity(intent);
        });

        buttonFilterSortieren.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FilterUndSortierOptionenActivity.class);
            startActivity(intent);
        });

        zeigeRestaurants();
        aktualisiereStandortanzeige();
    }

    private void aktualisiereStandortanzeige() {
        User aktuellerUser = MainActivity.controller.getAktuellerUser();
        if (aktuellerUser != null && aktuellerUser.getStandort() != null) {
            String adresse = aktuellerUser.getStandort().getAdresse();
            buttonCurrentLocation.setText(adresse != null ? adresse : "Standort wählen");
        } else {
            buttonCurrentLocation.setText("Standort wählen");
        }
    }

    private void zeigeRestaurants() {
        Restaurant[] restaurants = MainActivity.controller.getAlleRestaurants();
        LayoutInflater inflater = LayoutInflater.from(this);

        for (Restaurant r : restaurants) {
            View itemView = inflater.inflate(R.layout.restaurant_item_view, linearLayoutElements, false);

            ImageView bild = itemView.findViewById(R.id.bildDesRestaurants);
            TextView name = itemView.findViewById(R.id.nameDesRestaurantsTextView);
            TextView beschreibung = itemView.findViewById(R.id.beschreibungDesRestaurantsTextView);
            TextView adresse = itemView.findViewById(R.id.adresseDesRestaurantsTextview);
            TextView website = itemView.findViewById(R.id.websiteDesRestaurantsTextView);
            TextView kategorie = itemView.findViewById(R.id.kategorieDesRestaurantsTextView);

            name.setText(r.getName());
            beschreibung.setText(r.getBeschreibung());
            adresse.setText(r.getAdressfeld());
            website.setText(r.getWebsite());
            kategorie.setText(r.getKategorie().name());
            int bildResId = r.getBildResourceId();
            bild.setImageResource(bildResId != 0 ? bildResId : R.drawable.ic_placeholder_restaurant);

            itemView.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, RestaurantActivity.class);
                intent.putExtra("restaurant_name", r.getName());
                startActivity(intent);
            });

            linearLayoutElements.addView(itemView);
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        aktualisiereStandortanzeige();
    }
}
