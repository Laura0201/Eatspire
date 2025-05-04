/**
 * Erbt von BasisEssen -> BasisGericht,
 * hier keine Objekte erstellen!!
 * hier können attribute und methoden die ALLE hvorpeißen haben implementiert werden.
 * @author Julius
 * @version 1.0
 */
package BusinessLogik.Nahrung;

public class Vorspeise extends BasisEssen {
    public Vorspeise(String name, Zutat[] zutaten) {
        super(name, zutaten);
    }
}
