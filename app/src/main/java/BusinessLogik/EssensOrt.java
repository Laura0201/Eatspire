package BusinessLogik;

import android.os.Build;

import java.time.LocalTime;

public abstract class EssensOrt {
    public String name;
    public String beschreibung;

    //Standortschnittstelle
    //Öffnungszeiten - Schnittstelle?

    //Kontaktdaten:
    public String adressfeld;
    public String telefonnummer;
    public String mail;
    public String website;


    //Uhrzeit
    private LocalTime oeffnungszeit;
    private LocalTime schliesszeit;

    public void setOeffnungszeiten(LocalTime oeffnungszeit, LocalTime schliesszeit) {
        this.oeffnungszeit = oeffnungszeit;
        this.schliesszeit = schliesszeit;
    }
    // Prüft, ob eine Uhrzeit innerhalb der Öffnungszeiten liegt
    public boolean istGeoeffnet(LocalTime zeit) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return !zeit.isBefore(oeffnungszeit) && !zeit.isAfter(schliesszeit);
        }
        return false; // Fallback für ältere Android-Versionen
    }
    }
    /*Hinweise zur UHrzeit:
    Da du LocalTime für die Öffnungs- und Schließzeiten verwendest, müssen die Zeiten im HH:mm:ss-Format
    (Stunden:Minuten:Sekunden) angegeben werden. Das bedeutet, dass du Zeiten in einem 24-Stunden-Format
    ohne AM/PM übergeben solltest.
Beispiel:
restaurant.setOeffnungszeiten(LocalTime.of(9, 0), LocalTime.of(18, 0));
Erklärung:
LocalTime.of(hour, minute):
Übergib die Stunden und Minuten als Integer-Werte. Sekunden können weggelassen werden, wenn sie nicht benötigt werden,
da der Standardwert für Sekunden 0 ist.
Oder aus einem String:
LocalTime oeffnungszeit = LocalTime.parse("09:00:00");
LocalTime schliesszeit = LocalTime.parse("18:00:00");
restaurant.setOeffnungszeiten(oeffnungszeit, schliesszeit);
Nur Stunden und Minuten (ohne Sekunden):
LocalTime oeffnungszeit = LocalTime.of(9, 0);  // 09:00 Uhr
LocalTime schliesszeit = LocalTime.of(18, 0); // 18:00 Uhr
Eingabeformat:
LocalTime.of() erwartet, dass die Stunden zwischen 0 und 23 und die Minuten zwischen 0 und 59 liegen.

LocalTime.parse() erwartet Strings im Format "HH:mm" oder "HH:mm:ss". Ein ungültiger String, wie z. B. "25:00",
wirft eine DateTimeParseException.
     */



