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
 * Die Logik wird über den UserController abgewickelt.
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

        // Wenn bereits ein Standort vorhanden ist, zeige ihn an
        Standort standort = MainActivity.controller.getAktuellerUser().getStandort();
        if (standort != null && standort.getAdresse() != null) {
            textViewAdresse.setText("Aktueller Standort: " + standort.getAdresse());
        }

        // Button für manuelle Adresseingabe
        buttonSetManuell.setOnClickListener(v -> {
            String adresse = editTextAdresse.getText().toString().trim();
            if (!adresse.isEmpty()) {
                // Verarbeite Eingabe über Controller
                MainActivity.controller.setzeManuellenStandort(this, adresse, (lat, lon, resolvedAdresse) -> {
                    Toast.makeText(this, "Adresse gespeichert: " + resolvedAdresse, Toast.LENGTH_SHORT).show();
                    finish(); // Zurück zur MainActivity
                });
            } else {
                Toast.makeText(this, "Bitte Adresse eingeben", Toast.LENGTH_SHORT).show();
            }
        });

        // Button für automatische Standortermittlung per GPS
        buttonGPS.setOnClickListener(v -> {
            MainActivity.controller.holeAutomatischenStandort(this, (lat, lon, adresse) -> {
                Toast.makeText(this, "Standort gefunden: " + adresse, Toast.LENGTH_SHORT).show();
                finish(); // Zurück zur MainActivity
            });
        });
    }
}
