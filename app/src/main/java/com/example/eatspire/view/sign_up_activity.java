package com.example.eatspire.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eatspire.R;
import com.example.eatspire.controller.AppController;

public class sign_up_activity extends AppCompatActivity {
    private TextView usernameTextView, passwordTextView, emailTextView;
    private EditText usernameEditText, passwordEditText, emailEditText;
    private Button registerButton;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_view);

        usernameTextView = findViewById(R.id.username_label);
        usernameEditText = findViewById(R.id.username_input);
        passwordTextView = findViewById(R.id.password_label);
        passwordEditText = findViewById(R.id.password_input);
        emailTextView = findViewById(R.id.email_label);
        emailEditText = findViewById(R.id.email_input);
        registerButton = findViewById(R.id.save_button);
        backButton = findViewById(R.id.back_button);

        registerButton.setOnClickListener(view -> {
            String username = usernameEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Bitte Benutzername und Passwort eingeben", Toast.LENGTH_SHORT).show();
                return;
            }
            // Neuen Benutzer hinzufügen
            AppController.getInstance().getDataManager().getUserVerwaltung().hinzufügenUser(username, password);
            //AppController.getInstance().getDataManager().getUserVerwaltung().getAktuellerUser().setEmail(emailEditText.getText().toString());
            if(AppController.getInstance().getDataManager().getUserVerwaltung().getAktuellerUser()==null){
                Toast.makeText(this, "Fehler bei der Registrierung", Toast.LENGTH_SHORT).show();
            }
            else if (AppController.getInstance().getDataManager().getUserVerwaltung().isValidLogin(username, password)) {
                Toast.makeText(this, "Benutzer erfolgreich registriert", Toast.LENGTH_SHORT).show();
                AppController.getInstance().holeAutomatischenStandort(this, (lat, lon, adresse) -> {
                    runOnUiThread(() -> {
                        Toast.makeText(this, "Standort erkannt: " + adresse, Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(sign_up_activity.this, MainActivity.class));
                        finish();
                    });
                });
            }
            else{
                Toast.makeText(this, "Ungültiger Nutzername oder Password", Toast.LENGTH_SHORT).show();
            }
        });
        backButton.setOnClickListener(view -> {
            startActivity(new Intent(sign_up_activity.this, UserLoginActivity.class));
            finish();
        });
    }


}
