package BusinessLogik.MVC;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eatspire.R;

/**
 * Start-Activity der App. Verbindet das View mit dem Controller.
 */
public class MVC extends AppCompatActivity {

    private MVCController controller;
    private EditText editTextAdresse;
    private Button buttonSetManuelleAdresse;
    private Button buttonHoleStandort;
    private TextView textViewAdresse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        controller = new MVCController();       // Controller erstellen
        controller.setActivity(this);            // Activity referenzieren

        setContentView(R.layout.activity_mvc);  // Layout setzen

        // UI-Elemente binden
        editTextAdresse = findViewById(R.id.editTextAdresse);
        buttonSetManuelleAdresse = findViewById(R.id.buttonSetManuelleAdresse);
        buttonHoleStandort = findViewById(R.id.buttonHoleStandort);
        textViewAdresse = findViewById(R.id.textViewAdresse);

        // Listener: Automatisch Standort holen
        buttonHoleStandort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.holeAutomatischStandort();
            }
        });

        // Listener: Manuelle Adresse setzen
        buttonSetManuelleAdresse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String adresseInput = editTextAdresse.getText().toString().trim();
                if (!adresseInput.isEmpty()) {
                    controller.handleManuelleAdresse(adresseInput);
                } else {
                    Toast.makeText(MVC.this, "Bitte Adresse eingeben.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    /**
     * Aktualisiert die Adresse im TextView.
     */
    public void zeigeAdresseAn(String adresse) {
        textViewAdresse.setText("Adresse: " + adresse);
    }
}
