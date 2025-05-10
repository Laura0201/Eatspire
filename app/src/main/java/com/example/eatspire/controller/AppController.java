package com.example.eatspire.controller;

import android.app.Activity;

import com.example.eatspire.model.Data.DataManager;
import com.example.eatspire.model.Data.UserVerwaltung;
import com.example.eatspire.model.EssensOrte.Restaurant;
import com.example.eatspire.model.Nahrung.BasisEssen;
import com.example.eatspire.model.UserStuff.Standort;
import com.example.eatspire.model.UserStuff.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppController {

        private static AppController instance;
        private final DataManager dataManager = new DataManager();

        public AppController() {}

        private static final AppController controller = new AppController(); // Direkte Instanziierung
        public static AppController getInstance() {
            return controller; // Gibt immer dieselbe Instanz zurück
        }

    // === User & Standort ===

    public boolean login(String username, String password) {
        return UserVerwaltung.isValidLogin(username, password);
    }

    public User getAktuellerUser() {
        return UserVerwaltung.getAktuellerUser();
    }

    public void logout() {
        UserVerwaltung.logout();
    }

    public void setzeManuellenStandort(Activity activity, String adresse, Standort.StandortCallback callback) {
        Standort standort = new Standort();
        standort.verarbeiteManuelleAdresse(activity, adresse, (lat, lon, resolvedAdresse) -> {
            User user = getAktuellerUser();
            if (user != null) {
                user.setStandort(standort);
                callback.onStandortGefunden(lat, lon, resolvedAdresse);
            }
        });
    }

    public void holeAutomatischenStandort(Activity activity, Standort.StandortCallback callback) {
        Standort standort = new Standort();
        standort.holeAutomatischStandort(activity, (lat, lon, adresse) -> {
            User user = getAktuellerUser();
            if (user != null) {
                user.setStandort(standort);
                callback.onStandortGefunden(lat, lon, adresse);
            }
        });
    }

    // === Restaurants ===

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

    // === Gerichte ===

    public List<BasisEssen> getAlleHauptspeisen() {
        List<BasisEssen> alle = new ArrayList<>();
        for (Restaurant r : dataManager.getAlleRestaurants()) {
            alle.addAll(r.getHauptspeisen());
        }
        return alle;
    }

    // === Filter & Sortierung ===

    public List<Restaurant> filterNachUmkreis(float maxDistanzMeter) {
        User user = getAktuellerUser();
        if (user == null) return List.of();

        List<Restaurant> gefiltert = new ArrayList<>();
        for (Restaurant r : List.of(getAlleRestaurants())) {
            float dist = berechneEntfernung(user, r);
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
        sortiert.sort(Comparator.comparingDouble(r -> berechneEntfernung(user, r)));
        return sortiert;
    }

    private float berechneEntfernung(User user, Restaurant restaurant) {
        android.location.Location userLoc = new android.location.Location("User");
        userLoc.setLatitude(user.getLatitude());
        userLoc.setLongitude(user.getLongitude());

        android.location.Location rLoc = new android.location.Location("Restaurant");
        rLoc.setLatitude(restaurant.getLatitude());
        rLoc.setLongitude(restaurant.getLongitude());

        return userLoc.distanceTo(rLoc);
    }

}
