/**
 * Erbt von BasisEssen -> BasisGetränk,
 * hier keine Objekte erstellen!!
 * hier können attribute und methoden die ALLE KaltGetränke haben implementiert werden.
 * @author Julius
 * @version 1.0
 */
package com.example.eatspire.model.Nahrung;

public class Heißgetränk extends BasisGetränk {

    public Heißgetränk(String name, Zutat[] zutaten) {
        super(name, zutaten);
    }


}
