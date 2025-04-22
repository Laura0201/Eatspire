package BusinessLogik;

import java.util.ArrayList;
public class Restaurant extends EssensOrt{

    private double latitude;
    private double longitude;
    public Restaurant(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    private ArrayList<Gericht> listeGerichte = new ArrayList<Gericht>();

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
