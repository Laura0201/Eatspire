package com.example.eatspire.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eatspire.R;

import com.example.eatspire.model.Data.UserVerwaltung;
import com.example.eatspire.model.UserStuff.User;

public class UserLoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login); // oder der exakte Dateiname deiner XML

        // Views verknüpfen
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.login_button);

        // Klick-Listener für Login-Button
        loginButton.setOnClickListener(view -> {
            String username = usernameEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

            if (UserVerwaltung.isValidLogin(username, password)) {
                // Nach erfolgreichem Login: Standort automatisch holen
                User user = UserVerwaltung.getAktuellerUser();
                user.getStandort().holeAutomatischStandort(UserLoginActivity.this, (lat, lon, adresse) -> {
                    user.setStandortDaten(lat, lon, adresse);

                    // Dann zur MainActivity wechseln
                    Intent intent = new Intent(UserLoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                });
            } else {
                Toast.makeText(UserLoginActivity.this, "Falscher Benutzername oder Passwort", Toast.LENGTH_SHORT).show();
            }

        });
    }
}
