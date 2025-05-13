/**
 * Oberklasse für alle Getränke
 * alles was für jegliche Getränke (Warm oder Kalt) gelten soll kann hier hinzugefügt werden.
 * @author Julius
 * @version 1.0
 */
package com.example.eatspire.model.Nahrung;

public abstract class BasisGetränk{

    private static int idDesGerichts = 0;
    double volumen;

    private String name;

    private Zutat[] zutaten;
    public double preis;
    private int bildResourceId;

    BasisGetränk(String name, Zutat[] zutaten) {
        this.name = name;
        this.zutaten = zutaten;
        this.preis = errechnePreis(zutaten);
    }

    public Zutat[] gibZutatenArrayZurück(BasisEssen essen) {
        return essen.getZutaten();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return idDesGerichts;
    }

    public void setPreis(double neuerPreis){
        this.preis = neuerPreis;
    }
    public double getPreis() {
        return preis;
    }
    public void setBildResourceId(int bildResourceId) {
        this.bildResourceId = bildResourceId;
    }
    public double errechnePreis(Zutat[] zutaten){
        double preis = 0;
        for (Zutat zutat : zutaten) {
            preis += zutat.getPreis();
        }
        return preis;
    }
    public Zutat[] getZutaten() {
        return zutaten;
    }

}
