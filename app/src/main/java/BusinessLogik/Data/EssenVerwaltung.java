/**
 * Klasse zur verwaltung von Essen (Verwaltet gerade nur Gerichte!)
 * immer nur EINE erstellen, passiert Automatisch über Model/Controller/ MVC
 * @author Julius
 * @version 1.0
 */
package BusinessLogik.Data;

import java.util.ArrayList;

import BusinessLogik.Nahrung.BasisGericht;
import BusinessLogik.Nahrung.EssenTypen;

public class EssenVerwaltung {

    private ArrayList<BasisGericht> gerichte;
    public EssenVerwaltung() {
        gerichte = new ArrayList<>();
    }
    public void nehmeGerichtAuf(BasisGericht basisGericht) {
        gerichte.add(basisGericht);
    }

    public String zeigeGerichteAn(EssenTypen typ) {
        StringBuilder ausgabe = new StringBuilder();
        for(BasisGericht g : gerichte) {
            if(g.getTyp() == typ) {
                ausgabe.append(g.getName());
            }
        }
        return ausgabe.toString();
    }
    public ArrayList<BasisGericht> zeigeAlleGerichteAn() {
        for(BasisGericht g : gerichte) {
            System.out.print(g.getName());
            System.out.print(", ");
        }
        return gerichte;
    }

    public BasisGericht findeGericht(String name) {
        for(BasisGericht g : gerichte) {
            if(g.getName().equals(name)) {
                return g;
            }
        }
        return null;
    }

    public void loescheGericht(BasisGericht k) {
        for(BasisGericht g : gerichte) {
            if(g == k) {
                gerichte.remove(g);
            }
        }
    }


}
