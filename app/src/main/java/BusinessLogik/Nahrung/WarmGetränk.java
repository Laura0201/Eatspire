/**
 * Erbt von BasisEssen -> BasisGetränk,
 * hier keine Objekte erstellen!!
 * hier können attribute und methoden die ALLE KaltGetränke haben implementiert werden.
 * @author Julius
 * @version 1.0
 */
package BusinessLogik.Nahrung;

public class WarmGetränk extends BasisGetränk {
    private int temperatur;
    WarmGetränk(String name, double preis, Zutat[] zutaten, EssenTypen typ, double volumen, int temperatur) {
        super(name, preis, zutaten, typ, volumen);
        this.temperatur = temperatur;
    }

    public int getTemperatur() {
        return temperatur;
    }
}
