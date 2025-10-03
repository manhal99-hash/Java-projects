public class Hausratversicherung extends Versicherung{
    private int wohnflaeche;
    private int wert;
    public Hausratversicherung(String name,int kundennummer,int beitrag,int wohnflaeche,int wert){
        super(name,kundennummer,beitrag);
        this.wohnflaeche = wohnflaeche;
        this.wert = wert;
    }
    public int getWohnflaeche(){
        return wohnflaeche;
    }
    public int getWert(){
        return wert;
    }
    public String toString(){
        return super.toString()+"\nWohnfläche beträgt: "+wohnflaeche+"\nUnd wert von "+wert;
    }
    public int abrechnen(){
        return super.getBeitrag();
    }
    public String anmelden(String datum){
        return "Die HausratVersicherung wird am "+datum+" angemeldet.";
    }
    public String bearbeiten(){
        return "Die HausratVersicherung wird jetzt bearbeitet";
    }
}
