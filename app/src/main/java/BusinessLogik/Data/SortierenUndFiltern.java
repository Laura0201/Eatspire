package BusinessLogik.Data;

import android.location.Location;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import BusinessLogik.UserStuff.User;
import BusinessLogik.EssensOrte.Restaurant;

public class SortierenUndFiltern {

    // Entfernung berechnen
    public static float berechneEntfernung(User user, Restaurant restaurant) {
        Location userLocation = new Location("User");
        userLocation.setLatitude(user.getLatitude());
        userLocation.setLongitude(user.getLongitude());

        Location restaurantLocation = new Location("Restaurant");
        restaurantLocation.setLatitude(restaurant.getLatitude());
        restaurantLocation.setLongitude(restaurant.getLongitude());

        return userLocation.distanceTo(restaurantLocation);
    }

    // 1. Filtert Restaurants nach Umkreis
    public static List<Restaurant> filterNachUmkreis(User user, List<Restaurant> restaurants, float maxDistanzMeter) {
        List<Restaurant> gefiltert = new ArrayList<>();
        for (Restaurant r : restaurants) {
            float distanz = berechneEntfernung(user, r);
            if (distanz <= maxDistanzMeter) {
                gefiltert.add(r);
            }
        }
        return gefiltert;
    }

    // 2. Sortiert Restaurants nach Entfernung aufsteigend
    public static List<Restaurant> sortiereNachEntfernung(User user, List<Restaurant> restaurants) {
        List<Restaurant> sortiert = new ArrayList<>(restaurants);
        sortiert.sort(Comparator.comparingDouble(r -> berechneEntfernung(user, r)));
        return sortiert;
    }

    // 3. Sortiert Restaurants nach Bewertung absteigend (5.0 zuerst)
    /*public static List<Restaurant> sortiereNachBewertung(List<Restaurant> restaurants) {
        List<Restaurant> sortiert = new ArrayList<>(restaurants);
        sortiert.sort(Comparator.comparingDouble(Restaurant::getBewertung).reversed());
        return sortiert;
    }*/
}
