public abstract class Versicherung implements Versicherungsfall{
    private String name;
    private int kundennummer;
    private int beitrag;
    private int vertragsbeginn;
    private int vertragsende;
    private  boolean abgeschlossen;
    static int id = 0;

    public Versicherung(String name,int kundennummer,int beitrag){
        this.name = name;
        this.kundennummer = kundennummer;
        this.beitrag = beitrag;
        this.vertragsbeginn = vertragsbeginn;
        this.vertragsende = vertragsende;
        this.abgeschlossen = abgeschlossen;
        id++;
    }
    public String getName(){
        return name;
    }
    public int getKundennummer(){
        return kundennummer;
    }
    public int getBeitrag(){
        return beitrag;
    }
    public int setVertragsbeginn(){
        return vertragsbeginn;
    }
    public int setVertragsende(){
        return vertragsende;
    }
    public boolean setIsAbgeschlossen(){
        return abgeschlossen;
    }
    public String toString(){
        return "Name : "+name+" Kundennummer: "+kundennummer+"Vertrag beginnt am "+vertragsbeginn+
                " und endet am "+vertragsende+" Der Vertrag ist "+abgeschlossen;
    }
    public abstract int abrechnen();
}
