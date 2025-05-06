/**
 * Klasse zur Erzeugung des Datenmodells
 *
 * @author Julius
 * @version 1.0
 */

package BusinessLogik.MVC;

import BusinessLogik.Data.DataManager;

public class MVCModel {
    DataManager datamanager;
    public MVCModel() {

        init();

    }
    public DataManager getDatamanager() {
        return datamanager;
    }

    public void init() {

        datamanager = new DataManager();
        System.out.println("Initialisieren des Datenmodells abgeschlossen");

    }


}