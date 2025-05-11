package com.example.eatspire.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eatspire.R;
import com.example.eatspire.controller.AppController;
import com.example.eatspire.model.Data.UserVerwaltung;

public class UserLoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login);

        // UI verknüpfen
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(view -> {
            String username = usernameEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

            if (AppController.getInstance().login(username, password)) {
                // Standort über Controller holen
                AppController.getInstance().holeAutomatischenStandort(this, (lat, lon, adresse) -> {
                    Toast.makeText(this, "Standort gesetzt: " + adresse, Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(UserLoginActivity.this, MainActivity.class));
                    finish();
                });
            } else {
                Toast.makeText(this, "Falscher Benutzername oder Passwort", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
