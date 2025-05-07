package com.example.eatspire;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BenutzernameÄndernActivity  extends AppCompatActivity {
    private TextView textViewEinstellungen, textViewBenutzernameAktuell;
    private EditText benutzerNameÄndernFeld;
    private Button buttonSpeichern, buttonAbbrechen;
    private String neuerBenutzernameEingabe;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.benutzername_aendern_view);

        textViewEinstellungen=findViewById(R.id.header);
        textViewBenutzernameAktuell=findViewById(R.id.aktueller_benutzername);
        textViewBenutzernameAktuell.setText(getAktuellenBenutzername());
        benutzerNameÄndernFeld=findViewById(R.id.benutzernameAendern);
        buttonSpeichern=findViewById(R.id.save_button);
        buttonAbbrechen=findViewById(R.id.back_button);

        buttonAbbrechen.setOnClickListener(v ->{
                Intent intent = new Intent(BenutzernameÄndernActivity.this, EinstellungenTabActivity.class);
                startActivity(intent);
        });
        benutzerNameÄndernFeld.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                neuerBenutzernameEingabe = s.toString(); // Aktualisiert die Variable bei jeder Eingabe
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });
        buttonSpeichern.setOnClickListener(v -> {
            if(neuerBenutzernameEingabe != null && !neuerBenutzernameEingabe.isEmpty()){
                speichernDesNeuenBenutzernamens(neuerBenutzernameEingabe);
                Intent intent = new Intent(BenutzernameÄndernActivity.this, EinstellungenTabActivity.class);
                startActivity(intent);
            }
            else {
                //Fehlermeldung, wenn der Benutzername ungültig ist
               Toast.makeText(this, "Ungültiger Benutzername oder Änderung fehlgeschlagen", Toast.LENGTH_SHORT).show();
            };

        });
    }
    protected void onResume() {
        super.onResume();
    }
    private String getAktuellenBenutzername() {
        return MainActivity1.getController().model.getDatamanager().getUserVerwaltung().getAktuellenUser().getUsername();
    }
    private void speichernDesNeuenBenutzernamens(String neuerUsername){
        MainActivity1.getController().model.getDatamanager().getUserVerwaltung().getAktuellenUser().setUsername(neuerUsername);
    }
}
