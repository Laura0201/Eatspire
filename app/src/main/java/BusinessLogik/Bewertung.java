package BusinessLogik.UserStuff;

public class Bewertung {
    private int bewertungVon1bis5;
    private String freitext;
    public void setBewertungVon1bis5(int Bewertung){
        bewertungVon1bis5=Bewertung;
    }
    public int getBewertungVon1bis5(){
        return bewertungVon1bis5;
    }
    public void setFreitext(String freitext){
        this.freitext=freitext;
    }
    public String getFreitext(){
        return freitext;
    }
}

