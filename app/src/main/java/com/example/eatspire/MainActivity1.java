package com.example.eatspire;

import android.health.connect.datatypes.ExerciseRoute;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.activity.ComponentActivity;
import BusinessLogik.UserStuff.User;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.text.BreakIterator;




public class MainActivity1 extends ComponentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableEdgeToEdge();
        setContentView(R.layout.activity_main);


        };


    private void enableEdgeToEdge() {
        // Implement your edge-to-edge functionality here
    }
}



