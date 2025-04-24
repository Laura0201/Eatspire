/**
 * Erbt von BasisEssen -> BasisGericht,
 * hier keine Hauptspeißen erstellen!!
 * hier können attribute und methoden die ALLE hauptspeißen haben implementiert werden.
 * @author Julius
 * @version 1.0
 */
package BusinessLogik.Nahrung;

public class Hauptspeiße extends BasisGericht {
    Hauptspeiße(String name, double preis, Zutat[] zutaten, EssenTypen typ) {
        super(name, preis, zutaten, typ);
    }
}

