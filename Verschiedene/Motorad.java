public class Motorad extends Fahrzeug{
    private int hubraum;
    public Motorad(String marke,String modell,int baujahr,int hubraum ){
        super(marke,modell,baujahr);
        this.hubraum = hubraum;
    }
    public int getHubraum(){
        return hubraum;
    }
    public String toString(){
        return super.toString()+" Hubraum : "+hubraum;
    }
    public String fahren(){
     return "Motorad fährt...";
    }
    public String bremsen(){
        return "Motorad bremst...";
    }
    public String blinken(){
        return "Blink Blink";
    }
    public void reparieren(){
        System.out.println("jtzt wird das Motorad repariert");
    }
    public void fahrtDurchPfuetze(String pfuetze)throws WasserschadenException{
        System.out.println("Fahren druch Pfeutze");
    }
}
