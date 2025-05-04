package BusinessLogik.MVC;

import android.app.Activity;

import BusinessLogik.Data.UserVerwaltung;
import BusinessLogik.UserStuff.User;

/**
 * Controller steuert die Verbindung zwischen View und Model (Datenlogik).
 */
public class MVCController {

    private MVCView view;
    private MVCModel model;
    private UserVerwaltung userVerwaltung;
    private User aktuellerUser;

    private Activity activity;

    public MVCController() {
        this.model = new MVCModel();
        this.userVerwaltung = new UserVerwaltung();
    }

    /**
     * Muss aufgerufen werden, sobald die Activity bereit ist.
     */
    public void setActivity(Activity activity) {
        this.activity = activity;
        this.view = new MVCView(this);

        initApp();
    }

    /**
     * Initialisiert User- und Datenmodelle beim Start.
     */
    private void initApp() {
        model.datamanager.initDaten();

        // Test-User erstellen, wenn noch kein User existiert
        if (userVerwaltung.getAktuellenUser() == null) {
            User user = new User("TestUser", "password123");
            userVerwaltung.nehmeUserAuf(user);
        }

        aktuellerUser = userVerwaltung.getAktuellenUser();
        frageStandortAb();
    }

    /**
     * Fragt automatisch den Standort des aktuellen Users ab.
     */
    public void holeAutomatischStandort() {
        frageStandortAb();
    }

    /**
     * Interner Aufruf: Standort automatisch abfragen.
     */
    private void frageStandortAb() {
        if (aktuellerUser != null) {
            aktuellerUser.getStandort().holeAutomatischStandort(activity, (latitude, longitude, adresse) -> {
                aktuellerUser.setStandortDaten(latitude, longitude, adresse);
                view.zeigeAdresseAn(adresse);
                System.out.println("Automatisch Standort gesetzt: " + adresse);
            });
        }
    }

    /**
     * Benutzer setzt manuell eine Adresse.
     */
    public void handleManuelleAdresse(String adresseInput) {
        if (aktuellerUser != null) {
            aktuellerUser.getStandort().verarbeiteManuelleAdresse(activity, adresseInput, (latitude, longitude, adresse) -> {
                aktuellerUser.setStandortDaten(latitude, longitude, adresse);
                view.zeigeAdresseAn(adresse);
                System.out.println("Manuelle Adresse gesetzt: " + adresse);
            });
        }
    }

    /**
     * Beispiel für weitere Benutzeraktionen (Rezeptverwaltung etc.).
     */
    public void legeRezeptan() {
        model.essenverwaltung.zeigeGerichteAn(EssenTypen.COCKTAIL);
    }

    /**
     * Getter für Activity.
     */
    public Activity getActivity() {
        return activity;
    }
}
