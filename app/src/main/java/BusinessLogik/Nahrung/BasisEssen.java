/**
 * Oberklasse für alle Gerichte und Getränke
 * Dinge die für alles was in einem EssensOrt gelten soll können hier hinzugefügt werden.
 * @author Julius
 * @version 1.0
 */
package BusinessLogik.Nahrung;

public abstract class BasisEssen {
    private static int idDesGerichts = 0;

    private double preis;
    private String name;
    private Zutat[] zutaten;

    BasisEssen(String name, double preis, Zutat[] zutaten){
        this.name = name;
        this.zutaten = zutaten;
        this.preis = errechnePreis(zutaten);
    }
    public Zutat[] gibZutatenArrayZurück(BasisEssen essen) {
        return essen.getZutaten();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return idDesGerichts;
    }

    public void setPreis(double neuerPreis){
        this.preis = neuerPreis;
    }
    public double getPreis() {
        return preis;
    }
    public double errechnePreis(Zutat[] zutaten){
        double preis = 0;
        for (Zutat zutat : zutaten) {
            preis += zutat.getPreis();
        }
        return preis;
    }
    public Zutat[] getZutaten() {
        return zutaten;
    }

}
