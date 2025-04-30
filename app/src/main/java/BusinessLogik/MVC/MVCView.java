package BusinessLogik.MVC;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

/**
 * MVCView ist zuständig für die Benutzeroberfläche (UI) und Navigation.
 */
public class MVCView {

    private MVCController controller;
    private Activity activity;

    public MVCView(MVCController controller) {
        this.controller = controller;
        this.activity = controller.getActivity();
        init();
    }

    /**
     * Initialisiert die Benutzeroberfläche.
     */
    public void init() {
        System.out.println("UI initialisiert.");
        Toast.makeText(activity, "App gestartet!", Toast.LENGTH_SHORT).show();
    }

    /**
     * Zeigt die aktuelle Adresse im Layout an.
     */
    public void zeigeAdresseAn(String adresse) {
        if (activity instanceof MVC) {
            ((MVC) activity).zeigeAdresseAn(adresse);
        }
    }

    /**
     * Startet eine neue Activity (wenn du z.B. später eine Hauptseite hast).
     */
    public void geheZurNaechstenSeite() {
        //Intent intent = new Intent(activity, MainPageActivity.class);  // Beispiel
        //activity.startActivity(intent);
        //activity.finish(); // Alte Seite schließen, damit User nicht zurück kann
    }
}
