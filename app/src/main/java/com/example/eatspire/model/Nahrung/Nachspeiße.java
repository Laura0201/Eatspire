/**
 * Erbt von BasisEssen -> BasisGericht,
 * hier keine Objekte erstellen!!
 * hier können attribute und methoden die ALLE Nachspeißen haben implementiert werden.
 * @author Julius
 * @version 1.0
 */
package com.example.eatspire.model.Nahrung;

public class Nachspeiße extends BasisEssen {
    public Nachspeiße(String name, Zutat[] zutaten) {
        super(name, zutaten);
    }
}
