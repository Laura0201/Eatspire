package com.example.eatspire;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UserLoginActivity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login); // Passe den Layoutnamen an

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String benutzername = usernameEditText.getText().toString().trim();
                String passwort = passwordEditText.getText().toString().trim();

                if (benutzername.isEmpty() || passwort.isEmpty()) {
                    Toast.makeText(UserLoginActivity.this, "Bitte alle Felder ausfüllen", Toast.LENGTH_SHORT).show();
                } else {
                    if (MainActivity1.getController().model.getUserVerwaltung().getAktuellenUser().getUsername().equals(benutzername) && MainActivity1.getController().model.getUserVerwaltung().getAktuellenUser().getPassword().equals(passwort)) {
                        Toast.makeText(UserLoginActivity.this, "Login erfolgreich", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(UserLoginActivity.this, MainActivity1.class);
                        startActivity(intent);
                        finish(); // verhindert Zurückgehen per Back-Button
                    }
                        else {
                        Toast.makeText(UserLoginActivity.this, "Ungültige Anmeldedaten", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}