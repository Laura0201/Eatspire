/**
 * Klasse initialisieren der Daten, basically die "Datenbank",
 * immer nur EINE erstellen, passiert Automatisch über Model/Controller/ MVC
 * @author Julius
 * @version 1.0
 */
package BusinessLogik.Data;

import static BusinessLogik.Nahrung.EssenTypen.COCKTAIL;
import static BusinessLogik.Nahrung.EssenTypen.LIMO;

import BusinessLogik.Nahrung.Kaltgetränk;
import BusinessLogik.Nahrung.Zutat;

//import com.google.gson.*;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
public class DataManager {

    public DataManager() {
        initDaten();
    }

    public void initDaten() {
        Zutat limette = new Zutat("Limette", 2.00);
        Zutat zucker = new Zutat("Zucker", 0.25);
        Zutat orange = new Zutat("Orange", 1.50);
        Zutat minze = new Zutat("Minze", 0.75);
        Zutat wasser = new Zutat("Wasser", 0.10);
        Zutat eis = new Zutat("Eis", 0.50);

        Zutat[] zutatenCaipirinha = {limette, zucker};
        Zutat[] zutatenOrangenlimo = {orange, minze, wasser, eis};

        Kaltgetränk orangenlimo = new Kaltgetränk("Orangenlimo", 4.5, zutatenOrangenlimo, LIMO, 0.4, false);
        Kaltgetränk caipirinha = new Kaltgetränk("Caipirinha", 11, zutatenCaipirinha, COCKTAIL, 0.4, true);

    }
}
