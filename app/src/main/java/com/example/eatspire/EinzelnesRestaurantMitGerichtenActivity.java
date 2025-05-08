package com.example.eatspire;

import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.ComponentActivity;

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
private TextView nameDesRestaurants, beschreibungDesRestaurants;
private Button buttonVorspeisen, buttonNachspeisen, buttonHauptspeisen, buttonHeißgetränke, buttonKaltgetränke;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.einzelnes_restaurant_mit_gerichten_view);

        Bitmap bitmap = BitmapFactory.decodeFile(pfadFürBildDesRestaurants);
        bildDesRestaurants.setImageBitmap(bitmap);

    }
    private String getPfadfürBildDesRestaurants(int indexAlsId){
        return MainActivity1.getController().model.getDatamanager().getPfadFürImageDesRestaurants(indexAlsId);
    }
}
