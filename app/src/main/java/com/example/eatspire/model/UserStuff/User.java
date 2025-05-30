package com.example.eatspire.model.UserStuff;

import android.app.Activity;
import android.os.Build;

import java.time.LocalTime;

public class User {

    public static int anzahlNutzer;
    private int userId;
    private String username;
    private String password;
    private String email;
    private String telefonnummer;
    private LocalTime aktuelleUhrzeit;
    private double latitude;
    private double longitude;
    private String adresse;

    private Standort standort; // → neues Feld für eigenen Standort-Service

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
    public String getTelefonnummer() {
        return telefonnummer;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.userId = anzahlNutzer++;
        this.aktuelleUhrzeit=getAktuelleUhrzeit();
        this.standort = new Standort(); // Standort gleich anlegen
    }

    // Getter und Setter
    public int getUserId() { return userId; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }

    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public String getAdresse() { return adresse; }

    public Standort getStandort() {
        return standort;
    }

    public void setStandortDaten(double latitude, double longitude, String adresse) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.adresse = adresse;
    }
    public void setAktuelleUhrzeit(){
        aktuelleUhrzeit=getAktuelleUhrzeit();
    }

    public LocalTime getAktuelleUhrzeit() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return LocalTime.now();
        }
        return null; // Fallback für ältere Android-Versionen
    }

    public void setStandort(Standort standort) {
        this.standort = standort;
    }
}
