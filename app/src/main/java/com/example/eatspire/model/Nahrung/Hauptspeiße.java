/**
 * Erbt von BasisEssen -> BasisGericht,
 * hier keine Hauptspeißen erstellen!!
 * hier können attribute und methoden die ALLE hauptspeißen haben implementiert werden.
 * @author Julius
 * @version 1.0
 */
package com.example.eatspire.model.Nahrung;

public class Hauptspeiße extends BasisEssen {
    public Hauptspeiße(String name, Zutat[] zutaten) {
        super(name, zutaten);
    }
}

