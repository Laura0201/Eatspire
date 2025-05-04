/**
 * Oberklasse für alle Getränke
 * alles was für jegliche Getränke (Warm oder Kalt) gelten soll kann hier hinzugefügt werden.
 * @author Julius
 * @version 1.0
 */
package BusinessLogik.Nahrung;

public class BasisGetränk {
    double volumen;

    BasisGetränk(String name, double preis, Zutat[] zutaten, EssenTypen typ, double volumen) {
        super(name, preis, zutaten, typ);
        this.volumen = volumen;
    }
}
