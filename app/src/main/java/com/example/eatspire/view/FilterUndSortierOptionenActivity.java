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
        spinnerSortOptions.setSelection(0);
        spinnerSortOptions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedOption = parent.getItemAtPosition(position).toString();
                Toast.makeText(FilterUndSortierOptionenActivity.this,
                        "Sortierung: " + selectedOption, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        // Umkreis-SeekBar
        textRadiusLabel = findViewById(R.id.textRadiusLabel);
        seekBarRadius = findViewById(R.id.seekBarRadius);
        updateRadiusLabel(seekBarRadius.getProgress());

        seekBarRadius.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateRadiusLabel(progress);
            }

            @Override public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        // Allgemeine Filter
        checkboxToGo = findViewById(R.id.checkboxToGo);
        checkboxOpen = findViewById(R.id.checkboxOpen);
        checkboxVegetarian = findViewById(R.id.checkboxVegetarian);

        // Kategorien
        checkboxItalian = findViewById(R.id.checkboxItalian);
        checkboxAsian = findViewById(R.id.checkboxAsian);
        checkboxFastFood = findViewById(R.id.checkboxFastFood);
        checkboxSnacks = findViewById(R.id.checkboxSnacks);
        checkboxSpirits = findViewById(R.id.checkboxSpirits);
        checkboxFrench = findViewById(R.id.checkboxFrench);
        checkboxGerman = findViewById(R.id.checkboxGerman);

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
