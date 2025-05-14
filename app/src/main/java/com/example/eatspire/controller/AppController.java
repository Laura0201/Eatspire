package com.example.eatspire.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import android.provider.ContactsContract;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.eatspire.model.Data.DataManager;
import com.example.eatspire.model.Data.UserVerwaltung;
import com.example.eatspire.model.EssensOrte.Kategorien;
import com.example.eatspire.model.EssensOrte.Restaurant;
import com.example.eatspire.model.Nahrung.BasisEssen;
import com.example.eatspire.model.Nahrung.BasisGetränk;
import com.example.eatspire.model.Nahrung.Hauptspeise;
import com.example.eatspire.model.Nahrung.Nachspeiße;
import com.example.eatspire.model.Nahrung.Vorspeise;
import com.example.eatspire.model.UserStuff.Standort;
import com.example.eatspire.model.UserStuff.User;
import com.example.eatspire.view.FilterUndSortierOptionenActivity;
import com.google.android.gms.location.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class AppController {
    //statische Instanz des Controllers als Singleton mit Getter
    private static final AppController controller = new AppController();
    public static AppController getInstance() { return controller; }
    //Controller enthält einen privaten DataManager(Verbindung ins Model)
    private DataManager dataManager;
    public DataManager getDataManager(){
        return dataManager;
    }

    public void init(Context context) {
        this.dataManager = new DataManager(context);
    }
    //Überprüfung, ob der LogIn erfolgreich und zulässig ist
    public boolean login(String username, String password) {
        return AppController.getInstance().getDataManager().getUserVerwaltung().isValidLogin(username, password);
    }
    //LogOut Methode, setzt den aktuellen User = null, sodass neuer LogIn erforderlich ist
    //speichern einer Anmeldung erst bei dauerhafter Datenspeicherung möglich
    public void logout() {
        AppController.getInstance().getDataManager().getUserVerwaltung().logout();
    }
    //übergibt die Instanz des aktuellen Users
    public User getAktuellerUser() {
        return dataManager.getUserVerwaltung().getAktuellerUser();
    }
    // Standort Logik bis Z. 123
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

    public void setzeStandortVonAdresse(Activity activity, String adresseEingabe, StandortCallback callback) {
        Geocoder geocoder = new Geocoder(activity, Locale.getDefault());

        try {
            List<Address> addresses = geocoder.getFromLocationName(adresseEingabe, 1);
            if (addresses != null && !addresses.isEmpty()) {
                Address address = addresses.get(0);
                double lat = address.getLatitude();
                double lon = address.getLongitude();
                String addr = address.getAddressLine(0);

                User user = getAktuellerUser();
                if (user != null) {
                    user.getStandort().setDaten(lat, lon, addr);
                    callback.onStandortGefunden(lat, lon, addr);
                }
            } else {
                callback.onStandortGefunden(0, 0, "Adresse nicht gefunden");
            }
        } catch (IOException e) {
            e.printStackTrace();
            callback.onStandortGefunden(0, 0, "Adressfehler");
        }
    }


    private boolean hatBerechtigung(Activity activity) {
        return ContextCompat.checkSelfPermission(activity, android.Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED;
    }
    // Callback-Interface direkt in der Klasse, weil es nur hier genutzt wird
    public interface StandortCallback {
        void onStandortGefunden(double latitude, double longitude, String adresse);
    }

    // Restaurant Logik bis Z. 162
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
    public List<Vorspeise> getVorspeisenVon(String restaurantName) {
        Restaurant r = getRestaurantByName(restaurantName);
        if (r != null) return r.getVorspeisen();
        return List.of();
    }
    public List<Nachspeiße> getNachspeisenVon(String restaurantName) {
        Restaurant r = getRestaurantByName(restaurantName);
        if (r != null) return r.getNachspeisen();
        return List.of();
    }
    public List<BasisGetränk> getGetränkeVon(String restaurantName) {
        Restaurant r = getRestaurantByName(restaurantName);
        if (r != null) return r.getGetränke();
        return List.of();
    }
    public int getRestaurantBildResIdAusName(Context context, String restaurantName) {
        String resName = restaurantName.toLowerCase()
                .replace("ä", "ae")
                .replace("ö", "oe")
                .replace("ü", "ue")
                .replace("ß", "ss")
                .replaceAll("[^a-z0-9]", "_"); // nur a-z, 0-9 und _

        return context.getResources().getIdentifier(resName, "drawable", context.getPackageName());
    }
    public int getBildResIdAusName(Context context, String gerichtName, String restaurantName) {
        String combinedName = restaurantName + "_" + gerichtName;
        String resName = combinedName.toLowerCase()
                .replace("ä", "ae")
                .replace("ö", "oe")
                .replace("ü", "ue")
                .replace("ß", "ss")
                .replaceAll("[^a-z0-9]", "_"); // nur a-z, 0-9 und _

        return context.getResources().getIdentifier(resName, "drawable", context.getPackageName());
    }

    //Sortieren und Filtern Logik
    public List<Restaurant> filterNachUmkreis(List<Restaurant> eingabeListe, float umkreisInMetern) {
        Standort userStandort = AppController.getInstance().getAktuellerUser().getStandort();
        return eingabeListe.stream()
                .filter(r -> AppController.getInstance().berechneEntfernung(userStandort, r) <= umkreisInMetern)
                .collect(Collectors.toList());
    }
    public List<Restaurant> sortiereNachEntfernung() {
        User user = getAktuellerUser();
        if (user == null) return List.of();

        List<Restaurant> sortiert = new ArrayList<>(List.of(getAlleRestaurants()));
        sortiert.sort(Comparator.comparingDouble(r -> berechneEntfernung(user.getStandort(), r)));
        return sortiert;
    }

    public float berechneEntfernung(Standort standort, Restaurant restaurant) {
        double lat1 = Math.toRadians(standort.getLatitude());
        double lon1 = Math.toRadians(standort.getLongitude());
        double lat2 = Math.toRadians(restaurant.getLatitude());
        double lon2 = Math.toRadians(restaurant.getLongitude());

        double dlat = lat2 - lat1;
        double dlon = lon2 - lon1;

        double a = Math.sin(dlat / 2) * Math.sin(dlat / 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.sin(dlon / 2) * Math.sin(dlon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double earthRadius = 6371000; // in Meter
        double distance = earthRadius * c;

        return (float) distance;
    }
    public String formatiereEntfernung(float entfernungInMetern) {
        if (entfernungInMetern >= 1000) {
            float entfernungInKm = entfernungInMetern / 1000f;
            return String.format(Locale.getDefault(), "%.1f km entfernt", entfernungInKm);
        } else {
            return String.format(Locale.getDefault(), "%.0f m entfernt", entfernungInMetern);
        }
    }
    public List<Restaurant> filtereNachEigenschaften(boolean toGomöglich, boolean geoeffnet, boolean hatVegetarisch) throws NullPointerException {
        User user = getAktuellerUser();
        if (user == null) return List.of();
        try {
            List<Restaurant> gefiltert = new ArrayList<>();

                for (Restaurant r : List.of(getAlleRestaurants())) {
                    if(toGomöglich) {
                        if (r.isToGomöglich()) {
                            gefiltert.add(r);
                            continue;
                        }
                    }
                    if(hatVegetarisch) {
                        if(r.isHatVegetarisch()) {
                            gefiltert.add(r);
                            continue;
                        }
                    }
                        if(geoeffnet) {
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                if (r.getOeffnungszeit().isBefore(user.getAktuelleUhrzeit()) && r.getSchliesszeit().isAfter(user.getAktuelleUhrzeit())) {
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
        }
        return null;
    }
    public List<Restaurant> anwendenVonFilternUndSortierung(
            int umkreisKm,
            boolean toGo, boolean open, boolean vegetarian,
            List<Kategorien> kategorien,
            boolean nachEntfernungSortieren
    ) {
        List<Restaurant> liste = filtereNachEigenschaften(toGo, open, vegetarian);

        if (umkreisKm > 0) {
            liste = filterNachUmkreis(liste, umkreisKm * 1000f);
        }

        if (kategorien != null && !kategorien.isEmpty()) {
            List<Restaurant> kategorienGefiltert = new ArrayList<>();
            for (Kategorien k : kategorien) {
                kategorienGefiltert.addAll(filtereNachKategorie(k));
            }
            liste = liste.stream().filter(kategorienGefiltert::contains).collect(Collectors.toList());
        }

        if (nachEntfernungSortieren) {
            liste = liste.stream()
                    .sorted(Comparator.comparingDouble(r -> sortiereNachEntfernung().indexOf(r)))
                    .collect(Collectors.toList());
        }

        return liste;
    }
}
