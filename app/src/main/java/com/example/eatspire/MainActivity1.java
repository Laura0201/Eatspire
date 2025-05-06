package com.example.eatspire;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    private Button buttonRefresh, buttonCurrentLocation, buttonEinstellungen, buttonFilterSortieren;
    private LinearLayout linearLayoutElements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisierung
        buttonRefresh = findViewById(R.id.buttonRefresh);
        buttonCurrentLocation = findViewById(R.id.buttonCurrentLocation);
        buttonEinstellungen = findViewById(R.id.buttonEinstellungen);
        buttonFilterSortieren = findViewById(R.id.buttonFilterSortieren);
        linearLayoutElements = findViewById(R.id.linearLayoutElements);

        // Button: Refresh
        buttonRefresh.setOnClickListener(v ->
                Toast.makeText(this, "Daten werden aktualisiert...", Toast.LENGTH_SHORT).show());

        // Button: Aktueller Standort
        buttonCurrentLocation.setOnClickListener(v ->
                Toast.makeText(this, "Standort wird abgerufen...", Toast.LENGTH_SHORT).show());

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

        // Beispiel: Dynamisch Inhalt einfügen
        addExampleContent();
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
