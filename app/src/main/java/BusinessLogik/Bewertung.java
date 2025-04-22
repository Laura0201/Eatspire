package BusinessLogik;

public class Bewertung {
    private int bewertungVon1bis5;
    public void setBewertungVon1bis5(int Bewertung){
        bewertungVon1bis5=Bewertung;
    }
    public int getBewertungVon1bis5(){
        return bewertungVon1bis5;
    }
    private String freitext;
    public void setFreitext(String Freitext){
        freitext=Freitext;
    }
    public String getFreitext(){
        return freitext;
    }
}

