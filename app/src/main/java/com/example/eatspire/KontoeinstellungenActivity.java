package com.example.eatspire;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class KontoeinstellungenActivity extends AppCompatActivity {

    private Button buttonBackTop, buttonUsername, buttonEmail, buttonChangePassword,
            buttonPhoneNumber, präferenzenÄndernButton, speichernButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ansicht_kontoeinstellungen); // Name deiner XML-Datei

        // Buttons initialisieren
        buttonBackTop = findViewById(R.id.buttonBackTop);
        buttonUsername = findViewById(R.id.buttonUsername);
        buttonEmail = findViewById(R.id.buttonEmail);
        buttonChangePassword = findViewById(R.id.buttonChangePassword);
        buttonPhoneNumber = findViewById(R.id.buttonPhoneNumber);
        präferenzenÄndernButton = findViewById(R.id.präferenzenÄndernButton);
        speichernButton = findViewById(R.id.speichernButton);

        // Zurück-Button oben
        buttonBackTop.setOnClickListener(v -> finish());

        // Zurück-Button unten
        speichernButton.setOnClickListener(v -> finish());

        buttonUsername.setText("Benutzername ("+getBenutzername()+")");
        // Benutzername bearbeiten
        buttonUsername.setOnClickListener(v -> {
            Intent intent = new Intent(KontoeinstellungenActivity.this, BenutzernameÄndernActivity.class);
            startActivity(intent);
        });

        buttonEmail.setText("Email: "+getEmail()+")");
        /* Email bearbeiten
        buttonEmail.setOnClickListener(v -> {
            Intent intent = new Intent(KontoeinstellungenActivity.this, EmailEinstellenActivity.class);
            startActivity(intent);
        });*/

        /* Passwort ändern
        buttonChangePassword.setOnClickListener(v -> {
            Intent intent = new Intent(KontoeinstellungenActivity.this, PasswortEinstellenActivity.class);
            startActivity(intent);
        });*/

        buttonPhoneNumber.setText("Telefonnummer: "+getTelefonnummer()+")");
        /* Telefonnummer bearbeiten
        buttonPhoneNumber.setOnClickListener(v -> {
            Intent intent = new Intent(KontoeinstellungenActivity.this, TelefonnummerEinstellenActivity.class);
            startActivity(intent);
        });*/

        /* Präferenzen ändern
        präferenzenÄndernButton.setOnClickListener(v -> {
            Intent intent = new Intent(KontoeinstellungenActivity.this, PräferenzenEinstellenActivity.class);
            startActivity(intent);
        });*/

        }
        private String getBenutzername(){
        return MainActivity1.getController().model.getDatamanager().getUserVerwaltung().getAktuellenUser().getUsername();
    }
    private String getEmail(){
        return MainActivity1.getController().model.getDatamanager().getUserVerwaltung().getAktuellenUser().getEmail();
    }
    private String getTelefonnummer(){
        return MainActivity1.getController().model.getDatamanager().getUserVerwaltung().getAktuellenUser().getTelefonnummer();
    }
}
