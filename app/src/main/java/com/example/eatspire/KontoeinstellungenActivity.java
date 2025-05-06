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
        setContentView(R.layout.KontoeinstellungenActivity); // Name deiner XML-Datei

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

        // Benutzername bearbeiten
        buttonUsername.setOnClickListener(v -> {
            Intent intent = new Intent(KontoeinstellungenActivity.this, BenutzernameEinstellenActivity.class);
            startActivity(intent);
        });

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
}
