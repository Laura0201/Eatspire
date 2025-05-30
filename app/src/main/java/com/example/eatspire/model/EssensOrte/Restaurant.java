package com.example.eatspire.model.EssensOrte;

import android.os.Build;
import com.example.eatspire.model.Nahrung.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String name;
    private String beschreibung;
    private String adressfeld;
    private String telefonnummer;
    private String mail;
    private String website;
    private double latitude;
    private double longitude;
    private Kategorien kategorie;
    private boolean toGomöglich;
    private boolean hatVegetarisch;

    private ArrayList<Bewertung> bewertungen = new ArrayList<>();

    private ArrayList<Hauptspeiße> listeHauptspeisen = new ArrayList<>();
    private ArrayList<Vorspeise> listeVorspeisen = new ArrayList<>();
    private ArrayList<Nachspeiße> listeNachspeisen = new ArrayList<>();
    private ArrayList<Heißgetränk> listeHeißgetränke = new ArrayList<>();
    private ArrayList<Kaltgetränk> listeKaltgetränke = new ArrayList<>();

    private LocalTime oeffnungszeit;
    private LocalTime schliesszeit;

    // Konstruktor
    public Restaurant(Kategorien kategorie, boolean toGoMoeglich) {
        this.kategorie = kategorie;
        this.toGomöglich = toGoMoeglich;
    }

    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getAdressfeld() {
        return adressfeld;
    }

    public void setAdresse(String adresse) {
        this.adressfeld = adresse;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Kategorien getKategorie() {
        return kategorie;
    }

    public void setKategorie(Kategorien kategorie) {
        this.kategorie = kategorie;
    }

    public boolean isToGomöglich() {
        return toGomöglich;
    }

    public void setToGomöglich(boolean toGomöglich) {
        this.toGomöglich = toGomöglich;
    }

    public boolean isHatVegetarisch() {
        return hatVegetarisch;
    }

    public void setHatVegetarisch(boolean hatVegetarisch) {
        this.hatVegetarisch = hatVegetarisch;
    }

    public List<Hauptspeiße> getHauptspeisen() {
        return listeHauptspeisen;
    }

    public void setHauptspeisenListe(ArrayList<Hauptspeiße> listeGerichte) {
        this.listeHauptspeisen = listeGerichte;
    }

    public List<Vorspeise> getVorspeisen() {
        return listeVorspeisen;
    }

    public void setVorspeisenListe(ArrayList<Vorspeise> listeGerichte) {
        this.listeVorspeisen = listeGerichte;
    }

    public List<Nachspeiße> getNachspeisen() {
        return listeNachspeisen;
    }

    public void setNachspeisenListe(ArrayList<Nachspeiße> listeGerichte) {
        this.listeNachspeisen = listeGerichte;
    }

    public List<Heißgetränk> getHeißgetränke() {
        return listeHeißgetränke;
    }

    public void setHeißgetränkeListe(ArrayList<Heißgetränk> listeGerichte) {
        this.listeHeißgetränke = listeGerichte;
    }

    public List<Kaltgetränk> getKaltgetränke() {
        return listeKaltgetränke;
    }

    public void setKaltgetränkeListe(ArrayList<Kaltgetränk> listeGerichte) {
        this.listeKaltgetränke = listeGerichte;
    }

    public List<Bewertung> getBewertungen() {
        return bewertungen;
    }

    public void setBewertungen(ArrayList<Bewertung> bewertungen) {
        this.bewertungen = bewertungen;
    }

    public LocalTime getOeffnungszeit() {
        return oeffnungszeit;
    }

    public LocalTime getSchliesszeit() {
        return schliesszeit;
    }

    public void setOeffnungszeiten(LocalTime oeffnungszeit, LocalTime schliesszeit) {
        this.oeffnungszeit = oeffnungszeit;
        this.schliesszeit = schliesszeit;
    }

    public boolean istGeoeffnet(LocalTime zeit) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return !zeit.isBefore(oeffnungszeit) && !zeit.isAfter(schliesszeit);
        }
        return false;
    }

    private int bildResourceId;

    public void setBildResourceId(int resId) {
        this.bildResourceId = resId;
    }

    public int getBildResourceId() {
        return bildResourceId;
    }


}
