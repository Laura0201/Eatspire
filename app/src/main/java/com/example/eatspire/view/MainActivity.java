package com.example.eatspire.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.example.eatspire.R;
import com.example.eatspire.controller.AppController;
import com.example.eatspire.model.EssensOrte.Kategorien;
import com.example.eatspire.model.EssensOrte.Restaurant;
import com.example.eatspire.model.UserStuff.Standort;
import com.example.eatspire.model.UserStuff.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Button buttonRefresh, buttonCurrentLocation, buttonEinstellungen, buttonFilterSortieren;
    private LinearLayout linearLayoutElements;
    private RelativeLayout dataContainer;
    private ImageView imageData;
    private TextView textTitle, textDescription;

    public static AppController controller;
    private List<Restaurant> letzteAngezeigteRestaurants;

    // Bundle zum Speichern der zuletzt verwendeten Filterdaten
    private Bundle letzteFilterDaten = new Bundle();

    private final ActivityResultLauncher<Intent> filterLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    Intent data = result.getData();
                    if (data != null) {
                        int umkreis = data.getIntExtra("umkreis", 0);
                        boolean toGo = data.getBooleanExtra("toGo", false);
                        boolean open = data.getBooleanExtra("open", false);
                        boolean vegetarian = data.getBooleanExtra("vegetarian", false);

                        boolean italian = data.getBooleanExtra("italian", false);
                        boolean asian = data.getBooleanExtra("asian", false);
                        boolean fastfood = data.getBooleanExtra("fastfood", false);
                        boolean snacks = data.getBooleanExtra("snacks", false);
                        boolean spirits = data.getBooleanExtra("spirits", false);
                        boolean french = data.getBooleanExtra("french", false);
                        boolean german = data.getBooleanExtra("german", false);

                        // Speichern der Filterdaten zur Wiederverwendung
                        letzteFilterDaten.putInt("umkreis", umkreis);
                        letzteFilterDaten.putBoolean("toGo", toGo);
                        letzteFilterDaten.putBoolean("open", open);
                        letzteFilterDaten.putBoolean("vegetarian", vegetarian);
                        letzteFilterDaten.putBoolean("italian", italian);
                        letzteFilterDaten.putBoolean("asian", asian);
                        letzteFilterDaten.putBoolean("fastfood", fastfood);
                        letzteFilterDaten.putBoolean("snacks", snacks);
                        letzteFilterDaten.putBoolean("spirits", spirits);
                        letzteFilterDaten.putBoolean("french", french);
                        letzteFilterDaten.putBoolean("german", german);

                        List<Kategorien> kategorien = new ArrayList<>();
                        if (italian) kategorien.add(Kategorien.ITALIENISCH);
                        if (asian) kategorien.add(Kategorien.ASIATISCH);
                        if (fastfood) kategorien.add(Kategorien.FASTFOOD);
                        if (snacks) kategorien.add(Kategorien.SNACKS);
                        if (spirits) kategorien.add(Kategorien.SPIRITUOSEN);
                        if (french) kategorien.add(Kategorien.FRANZÖSISCH);
                        if (german) kategorien.add(Kategorien.DEUTSCH);

                        boolean sortiereNachEntfernung = true;

                        List<Restaurant> gefiltert = controller.anwendenVonFilternUndSortierung(
                                umkreis,
                                toGo, open, vegetarian,
                                kategorien,
                                sortiereNachEntfernung
                        );

                        if (gefiltert == null || gefiltert.isEmpty()) {
                            Toast.makeText(MainActivity.this, "Keine Restaurants gefunden", Toast.LENGTH_SHORT).show();
                        } else {
                            letzteAngezeigteRestaurants = gefiltert;
                            zeigeRestaurants(gefiltert);
                        }
                    }
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (AppController.getInstance().getAktuellerUser() == null) {
            startActivity(new Intent(this, UserLoginActivity.class));
            finish();
            return;
        }
        setContentView(R.layout.activity_main);

        controller = AppController.getInstance();

        buttonRefresh = findViewById(R.id.buttonRefresh);
        buttonCurrentLocation = findViewById(R.id.buttonStandortAnzeige);
        buttonEinstellungen = findViewById(R.id.buttonEinstellungen);
        buttonFilterSortieren = findViewById(R.id.buttonFilterSortieren);
        linearLayoutElements = findViewById(R.id.linearLayoutElements);
        dataContainer = findViewById(R.id.dataContainer);
        imageData = findViewById(R.id.imageData);
        textTitle = findViewById(R.id.textTitle);
        textDescription = findViewById(R.id.textDescription);

        buttonRefresh.setOnClickListener(v -> recreate());

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
            intent.putExtras(letzteFilterDaten); // Zustand übergeben
            filterLauncher.launch(intent);
        });
        Restaurant randomRestaurant = AppController.getInstance().getDataManager().getRandomRestaurant();
        textTitle.setText("Heutige Empfehlung: "+randomRestaurant.getName());
        textDescription.setText(randomRestaurant.getBeschreibung());
        imageData.setImageResource(R.drawable.empfehlung_bild); // Ersetze mit einem tatsächlichen Bild in drawable

        dataContainer.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RestaurantActivity.class);
            intent.putExtra("restaurant_name", randomRestaurant.getName());
            startActivity(intent);
        });
        // Beim ersten Öffnen alle Restaurants anzeigen
        letzteAngezeigteRestaurants = List.of(controller.getAlleRestaurants());
        zeigeRestaurants(letzteAngezeigteRestaurants);
        aktualisiereStandortanzeige();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppController.getInstance().logout();
    }

    private void aktualisiereStandortanzeige() {
        User aktuellerUser = controller.getAktuellerUser();
        if (aktuellerUser != null && aktuellerUser.getStandort() != null) {
            String adresse = aktuellerUser.getStandort().getAdresse();
            buttonCurrentLocation.setText(adresse != null ? adresse : "Standort wählen");
        } else {
            buttonCurrentLocation.setText("Standort wählen");
        }
    }

    private void zeigeRestaurants(List<Restaurant> restaurants) {
        linearLayoutElements.removeAllViews();
        LayoutInflater inflater = LayoutInflater.from(this);

        for (Restaurant r : restaurants) {
            View itemView = inflater.inflate(R.layout.restaurant_item_view, linearLayoutElements, false);

            ImageView bild = itemView.findViewById(R.id.bildDesRestaurants);
            TextView name = itemView.findViewById(R.id.nameDesRestaurantsTextView);
            TextView beschreibung = itemView.findViewById(R.id.beschreibungDesRestaurantsTextView);
            TextView adresse = itemView.findViewById(R.id.adresseDesRestaurantsTextview);
            TextView entfernungTextView = itemView.findViewById(R.id.entfernungDesRestaurantsTextView); // muss im Layout vorhanden sein
            Standort userStandort = AppController.getInstance().getAktuellerUser().getStandort();
            if (userStandort != null) {
                float entfernung = AppController.getInstance().berechneEntfernung(userStandort, r);
                entfernungTextView.setText(String.format(Locale.getDefault(), "%.0f m entfernt", entfernung));
            } else {
                entfernungTextView.setText("Keine Standortdaten");
            }
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
