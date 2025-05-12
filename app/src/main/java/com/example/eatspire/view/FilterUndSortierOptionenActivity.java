package com.example.eatspire.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.ComponentActivity;

import com.example.eatspire.R;

public class FilterUndSortierOptionenActivity extends ComponentActivity {

    private TextView textRadiusLabel;
    private SeekBar seekBarRadius;
    private CheckBox checkboxToGo, checkboxOpen, checkboxVegetarian;
    private CheckBox checkboxItalian, checkboxAsian, checkboxFastFood, checkboxSnacks,
            checkboxSpirits, checkboxFrench, checkboxGerman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filter_und_sortieroptionen_view);

        // Spinner
        Spinner spinnerSortOptions = findViewById(R.id.dropdownSortOptions);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,
                new String[]{"Nächste", "Beste Bewertung"});
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSortOptions.setAdapter(adapter);
        spinnerSortOptions.setSelection(0); // noch nicht anwendbar
        spinnerSortOptions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedOption = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        // SeekBar + Text
        textRadiusLabel = findViewById(R.id.textRadiusLabel);
        seekBarRadius = findViewById(R.id.seekBarRadius);
        seekBarRadius.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateRadiusLabel(progress);
            }

            @Override public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        // Filter-Checkboxen
        checkboxToGo = findViewById(R.id.checkboxToGo);
        checkboxOpen = findViewById(R.id.checkboxOpen);
        checkboxVegetarian = findViewById(R.id.checkboxVegetarian);

        checkboxItalian = findViewById(R.id.checkboxItalian);
        checkboxAsian = findViewById(R.id.checkboxAsian);
        checkboxFastFood = findViewById(R.id.checkboxFastFood);
        checkboxSnacks = findViewById(R.id.checkboxSnacks);
        checkboxSpirits = findViewById(R.id.checkboxSpirits);
        checkboxFrench = findViewById(R.id.checkboxFrench);
        checkboxGerman = findViewById(R.id.checkboxGerman);

        // 💾 Filterwerte aus vorheriger Sitzung laden
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            checkboxToGo.setChecked(extras.getBoolean("toGo", true));
            checkboxOpen.setChecked(extras.getBoolean("open", true));
            checkboxVegetarian.setChecked(extras.getBoolean("vegetarian", true));

            checkboxItalian.setChecked(extras.getBoolean("italian", true));
            checkboxAsian.setChecked(extras.getBoolean("asian", true));
            checkboxFastFood.setChecked(extras.getBoolean("fastfood", true));
            checkboxSnacks.setChecked(extras.getBoolean("snacks", true));
            checkboxSpirits.setChecked(extras.getBoolean("spirits", true));
            checkboxFrench.setChecked(extras.getBoolean("french", true));
            checkboxGerman.setChecked(extras.getBoolean("german", true));

            int umkreis = extras.getInt("umkreis", 0);
            seekBarRadius.setProgress(umkreis / 5); // SeekBar-Wert in 5er-Schritten
            updateRadiusLabel(umkreis / 5);
        } else {
            // Falls keine Extras vorhanden: Standardmäßig alles aktiv
            checkboxToGo.setChecked(true);
            checkboxOpen.setChecked(true);
            checkboxVegetarian.setChecked(true);
            checkboxItalian.setChecked(true);
            checkboxAsian.setChecked(true);
            checkboxFastFood.setChecked(true);
            checkboxSnacks.setChecked(true);
            checkboxSpirits.setChecked(true);
            checkboxFrench.setChecked(true);
            checkboxGerman.setChecked(true);
            seekBarRadius.setProgress(0);
            updateRadiusLabel(0);
        }

        // Anwenden-Button
        Button buttonApply = findViewById(R.id.buttonApply);
        buttonApply.setOnClickListener(v -> {
            int umkreisKm = seekBarRadius.getProgress() * 5;

            Intent resultIntent = new Intent();
            resultIntent.putExtra("umkreis", umkreisKm);
            resultIntent.putExtra("toGo", checkboxToGo.isChecked());
            resultIntent.putExtra("open", checkboxOpen.isChecked());
            resultIntent.putExtra("vegetarian", checkboxVegetarian.isChecked());
            resultIntent.putExtra("italian", checkboxItalian.isChecked());
            resultIntent.putExtra("asian", checkboxAsian.isChecked());
            resultIntent.putExtra("fastfood", checkboxFastFood.isChecked());
            resultIntent.putExtra("snacks", checkboxSnacks.isChecked());
            resultIntent.putExtra("spirits", checkboxSpirits.isChecked());
            resultIntent.putExtra("french", checkboxFrench.isChecked());
            resultIntent.putExtra("german", checkboxGerman.isChecked());

            setResult(RESULT_OK, resultIntent);
            finish();
        });

        // Zurück-Button
        Button buttonBack = findViewById(R.id.buttonBackTop);
        buttonBack.setOnClickListener(v -> finish());
    }

    private void updateRadiusLabel(int progress) {
        int km = progress * 5;
        textRadiusLabel.setText("Umkreis: " + km + " km");
    }
}
