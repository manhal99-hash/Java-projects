package Uebung1;

public class Boxer extends Sportler{
    private String name;
    private int gebJahr;
    private int groesse;
    private double gewicht;
    public Boxer(String name, int gebJahr, int groesse, double gewicht){
        super(name,gebJahr,groesse,gewicht);
    }
    public String gewichtKlasse(double gewicht){
        String ergebnis = "";
        if(gewicht <= 70) ergebnis = "Mittel";
        if(gewicht >= 70 && gewicht <= 90) ergebnis = "Schwer";

        return ergebnis;
    }
    public void setGewicht(double neuGewicht){
        gewicht = neuGewicht;
    }
    public String info(){
        return gewichtKlasse(gewicht);
    }
}
