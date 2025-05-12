package com.example.eatspire.model.UserStuff;

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

    public void setDatenVonAdresse(Activity activity, String userInput) {
        Geocoder geocoder = new Geocoder(activity, Locale.getDefault());
        try {
            List<Address> addresses = geocoder.getFromLocationName(userInput, 1);
            if (addresses != null && !addresses.isEmpty()) {
                Address address = addresses.get(0);
                this.latitude = address.getLatitude();
                this.longitude = address.getLongitude();
                this.adresse = address.getAddressLine(0);
            } else {
                this.adresse = "Adresse nicht gefunden";
            }
        } catch (IOException e) {
            e.printStackTrace();
            this.adresse = "Adressfehler";
        }
    }

    // Getter
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public String getAdresse() { return adresse; }
}