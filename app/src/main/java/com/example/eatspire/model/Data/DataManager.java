package com.example.eatspire.model.Data;

import com.example.eatspire.model.EssensOrte.Restaurant;
import com.example.eatspire.model.Nahrung.BasisEssen;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private final RestaurantRepository repository;

    public DataManager() {
        repository = new RestaurantRepository();
        repository.initRestaurants(); // Initialisiert alle Restaurantdaten
    }

    public Restaurant[] getAlleRestaurants() {
        return repository.getRestaurants(); // ← Hier ist die Methode
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
