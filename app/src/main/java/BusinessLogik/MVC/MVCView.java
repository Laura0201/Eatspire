/**
 * Klasse zur Erzeugung des User Interface
 * @author Julius
 * @version 1.0
 */

package BusinessLogik.MVC;

import com.example.eatspire.MainActivity1;

import BusinessLogik.Data.DataManager;

public class MVCView {

    MVCController controller;

    MainActivity1 ui;

    public MVCView(MVCController controller) {

        this.controller = controller;
        // init(); --> Start des User-Interface Aufbaus
        init();
    }

    public void init(){

        ui = new MainActivity1();
        System.out.println("Initialisieren des UI abgeschlossen");

    }
}