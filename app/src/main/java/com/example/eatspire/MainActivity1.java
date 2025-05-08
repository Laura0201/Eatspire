package com.example.eatspire;
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
    private RecyclerView restaurantsRecyclerView;
    private RestaurantsListeRecyclerViewAdapter restaurantsListeAdapter;


    private static MVCController controller = new MVCController();;
    public static MVCController getController(){
        return controller;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        if(controller.model.getUserVerwaltung().getAktuellenUser()==null){
//            startActivity(new Intent(this, UserLoginActivity.class));
//            finish();
//            return;
//        }
        setContentView(R.layout.activity_main);
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
        //Zeile geändert von linearLayoutElements zu bottomButtonContainer, weil
        // das denke ich der Container für die unteren beiden Buttons ist, korrigiert mich tho

        zeigeRestaurants();
        aktualisiereStandortAnzeige();

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
    public void zeigeRestaurants() {
        Restaurant[] restaurants = controller.model.getDatamanager().getListeAllerRestaurants();
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
            String pfadFürBildDesRestaurants = getPfadfürBildDesRestaurants(r.getIdDesRestaurants());
            Bitmap bitmap = BitmapFactory.decodeFile(pfadFürBildDesRestaurants);
            bild.setImageBitmap(bitmap);

            itemView.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity1.this, EinzelnesRestaurantMitGerichtenActivity.class);
                intent.putExtra("restaurant_name", r.getName());
                startActivity(intent);
            });

            linearLayoutElements.addView(itemView);
        }

    }
    private String getPfadfürBildDesRestaurants(int indexAlsId){
        return MainActivity1.getController().model.getDatamanager().getPfadFürImageDesRestaurants(indexAlsId);
    }
    private void aktualisiereStandortAnzeige() {
        User aktuellerUser = controller.model.getUserVerwaltung().getAktuellenUser();
        if (aktuellerUser != null && aktuellerUser.getStandort() != null) {
            String adresse = aktuellerUser.getStandort().getAdresse();
            buttonCurrentLocation.setText(adresse != null ? adresse : "Standort wählen");
        } else {
            buttonCurrentLocation.setText("Standort wählen");
        }
    }
    private void aktualisiereScrollViewRestaurants(){
        zeigeRestaurants();
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
