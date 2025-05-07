package com.example.eatspire;

import android.content.Intent;
import android.os.Bundle;
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

import BusinessLogik.EssensOrte.Restaurant;
import BusinessLogik.EssensOrte.RestaurantsListeRecyclerViewAdapter;
import BusinessLogik.MVC.MVCController;
import BusinessLogik.Nahrung.Hauptspeiße;

public class MainActivity1 extends AppCompatActivity {

    private Button buttonRefresh, buttonCurrentLocation, buttonEinstellungen, buttonFilterSortieren, buttonRestaurantDerEmpfehlung;
    private LinearLayout linearLayoutElements;
    private RelativeLayout empfehlungContainer;
    private ImageView bildDesGerichts;
    private TextView nameDesGerichts, beschreibungDesGerichts;
    private RecyclerView restaurantsRecyclerView;
    private RestaurantsListeRecyclerViewAdapter restaurantsListeAdapter;
    private static MVCController controller = new MVCController();;
    public static MVCController getController(){
        return controller;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        empfehlungContainer = findViewById(R.id.dataContainer);
        bildDesGerichts = findViewById(R.id.imageData);
        nameDesGerichts = findViewById(R.id.textTitle);
        beschreibungDesGerichts = findViewById(R.id.textDescription);
        buttonRestaurantDerEmpfehlung = findViewById(R.id.buttonRestaurantDerEmpfehlung);
        restaurantsListeAdapter= new RestaurantsListeRecyclerViewAdapter();
        restaurantsRecyclerView = findViewById(R.id.restaurants_recycler_view);
        restaurantsRecyclerView.setAdapter(restaurantsListeAdapter);
        restaurantsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Initialisierung
        buttonRefresh = findViewById(R.id.buttonRefresh);
        buttonCurrentLocation = findViewById(R.id.buttonCurrentLocation);
        buttonEinstellungen = findViewById(R.id.buttonEinstellungen);
        buttonFilterSortieren = findViewById(R.id.buttonFilterSortieren);
        linearLayoutElements = findViewById(R.id.bottomButtonContainer);
        //Zeile geändert von linearLayoutElements zu bottomButtonContainer, weil
        // das denke ich der Container für die unteren beiden Buttons ist, korrigiert mich tho

        // Button: Refresh
        buttonRefresh.setOnClickListener(v ->{
                Toast.makeText(this, "Daten werden aktualisiert...", Toast.LENGTH_SHORT).show();
        aktualisiereScrollViewRestaurants();
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
        //ScrollView mit Inhalt füllen
        aktualisiereScrollViewRestaurants();
        //Empfehlung einfügen
        aktuaisiereEmpfehlungContainer();

        // Beispiel: Dynamisch Inhalt einfügen
        addExampleContent();
    }

    protected void onResume(){
        super.onResume();
        aktualisiereScrollViewRestaurants();

    }
    private void aktualisiereScrollViewRestaurants(){
        restaurantsListeAdapter.updateRestaurants(controller.model.getDatamanager().getListeAllerRestaurants());
    }
    private void aktuaisiereEmpfehlungContainer(){
        //bildDesGerichts=findViewById(R.drawable.ic_placeholder_restaurant);
        int i = (int) (Math.random() * controller.model.getDatamanager().getListeAllerRestaurants().length);
        Restaurant restaurant = controller.model.getDatamanager().getRestaurant(i);
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
