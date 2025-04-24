package BusinessLogik.MVC;

import BusinessLogik.Nahrung.EssenTypen;

/**
 * Klasse MVCController ist für die Erzeugung des User Interface und des Datenmodells verantwortlich.
 * Zusätzlich werden alle Benutzeraktionen im User Interface in Form von ActionEvents behandelt.
 *
 * @author Julius
 * @version 1.0
 */

public class MVCController {

    private BusinessLogik.MVC.MVCView view;
    private BusinessLogik.MVC.MVCModel model;

    public MVCController() {
        //Erzeugung des User Interface durch ein Objekt der Klasse MVCView
        this.view = new MVCView(this);
        //Erzeugung des Datenmodells durch ein Objekt der Klasse MVCModel
        this.model = new MVCModel();

        model.datamanager.initDaten();
    }

    public void legeRezeptan() {
        model.essenverwaltung.zeigeGerichteAn(EssenTypen.COCKTAIL);
    }
}
