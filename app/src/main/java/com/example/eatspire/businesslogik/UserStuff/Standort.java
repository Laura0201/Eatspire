package com.example.eatspire.businesslogik.UserStuff;

import android.app.Activity;
import android.location.Address;
import android.location.Geocoder;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class Standort {

    private double latitude;
    private double longitude;
    private String adresse;

    public Standort() {
        latitude = 0.0;
        longitude = 0.0;
        adresse = "Keine Adresse";
    }

    public void setDaten(double latitude, double longitude, String adresse) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.adresse = adresse;
    }

    // Getter
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public String getAdresse() { return adresse; }
}