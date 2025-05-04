package BusinessLogik.EssensOrte;

import android.os.Build;

import java.time.LocalTime;
import java.util.ArrayList;

import BusinessLogik.Nahrung.BasisEssen;

public class Restaurant {
    public String name;
    public String beschreibung;
    //Kontaktdaten:
    public String adressfeld;
    public String telefonnummer;
    public String mail;
    public String website;
    private double latitude;
    private double longitude;

    private ArrayList<BasisEssen> listeGerichte = new ArrayList<BasisEssen>();
    public Restaurant() {


    }

    //Methoden:
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
    public void setName(String Name){
        name=Name;
    }
    public void setAdresse(String Adresse){
        adressfeld=Adresse;
    }
    public void setEssenListe(ArrayList<BasisEssen> listeGerichte){
        this.listeGerichte=listeGerichte;
    }
    //....
    private LocalTime oeffnungszeit;
    private LocalTime schliesszeit;

    public void setOeffnungszeiten(LocalTime oeffnungszeit, LocalTime schliesszeit) {
        this.oeffnungszeit = oeffnungszeit;
        this.schliesszeit = schliesszeit;
    }
    // Prüft, ob eine Uhrzeit innerhalb der Öffnungszeiten liegt
    public boolean istGeoeffnet(LocalTime zeit) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return !zeit.isBefore(oeffnungszeit) && !zeit.isAfter(schliesszeit);
        }
        return false; // Fallback für ältere Android-Versionen
    }
}
