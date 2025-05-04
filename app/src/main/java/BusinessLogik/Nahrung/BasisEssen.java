/**
 * Oberklasse für alle Gerichte und Getränke
 * Dinge die für alles was in einem EssensOrt gelten soll können hier hinzugefügt werden.
 * @author Julius
 * @version 1.0
 */
package BusinessLogik.Nahrung;

import java.util.ArrayList;

import BusinessLogik.EssensOrte.EssensOrt;

public abstract class BasisEssen {
    private int id;

    private double preis;
    private String name;
    private Zutat[] zutaten;

    private EssenTypen typ;
    BasisEssen(String name, double preis, Zutat[] zutaten, EssenTypen typ){
        this.name = name;
        this.preis = preis;
        this.zutaten = zutaten;
        this.typ = typ;
    }
    public String gibZutatenAus(BasisEssen essen) {
        StringBuilder zutatenListe = new StringBuilder();
        for (Zutat Z : essen.zutaten) {
            zutatenListe.append(Z.getName());
            zutatenListe.append("; ");
        }
        System.out.println(zutatenListe.toString());
        return zutatenListe.toString();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getPreis() {
        return preis;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }

    public EssenTypen getTyp() {
        return typ;
    }
}
