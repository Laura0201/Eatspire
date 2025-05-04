/**
 * Erbt von BasisEssen -> BasisGericht,
 * hier keine Objekte erstellen!!
 * hier können attribute und methoden die ALLE Nachspeißen haben implementiert werden.
 * @author Julius
 * @version 1.0
 */
package BusinessLogik.Nahrung;

public class Nachspeiße extends BasisEssen {
    Nachspeiße(String name, double preis, Zutat[] zutaten) {
        super(name, preis, zutaten);
    }
}
