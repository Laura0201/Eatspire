package BusinessLogik.EssensOrte;

import android.os.Build;

import java.time.LocalTime;
import java.util.ArrayList;

import BusinessLogik.Nahrung.BasisEssen;
import BusinessLogik.Nahrung.Hauptspeiße;
import BusinessLogik.Nahrung.Heißgetränk;
import BusinessLogik.Nahrung.Kaltgetränk;
import BusinessLogik.Nahrung.Nachspeiße;
import BusinessLogik.Nahrung.Vorspeise;

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
    private Kategorien kategorie;
    private static int idCounter=-1;
    private int idDesRestaurants;

    private ArrayList<Bewertung> bewertungen = new ArrayList<Bewertung>();

    private boolean hatVegetarisch = false;

    private ArrayList<Hauptspeiße> listeHauptspeisen = new ArrayList<Hauptspeiße>();
    private ArrayList<Vorspeise> listeVorspeisen = new ArrayList<Vorspeise>();
    private ArrayList<Nachspeiße> listeNachspeisen = new ArrayList<Nachspeiße>();
    private ArrayList<Heißgetränk> listeHeißgetränke = new ArrayList<Heißgetränk>();
    private ArrayList<Kaltgetränk> listeKaltgetränke = new ArrayList<Kaltgetränk>();
    private boolean toGomöglich;
    public Restaurant(Kategorien kategorie, boolean toGoMoeglich) {
        this.kategorie = kategorie;
        this.toGomöglich = toGoMoeglich;
        idDesRestaurants=idCounter;
        idCounter++;
    }

    //Methoden:
    public double getLatitude() {
        return latitude;
    }
    public void setToGomöglich(boolean toGomöglich){
        this.toGomöglich=toGomöglich;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setName(String Name){
        name=Name;
    }
    public String getName(){
        return name;
    }
    public void setAdresse(String Adresse){
        adressfeld=Adresse;
    }
    public void setHauptspeisenListe(ArrayList<Hauptspeiße> listeGerichte){
        this.listeHauptspeisen=listeGerichte;
    }
    public ArrayList<Hauptspeiße> getHauptspeisenListe(){
        return listeHauptspeisen;
    }
    public void setVorspeisenListe(ArrayList<Vorspeise> listeGerichte){
        this.listeVorspeisen=listeGerichte;
    }
    public ArrayList<Vorspeise> getVorspeisenListe(){
        return listeVorspeisen;
    }
    public void setNachspeisenListe(ArrayList<Nachspeiße> listeGerichte){
        this.listeNachspeisen=listeGerichte;
    }
    public ArrayList<Nachspeiße> getNachspeisenListe(){
        return listeNachspeisen;
    }
    public void setHeißgetränkeListe(ArrayList<Heißgetränk> listeGerichte){
        this.listeHeißgetränke=listeGerichte;
    }
    public ArrayList<Heißgetränk> getHeißgetränkeListe(){
        return listeHeißgetränke;
    }
    public void setKaltgetränkeListe(ArrayList<Kaltgetränk> listeGerichte){
        this.listeKaltgetränke=listeGerichte;
    }
    public ArrayList<Kaltgetränk> getKaltgetränkeListe(){
        return listeKaltgetränke;
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

    public boolean isHatVegetarisch() {
        return hatVegetarisch;
    }

    public String getBeschreibung(){
        return beschreibung;
    }

    public String getAdressfeld() {
        return adressfeld;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public String getMail() {
        return mail;
    }

    public String getWebsite() {
        return website;
    }

    public Kategorien getKategorie() {
        return kategorie;
    }
    public Hauptspeiße zufälligesGericht(Restaurant restaurant){
        for(int i=0; i<restaurant.listeHauptspeisen.size(); i++){
            int zufallszahl = (int) (Math.random() * restaurant.listeHauptspeisen.size());
            return restaurant.listeHauptspeisen.get(zufallszahl);
        }
        return null;
    }
    public int getIdDesRestaurants(){
        return idDesRestaurants;
    }
    public void setHatVegetarisch(boolean hatVegetarisch) {
        this.hatVegetarisch = hatVegetarisch;
    }
}
