package com.example.eatspire;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.ComponentActivity;

import BusinessLogik.MVC.MVCController;

public class EinzelnesRestaurantMitGerichtenActivity extends ComponentActivity {
    // Hier können Sie die Logik für die Anzeige der Gerichte eines einzelnen Restaurants implementieren
    // Zum Beispiel:
    // - Datenbankabfrage für die Gerichte des ausgewählten Restaurants
    // - Anzeige der Gerichte in einer Liste oder einem GridView
    // - Implementierung von Klick-Listenern für die Gerichte, um weitere Details anzuzeigen
    // --> oder sollen alle relevanten Details der Gerichte bereits angezeigt werden? Könnte man
    // sonst mit Erweiterbarkeit argumentieren, solange die Daten sauber vorhanden sind ist das ohne
    // Probleme möglich.
    private int idDesRestaurants;
    private String pfadFürBildDesRestaurants=getPfadfürBildDesRestaurants(idDesRestaurants);
private ImageView bildDesRestaurants;
private TextView nameDesRestaurants;
private TextView beschreibungDesRestaurants;
private Button buttonVorspeisen, buttonNachspeisen, buttonHauptspeisen, buttonHeißgetränke, buttonKaltgetränke;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.einzelnes_restaurant_mit_gerichten_view);

        nameDesRestaurants = findViewById(R.id.textRestaurantName);
        beschreibungDesRestaurants = findViewById(R.id.textRestaurantDescription);
        bildDesRestaurants = findViewById(R.id.imageRestaurant);
        buttonVorspeisen=findViewById(R.id.buttonVorspeisen);
        buttonNachspeisen=findViewById(R.id.buttonDesserts);
        buttonHauptspeisen=findViewById(R.id.buttonHauptspeisen);
        buttonHeißgetränke=findViewById(R.id.buttonHeissgetraenke);
        buttonKaltgetränke=findViewById(R.id.buttonKaltgetraenke);

        nameDesRestaurants.setText(getNameDesRestaurants(idDesRestaurants));
        Bitmap bitmap = BitmapFactory.decodeFile(pfadFürBildDesRestaurants);
        bildDesRestaurants.setImageBitmap(bitmap);
        beschreibungDesRestaurants.setText(getBeschrebibungDesRestaurants(idDesRestaurants));

//        buttonVorspeisen.setOnClickListener(v -> {
//            Intent intent = new Intent(EinzelnesRestaurantMitGerichtenActivity.this, GerichteAnzeigenTypEgal.class);
//            startActivity(intent); Parameter übergeben, id und Art der Gerichte
//        });
        if(MVCController.getInstance().getModel().getDatamanager().getRestaurant(idDesRestaurants).getVorspeisenListe().isEmpty()){
            buttonVorspeisen.setVisibility(View.GONE);//Unterschied zu View.Invisible
        }
//        buttonHauptspeisen.setOnClickListener(v -> {;
//            Intent intent = new Intent(EinzelnesRestaurantMitGerichtenActivity.this, GerichteAnzeigenTypEgal.class);
//            startActivity(intent); // Parameter übergeben, id und Art der Gerichte
//        });
        if(MVCController.getInstance().getModel().getDatamanager().getRestaurant(idDesRestaurants).getHauptspeisenListe().isEmpty()){
            buttonHauptspeisen.setVisibility(View.GONE);//Unterschied zu View.Invisible
        }
//        buttonNachspeisen.setOnClickListener(v -> {;
//            Intent intent = new Intent(EinzelnesRestaurantMitGerichtenActivity.this, GerichteAnzeigenTypEgal.class);
//            startActivity(intent); // Parameter übergeben, id und Art der Gerichte
//        });
        if(MVCController.getInstance().getModel().getDatamanager().getRestaurant(idDesRestaurants).getNachspeisenListe().isEmpty()){
            buttonNachspeisen.setVisibility(View.GONE);//Unterschied zu View.Invisible
        }
//        buttonHeißgetränke.setOnClickListener(v -> {;
//            Intent intent = new Intent(EinzelnesRestaurantMitGerichtenActivity.this, GerichteAnzeigenTypEgal.class);
//            startActivity(intent); // Parameter übergeben, id und Art der Gerichte
//        });
        if(MVCController.getInstance().getModel().getDatamanager().getRestaurant(idDesRestaurants).getHeißgetränkeListe().isEmpty()){
            buttonHeißgetränke.setVisibility(View.GONE);//Unterschied zu View.Invisible
        }
//        buttonKaltgetränke.setOnClickListener(v -> {;
//            Intent intent = new Intent(EinzelnesRestaurantMitGerichtenActivity.this, GerichteAnzeigenTypEgal.class);
//            startActivity(intent); // Parameter übergeben, id und Art der Gerichte
//        });
        if(MVCController.getInstance().getModel().getDatamanager().getRestaurant(idDesRestaurants).getKaltgetränkeListe().isEmpty()){
            buttonKaltgetränke.setVisibility(View.GONE);//Unterschied zu View.Invisible
        }

    }
    private String getPfadfürBildDesRestaurants(int indexAlsId){
        return MVCController.getInstance().getModel().getDatamanager().getPfadFürImageDesRestaurants(indexAlsId);
    }
    private String getNameDesRestaurants(int indexAlsId){
        return MVCController.getInstance().getModel().getDatamanager().getRestaurant(indexAlsId).getName();
    }
    private String getBeschrebibungDesRestaurants(int indexAlsId){
        return MVCController.getInstance().getModel().getDatamanager().getRestaurant(indexAlsId).getBeschreibung();
    }
}
