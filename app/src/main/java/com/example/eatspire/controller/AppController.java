package com.example.eatspire.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.eatspire.model.Data.DataManager;
import com.example.eatspire.model.Data.UserVerwaltung;
import com.example.eatspire.model.EssensOrte.Kategorien;
import com.example.eatspire.model.EssensOrte.Restaurant;
import com.example.eatspire.model.Nahrung.BasisEssen;
import com.example.eatspire.model.Nahrung.Hauptspeise;
import com.example.eatspire.model.UserStuff.Standort;
import com.example.eatspire.model.UserStuff.User;
import com.google.android.gms.location.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class AppController {

    private static final AppController controller = new AppController();
    public static AppController getInstance() { return controller; }

    private DataManager dataManager;

    public void init(Context context) {
        this.dataManager = new DataManager(context);
    }

    public boolean login(String username, String password) {
        return UserVerwaltung.isValidLogin(username, password);
    }

    public User getAktuellerUser() {
        return UserVerwaltung.getAktuellerUser();
    }

    public void logout() {
        UserVerwaltung.logout();
    }

    // Standort Logik
    public void holeAutomatischenStandort(Activity activity, StandortCallback callback) {
        FusedLocationProviderClient fusedClient = LocationServices.getFusedLocationProviderClient(activity);
        if (!hatBerechtigung(activity)) {
            ActivityCompat.requestPermissions(activity,
                    new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, 1001);
            return;
        }

        starteNeueStandortabfrage(activity, fusedClient, callback);

    }

    private void starteNeueStandortabfrage(Activity activity, FusedLocationProviderClient client, StandortCallback callback) {
        LocationRequest locationRequest = LocationRequest.create();
        locationRequest.setPriority(Priority.PRIORITY_HIGH_ACCURACY);
        locationRequest.setInterval(3000);

        LocationCallback locationCallback = new LocationCallback() {
            @Override
            public void onLocationResult(@NonNull LocationResult result) {
                Location location = result.getLastLocation();
                if (location != null) {
                    updateStandortMitLocation(activity, location, callback);
                    client.removeLocationUpdates(this);
                }
            }
        };

        try {
            client.requestLocationUpdates(locationRequest, locationCallback, Looper.getMainLooper());
        } catch (SecurityException e) {
            Toast.makeText(activity, "Keine Berechtigung", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateStandortMitLocation(Activity activity, Location location, StandortCallback callback) {
        double lat = location.getLatitude();
        double lon = location.getLongitude();
        String adresse = aufloesenAdresse(activity, lat, lon);

        User user = getAktuellerUser();
        if (user != null) {
            user.getStandort().setDaten(lat, lon, adresse);
            callback.onStandortGefunden(lat, lon, adresse);
        }
    }

    private String aufloesenAdresse(Activity activity, double lat, double lon) {
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

    private boolean hatBerechtigung(Activity activity) {
        return ContextCompat.checkSelfPermission(activity, android.Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED;
    }

    // Callback-Interface
    public interface StandortCallback {
        void onStandortGefunden(double latitude, double longitude, String adresse);
    }

    // Restaurant Logik
    public Restaurant[] getAlleRestaurants() {
        return dataManager.getAlleRestaurants();
    }

    public Restaurant getRestaurantByName(String name) {
        for (Restaurant r : dataManager.getAlleRestaurants()) {
            if (r.getName().equalsIgnoreCase(name)) {
                return r;
            }
        }
        return null;
    }

    public List<Hauptspeise> getHauptspeisenVon(String restaurantName) {
        Restaurant r = getRestaurantByName(restaurantName);
        if (r != null) return r.getHauptspeisen();
        return List.of();
    }

    public int getBildResIdAusName(Context context, String gerichtName) {
        String resName = gerichtName.toLowerCase()
                .replace("ä", "ae")
                .replace("ö", "oe")
                .replace("ü", "ue")
                .replace("ß", "ss")
                .replaceAll("[^a-z0-9]", "_"); // nur a-z, 0-9 und _

        return context.getResources().getIdentifier(resName, "drawable", context.getPackageName());
    }

    public List<BasisEssen> getAlleHauptspeisen() {
        List<BasisEssen> alle = new ArrayList<>();
        for (Restaurant r : dataManager.getAlleRestaurants()) {
            alle.addAll(r.getHauptspeisen());
        }
        return alle;
    }

    //Sortieren und Filtern Logik
    public List<Restaurant> filterNachUmkreis(float maxDistanzMeter) {
        User user = getAktuellerUser();
        if (user == null) return List.of();

        List<Restaurant> gefiltert = new ArrayList<>();
        for (Restaurant r : List.of(getAlleRestaurants())) {
            float dist = berechneEntfernung(user.getStandort(), r);
            if (dist <= maxDistanzMeter) {
                gefiltert.add(r);
            }
        }
        return gefiltert;
    }

    public List<Restaurant> sortiereNachEntfernung() {
        User user = getAktuellerUser();
        if (user == null) return List.of();

        List<Restaurant> sortiert = new ArrayList<>(List.of(getAlleRestaurants()));
        sortiert.sort(Comparator.comparingDouble(r -> berechneEntfernung(user.getStandort(), r)));
        return sortiert;
    }

    private float berechneEntfernung(Standort standort, Restaurant restaurant) {
        Location userLoc = new Location("User");
        userLoc.setLatitude(standort.getLatitude());
        userLoc.setLongitude(standort.getLongitude());

        Location rLoc = new Location("Restaurant");
        rLoc.setLatitude(restaurant.getLatitude());
        rLoc.setLongitude(restaurant.getLongitude());

        return userLoc.distanceTo(rLoc);
    }
    // Filtern nach eigenschaften
    // erwartet 3 Wahrheitswerte, jeweils für einzelne Eigenschaften.
    public List<Restaurant> filtereNachEigenschaften(boolean toGomöglich, boolean geoeffnet, boolean hatVegetarisch) throws NullPointerException {
        User user = getAktuellerUser();
        if (user == null) return List.of();

        try {
            List<Restaurant> gefiltert = new ArrayList<>();
            if(getAlleRestaurants() != null) {
                for (Restaurant r : List.of(getAlleRestaurants())) {
                    if (r.isToGomöglich()==toGomöglich || r.isHatVegetarisch() == hatVegetarisch || geoeffnet) {
                        if(geoeffnet) {
                            // Time.isBefore braucht JDK 26, current ist 24, deshalb if Klammer! wird nur rt wenn geoffnet wahr ist!
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                if (r.getOeffnungszeit().isBefore(user.getAktuelleUhrzeit()) && r.getSchliesszeit().isAfter(user.getAktuelleUhrzeit())) {
                                    gefiltert.add(r);
                                    break;
                                }
                            }
                        } else {
                            gefiltert.add(r);
                        }
                    }
                }
            }
            return gefiltert;
        } catch (NullPointerException e)
        {
            //maybe System out print oder so?
        }
        return null;
    }


    // Filterung nach Kategorie

    // Methode um nach 1ner Kategorie zu filtern

    public List<Restaurant> filtereNachKategorie(Kategorien kategorie) throws NullPointerException {
        User user = getAktuellerUser();
        if (user == null) return List.of();

        try {
            List<Restaurant> gefiltert = new ArrayList<>();
            if(getAlleRestaurants() != null) {
                for (Restaurant r : List.of(getAlleRestaurants())) {
                    if (r.getKategorie().equals(kategorie)) {
                        gefiltert.add(r);
                    }
                }
            }
            return gefiltert;
        } catch (NullPointerException e)
        {
            //maybe System out print oder so?
        }
        return null;
    }

    // Methode um nach 2 Kategorien zu filtern
    public List<Restaurant> filtereNachKategorie(Kategorien kategorie1, Kategorien kategorie2) {
        User user = getAktuellerUser();
        if (user == null) return List.of();

        try {
            List<Restaurant> gefiltert = new ArrayList<>();
            if(getAlleRestaurants() != null) {
                for (Restaurant r : List.of(getAlleRestaurants())) {
                    if (r.getKategorie().equals(kategorie1) || r.getKategorie().equals(kategorie2)) {
                        gefiltert.add(r);
                    }
                }
            }
            return gefiltert;
        } catch (NullPointerException e)
        {
            //maybe System out print oder so?
        }
        return null;
    }

    // Methode um nach 3 Kategorien zu filtern
    public List<Restaurant> filtereNachKategorie(Kategorien kategorie1, Kategorien kategorie2, Kategorien kategorie3) {
        User user = getAktuellerUser();
        if (user == null) return List.of();

        try {
            List<Restaurant> gefiltert = new ArrayList<>();
            if(getAlleRestaurants() != null) {
                for (Restaurant r : List.of(getAlleRestaurants())) {
                    if (r.getKategorie().equals(kategorie1) || r.getKategorie().equals(kategorie2) || r.getKategorie().equals(kategorie3)) {
                        gefiltert.add(r);
                    }
                }
            }
            return gefiltert;
        } catch (NullPointerException e)
        {
            //maybe System out print oder so?
        }
        return null;
    }
}