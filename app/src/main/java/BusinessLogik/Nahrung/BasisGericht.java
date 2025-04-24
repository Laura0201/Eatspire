/**
 * Oberklasse für alle Gerichte
 * alles was für jegliche Gerichte (Vor, Haupt oder nach - speiße) gelten soll kann hier hinzugefügt werden.
 * @author Julius
 * @version 1.0
 */
package BusinessLogik.Nahrung;


public class BasisGericht extends BasisEssen{

    BasisGericht(String name, double preis, Zutat[] zutaten, EssenTypen typ) {
        super(name, preis, zutaten, typ);
    }
}

