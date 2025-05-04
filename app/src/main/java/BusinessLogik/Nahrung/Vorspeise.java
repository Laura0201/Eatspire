/**
 * Erbt von BasisEssen -> BasisGericht,
 * hier keine Objekte erstellen!!
 * hier können attribute und methoden die ALLE hvorpeißen haben implementiert werden.
 * @author Julius
 * @version 1.0
 */
package BusinessLogik.Nahrung;

public class Vorspeise extends BasisGericht {
    Vorspeise(String name, double preis, Zutat[] zutaten, EssenTypen typ) {
        super(name, preis, zutaten, typ);
    }
}
