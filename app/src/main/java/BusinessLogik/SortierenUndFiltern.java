package BusinessLogik;

import android.health.connect.datatypes.ExerciseRoute;
import android.location.Location;
import android.os.Build;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortierenUndFiltern {
    /* Liste Sortierfunktionen:
    - Preis auf und absteigend
    - Standort nur nähe aufsteigend
    - nach Gerichtstyp
    - Bewertungen auf und absteigend
    - (Filter nach Zutat)
    - Empfehlen nach Parametern(legen wir mit Strings fest) und heute beliebt
     */

    private List<Restaurant> restaurants;

    public SortierenUndFiltern() {
        restaurants = new ArrayList<>();
    }

    // Methode zum Hinzufügen eines einzelnen Restaurants
    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    // Optional: Methode zum Hinzufügen mehrerer Restaurants gleichzeitig
    public void addRestaurants(List<Restaurant> restaurants) {
        this.restaurants.addAll(restaurants);
    }

    // Liefert eine nach Entfernung sortierte Liste zurück
    public List<Restaurant> getRestaurantsSorted(ExerciseRoute.Location userLocation) {
        List<Restaurant> sortedList = new ArrayList<>(restaurants);
        Collections.sort(sortedList, (r1, r2) -> {
            float distance1 = 0;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
                distance1 = calculateDistance(userLocation.getLatitude(), userLocation.getLongitude(), r1.getLatitude(), r1.getLongitude());
            }
            float distance2 = 0;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
                distance2 = calculateDistance(userLocation.getLatitude(), userLocation.getLongitude(), r2.getLatitude(), r2.getLongitude());
            }
            return Float.compare(distance1, distance2);
        });
        return sortedList;
    }

    // Berechnet die Entfernung in Metern
    private float calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        float[] result = new float[1];
        Location.distanceBetween(lat1, lon1, lat2, lon2, result);
        return result[0];
    }
}

