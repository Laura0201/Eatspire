/**
 * Klasse zur Erzeugung des Datenmodells
 *
 * @author Julius
 * @version 1.0
 */

package BusinessLogik.MVC;

import BusinessLogik.Data.DataManager;
import BusinessLogik.Data.UserVerwaltung;

public class MVCModel {
    DataManager datamanager;
    private UserVerwaltung userVerwaltung;
    public MVCModel() {

        init();

    }
    public DataManager getDatamanager() {
        return datamanager;
    }

    public void init() {

        datamanager = new DataManager();
        userVerwaltung=new UserVerwaltung();
        System.out.println("Initialisieren des Datenmodells abgeschlossen");

    }
    public UserVerwaltung getUserVerwaltung() {
        return userVerwaltung;
    }


}