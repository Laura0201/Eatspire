package com.example.eatspire.model.UserStuff;

import android.os.Build;
import java.time.LocalTime;

public class User {

    public static int anzahlNutzer=0;
    private int userId;
    private String username;
    private String password;
    private Standort standort; // Nur Standortobjekt, keine separaten Koordinaten

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.userId = anzahlNutzer;
        anzahlNutzer++;
        this.standort = new Standort();
    }

    // Getter und Setter
    public int getUserId() { return userId; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public Standort getStandort() { return standort; }
    public void setStandort(Standort standort) { this.standort = standort; }

    public LocalTime getAktuelleUhrzeit() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return LocalTime.now();
        }
        return null;
    }
}