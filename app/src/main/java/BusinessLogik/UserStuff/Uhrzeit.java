package BusinessLogik.UserStuff;

import android.os.Build;

import java.time.LocalTime;

public class Uhrzeit {
    // Gibt die aktuelle Uhrzeit zurück
    public LocalTime getAktuelleUhrzeit() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return LocalTime.now();
        }
        return null; // Fallback für ältere Android-Versionen
    }
}
