package com.example.eatspire;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import BusinessLogik.MVC.MVC;  // <- wichtig: Dein MVC liegt ja hier

/**
 * Startpunkt der App: MainActivity, die sofort MVC startet.
 */
public class MainActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Direkter Start der MVC-Architektur
        Intent intent = new Intent(this, MVC.class);
        startActivity(intent);

        // Wichtig: MainActivity schließen, damit Benutzer nur in MVC landet
        finish();
    }
}
