package BusinessLogik.EssensOrte;

import java.util.ArrayList;

import BusinessLogik.Nahrung.BasisGericht;

public class Restaurant extends EssensOrt{

    private double latitude;
    private double longitude;
    public Restaurant(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    private ArrayList<BasisGericht> listeGerichte = new ArrayList<BasisGericht>();

    //Methoden:
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
    public void setName(String Name){
        name=Name;
    }
    public void setAdresse(String Adresse){
        adressfeld=Adresse;
    }
    //....
}
