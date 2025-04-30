package com.example.eatspire;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.ComponentActivity;

public class FilterUndSortierOptionenActivity extends ComponentActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.filter_und_sortieroptionen_view); // Verknüpfung mit der XML-Datei

            // Spinner initialisieren
            Spinner spinnerSortOptions = findViewById(R.id.dropdownSortOptions);

            // ArrayAdapter erstellen und Optionen direkt definieren
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                    android.R.layout.simple_spinner_item, // Standardlayout für Spinner-Elemente
                    new String[]{"Nächste", "Beste Bewertung"}); // Dropdown-Optionen

            // Layout für die Dropdown-Liste setzen
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            // Adapter mit dem Spinner verbinden und Nächste als Standard auswählen
            spinnerSortOptions.setAdapter(adapter);
            spinnerSortOptions.setSelection(0);
            // Listener hinzufügen, um Auswahl zu überwachen
            spinnerSortOptions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    // Auswahl verarbeiten
                    String selectedOption = parent.getItemAtPosition(position).toString();
                    Toast.makeText(FilterUndSortierOptionenActivity.this,
                            "Ausgewählt: " + selectedOption, Toast.LENGTH_SHORT).show();

                    //hier Logik basierend auf der Auswahl noch zu implementieren:
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // Optionale Aktion, falls nichts ausgewählt ist
                }
            });
        }
    }

