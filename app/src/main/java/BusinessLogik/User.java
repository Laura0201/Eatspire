package BusinessLogik;

import static androidx.core.location.LocationManagerCompat.requestLocationUpdates;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Looper;

import androidx.core.app.ActivityCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;

import java.util.ArrayList;
public class User {
    private Location currentLocation;
    private FusedLocationProviderClient fusedLocationClient;
    public static int anzahlNutzer;
    private int userId;
    //Standortschnittstelle
    private String username;
    //Getter und Setter
    private String Password;

    //Hashtables zur Veraltung von Nutzer-IDs und Passwörtern
    ArrayList<String> passwordVerwaltung = new ArrayList<String>();
    ArrayList<String> benutzerIdZuordnung = new ArrayList<String>();

    //Konstruktor:
    public User(String Username, String Password) {
        /*if (!testePasswort(Password)) {
            System.out.println("Passwort entspricht nicht den Richtlinien");
        } else {
            this.Password = Password;
        }*/
        username = Username;
        userId = anzahlNutzer;
        anzahlNutzer++;
        passwordVerwaltung.add(Password);
        benutzerIdZuordnung.add(username);
    }

    public void setContext(Context context) {
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(context);
        requestLocationUpdates(context);
    }

    private Location requestLocationUpdates(Context context) {
        LocationRequest locationRequest = LocationRequest.create();
        locationRequest.setInterval(10000); // Intervall von 10 Sekunden
        locationRequest.setFastestInterval(5000); // Schnellste Aktualisierung alle 5 Sekunden
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);

        // Überprüfe die Laufzeitberechtigungen
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION)
                        != PackageManager.PERMISSION_GRANTED) {
            // Hier solltest du die notwendigen Berechtigungen anfordern
            return null;
        }

        fusedLocationClient.requestLocationUpdates(locationRequest, new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                if (locationResult != null && !locationResult.getLocations().isEmpty()) {
                    // Es wird der letzte Standort aus der Liste genommen
                    currentLocation = locationResult.getLastLocation();
                    // Optional: Hier könnte man auch noch die Genauigkeit prüfen:
                    // if (currentLocation.getAccuracy() <= gewünschterWert) { ... }
                }
            }
        }, Looper.getMainLooper());

//        public Location getCurrentLocation() {
//            return currentLocation;
//        }

//Passwort
       /* public boolean passwortRichtlinien (String Password){
            byte benötigteAnzahlGroßbuchstaben = 2;
            byte benötigteAnzahlZahlen = 2;
            byte benötigteAnzahlSonderzeichen = 2;
            char[] zulässigeSonderzeichen = {'(', ')', '!', '.', ':', ',', '#', '?', '§', '"', '$', '%', '&', '/', '*'};
            boolean ergebnisDerPrüfung = false;
            char[] PasswordAlsCharArray = Password.toCharArray();
            //Test Anzahl Großbuchstaben
            byte counterGroßbuchstaben = 0;
            for (int i = 0; i < PasswordAlsCharArray.length; i++) {
                if (Character.isUpperCase(PasswordAlsCharArray[i])) {
                    counterGroßbuchstaben++;
                }
            }
            //Test Anzahl Zahlen
            byte counterZahlen = 0;
            for (int i = 0; i < PasswordAlsCharArray.length; i++) {
                if (Character.isDigit(PasswordAlsCharArray[i])) {
                    counterZahlen++;
                }
            }
            //Test Anzahl Sonderzeichen
            byte counterSonderzeichen = 0;
            for (int i = 0; i < PasswordAlsCharArray.length; i++) {
                for (int a = 0; a < zulässigeSonderzeichen.length; a++) {
                    if (PasswordAlsCharArray[i] == zulässigeSonderzeichen[a]) {
                        counterSonderzeichen++;
                    }
                }
            }
            if (counterGroßbuchstaben >= 2 && counterZahlen >= 2 && counterSonderzeichen >= 2) {
                ergebnisDerPrüfung = true;
            }

            return ergebnisDerPrüfung;
        }


        public boolean passwortKorrekt (String Benutzername, String Password){
            if (Password.equals(passwordVerwaltung.get(userId))) {
                return true;
            } else {
                return false;
            }
        }

        private String präferenz; //legen wir mit Strings fest


        public boolean testePasswort (String Passwort){
            //Erstellung der Methode zum Passworttesten also Anforderungen an das Passwort
            return true;
        }*/
        return null;
    }
}

