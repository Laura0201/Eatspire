/**
 * Erbt von BasisEssen -> BasisGetränk,
 * hier keine Objekte erstellen!!
 * hier können attribute und methoden die ALLE KaltGetränke haben implementiert werden.
 * @author Julius
 * @version 1.0
 */
package BusinessLogik.Nahrung;

public class KaltGetränk extends BasisGetränk {
    private boolean alkoholisch;
    public KaltGetränk(String name, double preis, Zutat[] zutaten, EssenTypen typ, double volumen, boolean alkoholisch) {
        super(name, preis, zutaten, typ, volumen);
        this.alkoholisch = alkoholisch;
    }

    public boolean isAlkoholisch() {
        return alkoholisch;
    }
}
