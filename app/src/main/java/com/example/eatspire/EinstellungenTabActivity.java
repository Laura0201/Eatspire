package com.example.eatspire;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EinstellungenTabActivity extends Activity {

    private Button buttonBackTop, buttonUsername, buttonEmail, buttonChangePassword,
            buttonPhoneNumber, praferenzenAendernButton, speichernButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.einstellungen_tab_view); // <- Hier Layout-Dateinamen anpassen

        // Buttons verknüpfen
        buttonBackTop = findViewById(R.id.buttonBackTop);
        buttonUsername = findViewById(R.id.buttonUsername);
        buttonEmail = findViewById(R.id.buttonEmail);
        buttonChangePassword = findViewById(R.id.buttonChangePassword);
        buttonPhoneNumber = findViewById(R.id.buttonPhoneNumber);
        praferenzenAendernButton = findViewById(R.id.präferenzenÄndernButton);
        speichernButton = findViewById(R.id.speichernButton);

        // Beispielhafte Button-Aktionen
        buttonBackTop.setOnClickListener(v -> finish());

        speichernButton.setOnClickListener(v -> {
            // Beispielsweise speichern oder auch einfach zurückgehen
            Toast.makeText(this, "Änderungen gespeichert", Toast.LENGTH_SHORT).show();
            finish();
        });

        buttonUsername.setOnClickListener(v ->
                Toast.makeText(this, "Benutzername ändern", Toast.LENGTH_SHORT).show());

        buttonEmail.setOnClickListener(v ->
                Toast.makeText(this, "Email ändern", Toast.LENGTH_SHORT).show());

        buttonChangePassword.setOnClickListener(v ->
                Toast.makeText(this, "Passwort ändern", Toast.LENGTH_SHORT).show());

        buttonPhoneNumber.setOnClickListener(v ->
                Toast.makeText(this, "Telefonnummer ändern", Toast.LENGTH_SHORT).show());

        praferenzenAendernButton.setOnClickListener(v ->
                Toast.makeText(this, "Präferenzen ändern", Toast.LENGTH_SHORT).show());
    }
}
