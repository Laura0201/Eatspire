package com.example.eatspire.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eatspire.R;
import com.example.eatspire.model.UserStuff.Standort;

/**
 * View-Klasse für die Standortauswahl (manuell oder automatisch).
 * Die Logik wird über den AppController abgewickelt.
 */
public class StandortActivity extends AppCompatActivity {

    private TextView textViewAdresse;
    private EditText editTextAdresse;
    private Button buttonGPS, buttonSetManuell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standort_activity);

        // UI-Elemente aus dem Layout verknüpfen
        textViewAdresse = findViewById(R.id.textViewAdresse);
        editTextAdresse = findViewById(R.id.editTextAdresse);
        buttonGPS = findViewById(R.id.buttonHoleStandort);
        buttonSetManuell = findViewById(R.id.buttonSetManuelleAdresse);

        // Aktuellen Standort anzeigen (falls vorhanden)
        Standort standort = MainActivity.controller.getAktuellerUser().getStandort();
        if (standort != null && standort.getAdresse() != null) {
            textViewAdresse.setText("Aktueller Standort: " + standort.getAdresse());
        } else {
            textViewAdresse.setText("Kein Standort gesetzt");
        }

        // Manuelle Adresse setzen
        buttonSetManuell.setOnClickListener(v -> {
            String adresse = editTextAdresse.getText().toString().trim();
            if (!adresse.isEmpty()) {
                // Geocoder läuft im Controller, User-Daten werden dort aktualisiert
                Standort tempStandort = MainActivity.controller.getAktuellerUser().getStandort();
                tempStandort.setDatenVonAdresse(this, adresse);
                Toast.makeText(this, "Adresse gesetzt: " + tempStandort.getAdresse(), Toast.LENGTH_SHORT).show();
                finish(); // zurück zur MainActivity
            } else {
                Toast.makeText(this, "Bitte Adresse eingeben", Toast.LENGTH_SHORT).show();
            }
        });

        // GPS-Standort setzen über Controller
        buttonGPS.setOnClickListener(v -> {
            MainActivity.controller.holeAutomatischenStandort(this, (lat, lon, adresse) -> {
                Toast.makeText(this, "GPS-Standort: " + adresse, Toast.LENGTH_SHORT).show();
                finish(); // zurück zur MainActivity
            });
        });
    }
}
