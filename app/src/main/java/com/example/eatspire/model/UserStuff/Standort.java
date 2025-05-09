package com.example.eatspire.model.UserStuff;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Looper;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.location.*;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

/**
 * Modellklasse für Standortverwaltung eines Users.
 * Holt Standort automatisch oder verarbeitet manuelle Eingaben.
 */
public class Standort {

    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1001;

    private FusedLocationProviderClient fusedLocationClient;
    private LocationRequest locationRequest;
    private LocationCallback locationCallback;

    private double latitude;
    private double longitude;
    private String adresse;

    public Standort() {
        // Startwerte
        latitude = 0.0;
        longitude = 0.0;
        adresse = "Keine Adresse";
    }

    /**
     * Holt automatisch den aktuellen Standort.
     */
    public void holeAutomatischStandort(Activity activity, StandortCallback callback) {
        if (fusedLocationClient == null) {
            fusedLocationClient = LocationServices.getFusedLocationProviderClient(activity);
        }

        if (!hatStandortBerechtigung(activity)) {
            ActivityCompat.requestPermissions(activity,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    LOCATION_PERMISSION_REQUEST_CODE);
            return;
        }

        try {
            fusedLocationClient.getLastLocation()
                    .addOnSuccessListener(location -> {
                        if (location != null) {
                            latitude = location.getLatitude();
                            longitude = location.getLongitude();
                            adresse = adresseAufloesen(activity, latitude, longitude);
                            callback.onStandortGefunden(latitude, longitude, adresse);
                        } else {
                            neueStandortabfrage(activity, callback);
                        }
                    })
                    .addOnFailureListener(e -> {
                        Toast.makeText(activity, "Fehler beim Standort holen", Toast.LENGTH_SHORT).show();
                    });
        } catch (SecurityException e) {
            Toast.makeText(activity, "Standortberechtigung nicht vorhanden!", Toast.LENGTH_SHORT).show();
        }
    }


    /**
     * Startet eine neue aktive Standortabfrage.
     */
    private void neueStandortabfrage(Activity activity, StandortCallback callback) {
        if (fusedLocationClient == null) {
            fusedLocationClient = LocationServices.getFusedLocationProviderClient(activity);
        }

        if (!hatStandortBerechtigung(activity)) {
            Toast.makeText(activity, "Standortberechtigung fehlt!", Toast.LENGTH_SHORT).show();
            return;
        }

        locationRequest = LocationRequest.create();
        locationRequest.setPriority(Priority.PRIORITY_HIGH_ACCURACY);
        locationRequest.setInterval(5000);
        locationRequest.setFastestInterval(2000);

        locationCallback = new LocationCallback() {
            @Override
            public void onLocationResult(@NonNull LocationResult locationResult) {
                Location location = locationResult.getLastLocation();
                if (location != null) {
                    latitude = location.getLatitude();
                    longitude = location.getLongitude();
                    adresse = adresseAufloesen(activity, latitude, longitude);
                    callback.onStandortGefunden(latitude, longitude, adresse);
                }
                fusedLocationClient.removeLocationUpdates(locationCallback);
            }
        };

        try {
            fusedLocationClient.requestLocationUpdates(locationRequest, locationCallback, Looper.getMainLooper());
        } catch (SecurityException e) {
            Toast.makeText(activity, "Standortberechtigung nicht vorhanden!", Toast.LENGTH_SHORT).show();
        }
    }


    /**
     * Verarbeitet manuelle Adresseingabe vom User.
     */
    public void verarbeiteManuelleAdresse(Activity activity, String userInput, StandortCallback callback) {
        Geocoder geocoder = new Geocoder(activity, Locale.getDefault());
        try {
            List<Address> addresses = geocoder.getFromLocationName(userInput, 1);
            if (addresses != null && !addresses.isEmpty()) {
                Address address = addresses.get(0);
                this.latitude = address.getLatitude();
                this.longitude = address.getLongitude();
                this.adresse = address.getAddressLine(0);
                callback.onStandortGefunden(latitude, longitude, adresse);
            } else {
                Toast.makeText(activity, "Adresse nicht gefunden", Toast.LENGTH_SHORT).show();
            }
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(activity, "Fehler bei der Adressverarbeitung", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Aktualisiert interne Standortdaten.
     */
    private void aktualisiereStandort(Activity activity, Location location, StandortCallback callback) {
        this.latitude = location.getLatitude();
        this.longitude = location.getLongitude();
        this.adresse = adresseAufloesen(activity, latitude, longitude);
        callback.onStandortGefunden(latitude, longitude, adresse);
    }

    /**
     * Wandelt Koordinaten in Adresse um.
     */
    private String adresseAufloesen(Activity activity, double lat, double lon) {
        Geocoder geocoder = new Geocoder(activity, Locale.getDefault());
        try {
            List<Address> addresses = geocoder.getFromLocation(lat, lon, 1);
            if (addresses != null && !addresses.isEmpty()) {
                return addresses.get(0).getAddressLine(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Unbekannte Adresse";
    }

    /**
     * Prüft ob Standortberechtigung vorhanden ist.
     */
    private boolean hatStandortBerechtigung(Activity activity) {
        return ContextCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
                || ContextCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED;
    }

    /**
     * Interface für Rückgabe von Standortdaten.
     */
    public interface StandortCallback {
        void onStandortGefunden(double latitude, double longitude, String adresse);
    }

    // Getter
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public String getAdresse() { return adresse; }
}
