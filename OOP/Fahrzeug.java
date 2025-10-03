public abstract class Fahrzeug implements Reparierbar{
    private String marke;
    private String modell;
    private int baujahr;

    public Fahrzeug(String marke,String modell,int baujahr){
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }
    public String getMarke(){
        return marke;
    }
    public String getModell(){
        return modell;
    }
    public int getBaujahr(){
        return baujahr;
    }
    public String toString(){
        return "Marke : "+marke+", Modell: "+modell+", Baujahr: "+baujahr;
    }
    public abstract String fahren();
    public abstract String bremsen();
    public abstract String blinken();
}
