/**
 * Erbt von BasisEssen -> BasisGetränk,
 * hier keine Objekte erstellen!!
 * hier können attribute und methoden die ALLE KaltGetränke haben implementiert werden.
 * @author Julius
 * @version 1.0
 */
package com.example.eatspire.businesslogik.Nahrung;

public class Kaltgetränk extends BasisGetränk {
    private boolean alkoholisch;
    public Kaltgetränk(String name, Zutat[] zutaten, boolean alkoholisch) {
        super(name, zutaten);
        this.alkoholisch = alkoholisch;
    }

    public boolean isAlkoholisch() {
        return alkoholisch;
    }
}
