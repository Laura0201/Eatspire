package com.example.eatspire;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.activity.ComponentActivity;
//Das ist alles nur random aus der vorlesung!!!
public class MainActivity1 extends ComponentActivity {
    private EditText _editTextCustomerName;
    private EditText _editTextDeviceName;
    private CheckBox _checkBoxAgb;
    private Button _buttonNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableEdgeToEdge();
        setContentView(R.layout.activity_main);

        _editTextCustomerName = findViewById(R.id.edit_text_customer_name);
        _editTextDeviceName = findViewById(R.id.edit_text_device_name);
        _checkBoxAgb = findViewById(R.id.check_box_agb_accept);
        _buttonNew = findViewById(R.id.button_new_order);

        _buttonNew.setOnClickListener(view ->{
            String customerName = _editTextCustomerName.getText().toString();
            String deviceName = _editTextDeviceName.getText().toString();

            boolean agbAccepted = _checkBoxAgb.isChecked();
            if(!agbAccepted){

            }

            // Handle the button click event here
            // For example, you can start a new activity or show a message
            // based on the input values.
        });
    }

    private void enableEdgeToEdge() {
        // Implement your edge-to-edge functionality here
    }
}



