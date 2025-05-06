/**
 * Klasse zur Erzeugung des Datenmodells
 *
 * @author Julius
 * @version 1.0
 */

package BusinessLogik.MVC;

import BusinessLogik.Data.DataManager;

public class MVCModel {

    EssenVerwaltung essenverwaltung;

    DataManager datamanager;

    public MVCModel() {

        init();

    }

    public void init() {

        essenverwaltung = new EssenVerwaltung();

        datamanager = new DataManager();
        System.out.println("Initialisieren des Datenmodells abgeschlossen");

    }


}