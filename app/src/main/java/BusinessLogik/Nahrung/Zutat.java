package BusinessLogik.Nahrung;

public class Zutat {
    private String name;
    private double preis;

    public Zutat(String name, double preis){
        this.name = name;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }
}
