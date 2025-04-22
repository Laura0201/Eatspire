package BusinessLogik;

import java.util.ArrayList;

public class Pizza extends Gericht{
    private double preis;
    private String name;
    private ArrayList<Zutat> zutatenListe = new ArrayList<>();
    Pizza(String Name, double Preis){
        name=Name;
        preis=Preis;
        int test;
    }

    public void erstelleZutatenliste(Zutat[] Zutatenliste) {
        for (Zutat Z : Zutatenliste) {
            zutatenListe.add(Z);
        }
    }
}

