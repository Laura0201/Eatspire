package BusinessLogik.Data;

import java.util.ArrayList;
import java.util.List;

import BusinessLogik.UserStuff.User;

/**
 * Verwaltungsklasse für Nutzerobjekte.
 * Hält die Liste aller registrierten User und den aktuell aktiven User.
 */
public class UserVerwaltung {

    private List<User> userListe;
    private User aktuellerUser;

    public UserVerwaltung() {
        this.userListe = new ArrayList<>();
    }

    /**
     * Fügt einen neuen Benutzer hinzu und setzt ihn als aktuellen Benutzer.
     *
     * @param user Der neu erstellte Benutzer.
     */
    public void nehmeUserAuf(User user) {
        if (user != null) {
            userListe.add(user);
            aktuellerUser = user;
        }
    }

    /**
     * Gibt den aktuell aktiven Benutzer zurück.
     *
     * @return Aktueller Benutzer oder null, falls keiner vorhanden ist.
     */
    public User getAktuellenUser() {
        return aktuellerUser;
    }

    /**
     * Gibt eine Kopie der Liste aller Benutzer zurück.
     *
     * @return Liste aller Benutzer.
     */
    public List<User> getAllUsers() {
        return new ArrayList<>(userListe);
    }

    /**
     * Setzt einen bestehenden Benutzer manuell als aktuellen Benutzer.
     *
     * @param user Benutzer, der als aktiv gesetzt werden soll.
     */
    public void setAktuellenUser(User user) {
        if (userListe.contains(user)) {
            this.aktuellerUser = user;
        }
    }
}
