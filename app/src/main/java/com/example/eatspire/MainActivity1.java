package com.example.eatspire;
import BusinessLogik.Data.DataManager;
import BusinessLogik.Data.UserVerwaltung;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import BusinessLogik.EssensOrte.Restaurant;
import BusinessLogik.EssensOrte.RestaurantsListeRecyclerViewAdapter;
import BusinessLogik.MVC.MVCController;
import BusinessLogik.Nahrung.Hauptspeiße;
import BusinessLogik.UserStuff.User;

public class MainActivity1 extends AppCompatActivity {

    private Button buttonRefresh, buttonCurrentLocation, buttonEinstellungen, buttonFilterSortieren, buttonRestaurantDerEmpfehlung;
    private LinearLayout linearLayoutElements;
    private RelativeLayout empfehlungContainer;
    private ImageView bildDesGerichts;
    private TextView nameDesGerichts, beschreibungDesGerichts;
    private DataManager dataManager;
    private RecyclerView restaurantsRecyclerView;
    private RestaurantsListeRecyclerViewAdapter restaurantsListeAdapter;
    private List<Restaurant> restaurantList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if(controller.model.getUserVerwaltung().getAktuellenUser()==null){
//            startActivity(new Intent(this, UserLoginActivity.class));
//            finish();
//            return;
//        }
        setContentView(R.layout.activity_main);

        // RecyclerView für die Liste der Restaurants
        dataManager= MVCController.getInstance().getModel().getDatamanager();
        setUpRecyclerView();

        empfehlungContainer = findViewById(R.id.dataContainer);
        bildDesGerichts = findViewById(R.id.imageData);
        nameDesGerichts = findViewById(R.id.textTitle);
        beschreibungDesGerichts = findViewById(R.id.textDescription);
        buttonRestaurantDerEmpfehlung = findViewById(R.id.buttonRestaurantDerEmpfehlung);
        buttonRefresh = findViewById(R.id.buttonRefresh);
        buttonCurrentLocation = findViewById(R.id.buttonCurrentLocation);
        buttonEinstellungen = findViewById(R.id.buttonEinstellungen);
        buttonFilterSortieren = findViewById(R.id.buttonFilterSortieren);
        linearLayoutElements = findViewById(R.id.bottomButtonContainer);


        aktualisiereStandortAnzeige();

        empfehlungContainer.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity1.this, HeutigeEmpfehlungActivity.class);
            intent.putExtra("restaurant_name", nameDesGerichts.getText().toString());
            startActivity(intent);
        });

        // Button: Refresh
        buttonRefresh.setOnClickListener(v ->{
                Toast.makeText(this, "Daten werden aktualisiert...", Toast.LENGTH_SHORT).show();

            // Standort muss aktualisiert werden?? Methoden implementieren
                });

        // Button: Aktueller Standort
        buttonCurrentLocation.setOnClickListener(v ->
                Toast.makeText(this, "Standort wird abgerufen...", Toast.LENGTH_SHORT).show());
        //Absprung in die manuelle Standortauswahl?

        // Button: Einstellungen
        buttonEinstellungen.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity1.this, EinstellungenTabActivity.class);
            startActivity(intent);
        });

        // Button: Filter/Sortieren
        buttonFilterSortieren.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity1.this, FilterUndSortierOptionenActivity.class);
            startActivity(intent);
        });
        // Button: Restaurant der Empfehlung
        buttonRestaurantDerEmpfehlung.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity1.this, HeutigeEmpfehlungActivity.class);
            startActivity(intent);
        });

        //Empfehlung einfügen
        aktuaisiereEmpfehlungContainer();

        // Beispiel: Dynamisch Inhalt einfügen
        addExampleContent();
    }

    /**
     * Falls es sinnvoll ist, die Liste der Restaurants bei Rückkehr in diese Activity zu aktualisieren,
     */
    @Override
    protected void onResume() {
        super.onResume();
        // Beispiel: Neue Daten aus dem DataManager abrufen
        Restaurant[] aktualisierteRestaurants = dataManager.getListeAllerRestaurants();

        // Falls sich die Daten geändert haben, informiere den Adapter darüber
        if (restaurantsListeAdapter != null) {
            restaurantsListeAdapter.updateRestaurants(aktualisierteRestaurants);
        }
    }

    private String getPfadfürBildDesRestaurants(int indexAlsId){
        return dataManager.getPfadFürImageDesRestaurants(indexAlsId);
    }
    private void aktualisiereStandortAnzeige() {
        User aktuellerUser = dataManager.getUserVerwaltung().getAktuellenUser();
        if (aktuellerUser != null && aktuellerUser.getStandort() != null) {
            String adresse = aktuellerUser.getStandort().getAdresse();
            buttonCurrentLocation.setText(adresse != null ? adresse : "Standort wählen");
        } else {
            buttonCurrentLocation.setText("Standort wählen");
        }
    }

    private void aktuaisiereEmpfehlungContainer(){
        //bildDesGerichts=findViewById(R.drawable.ic_placeholder_restaurant);
        int i = (int) (Math.random() * MVCController.getInstance().getModel().getDatamanager().getListeAllerRestaurants().length);
        Restaurant restaurant = dataManager.getRestaurant(i);
        Hauptspeiße intern = restaurant .zufälligesGericht(restaurant);
            nameDesGerichts.setText(intern.getName());
            StringBuilder beschreibung = new StringBuilder();
            beschreibung.append("Enthält folgende Zutaten: ");
            for(int j = 0; j<intern.getZutaten().length; j++){
                beschreibung.append(intern.getZutaten()[j]);
                if(j != intern.getZutaten().length-1){
                    beschreibung.append(", ");
                }
            }
            beschreibungDesGerichts.setText(beschreibung);
            buttonRestaurantDerEmpfehlung.setText(restaurant.name);
    }
    /**
     * Konfiguriert den RecyclerView:
     * - Holt die Daten (Restaurant-Objekte) aus dem DataManager.
     * - Wandelt das Array in eine List um.
     * - Setzt einen LayoutManager (hier LinearLayoutManager für eine vertikale Liste).
     * - Initialisiert den Adapter und bindet ihn an den RecyclerView.
     */
    private void setUpRecyclerView() {
        // Hole alle Restaurants als Array und wandle sie in eine Liste um
        Restaurant[] restaurantsArray = dataManager.getListeAllerRestaurants();
        restaurantList = Arrays.asList(restaurantsArray);

        // Hole den RecyclerView aus dem Layout und setze einen LayoutManager
        restaurantsRecyclerView = findViewById(R.id.restaurants_recycler_view);
        restaurantsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Erstelle den Adapter und übergebe ihm die Datenliste
        restaurantsListeAdapter = new RestaurantsListeRecyclerViewAdapter(this, restaurantList);
        restaurantsRecyclerView.setAdapter(restaurantsListeAdapter);
    }


    private void addExampleContent() {
        for (int i = 1; i <= 5; i++) {
            Button dynamicButton = new Button(this);
            dynamicButton.setText("Eintrag " + i);
            dynamicButton.setPadding(16, 16, 16, 16);
            dynamicButton.setOnClickListener(v ->
                    Toast.makeText(this, "Geklickt: " + ((Button)v).getText(), Toast.LENGTH_SHORT).show());
            linearLayoutElements.addView(dynamicButton);
        }
    }
}
