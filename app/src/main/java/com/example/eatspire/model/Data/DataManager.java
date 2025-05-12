package com.example.eatspire.model.Data;

import android.content.Context;

import com.example.eatspire.model.EssensOrte.Restaurant;
import com.example.eatspire.model.Nahrung.BasisEssen;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private final RestaurantRepository repository;
    private UserVerwaltung userVerwaltung;

    public DataManager(Context context) {
        repository = new RestaurantRepository();
        repository.initRestaurants(context); // Initialisiert alle Restaurantdaten
        userVerwaltung = new UserVerwaltung();
    }

    public Restaurant[] getAlleRestaurants() {
        return repository.getRestaurants(); // ← Hier ist die Methode
    }
    public UserVerwaltung getUserVerwaltung() {
        return userVerwaltung;
    }
    public List<BasisEssen> getAlleHauptspeisen() {
        List<BasisEssen> hauptgerichte = new ArrayList<>();

        for (Restaurant r : getAlleRestaurants()) {
            if (r.getHauptspeisen() != null) {
                hauptgerichte.addAll(r.getHauptspeisen());
            }
        }

        return hauptgerichte;
    }


}
