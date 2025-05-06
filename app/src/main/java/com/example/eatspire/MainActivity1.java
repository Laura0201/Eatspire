package com.example.eatspire;

import android.health.connect.datatypes.ExerciseRoute;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.activity.ComponentActivity;

import BusinessLogik.EssensOrte.RestaurantsListeRecyclerViewAdapter;
import BusinessLogik.UserStuff.User;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.text.BreakIterator;




public class MainActivity1 extends ComponentActivity {

    private RecyclerView restaurantsRecyclerView;
    private RestaurantsListeRecyclerViewAdapter restaurantsListeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableEdgeToEdge();
        setContentView(R.layout.activity_main);
        restaurantsListeAdapter= new RestaurantsListeRecyclerViewAdapter();
        restaurantsRecyclerView = findViewById(R.id.restaurants_recycler_view);
        restaurantsRecyclerView.setAdapter(restaurantsListeAdapter);
        restaurantsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //für die anderen elemente noch nötig, je nachdem, was Paul schon gemacht hat
        //man beachte die Logik im DataManager, dieser muss evtl. überarbeitet werden, ich
        // denke, so wie ich es jetzt habe sollte es im Prinzip gehen, wenn jemand glaubt es geht
        // nur anders, sprecht es an oder ändert es direkt wenn ihr 100% sicher seid


        };


    private void enableEdgeToEdge() {
        // Implement your edge-to-edge functionality here
    }
}



