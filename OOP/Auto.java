public class Auto extends Fahrzeug{
    private int anzahTueren;
    public Auto(String marke,String modell,int baujahr,int anzahTueren) {
        super(marke,modell,baujahr);
        this.anzahTueren = anzahTueren;
    }
    public int getAnzahTueren(){
        return anzahTueren;
    }
    public String toString(){
        return super.toString()+", Anzahl der Türen : "+anzahTueren;
    }
    public String fahren(){
        return "Auto fährt";
    }
    public String bremsen(){
        return "Auto bremst jetzt";
    }
    public String blinken(){
        return "Blink Blink";
    }
    //schnittstelle implementieren
    public void reparieren()throws ReparaturAusnahme{
        System.out.println("Jtzt wird das Auto repariert");
    }
}
