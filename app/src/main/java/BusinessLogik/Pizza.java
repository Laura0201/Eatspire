package BusinessLogik;

public class Pizza extends Gericht{
    private double preis;
    private String name;
    Pizza(String Name, double Preis){
        name=Name;
        preis=Preis;
    }

    public void erstelleZutatenliste(Zutat[] Zutatenliste) {
        for (Zutat Z : Zutatenliste) {
            zutatenListe.add(Z);
        }
    }
}

