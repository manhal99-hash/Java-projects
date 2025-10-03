public class Autoversicherung extends Versicherung{
    private String kennzeichen;
    private String typ;
    private int schaden;
    public Autoversicherung(String name,int kundennummer,int beitrag,String kennzeichen,String typ,int schaden){
        super(name,kundennummer,beitrag);
        this.kennzeichen = kennzeichen;
        this.typ = typ;
        this.schaden = schaden;
    }
    public String getKennzeichen(){
        return kennzeichen;
    }
    public String getTyp(){
        return typ;
    }
    public int getSchaden(){
        return schaden;
    }
    public String toString(){
        return super.toString()+"\nKennzeichen : \n"+kennzeichen+"Auto Marke ist "+typ+" Schadenhohe beträgt"+schaden;
    }
    public int abrechnen(){
        return super.getBeitrag();
    }
    public String anmelden(String datum){
        return "Die AutoVersicherung wird am "+datum+" angemeldet.";
    }
    public String bearbeiten(){
        return "Die AutoVersicherung wird jetzt bearbeitet";
    }
}
