package Uebung1;

public class Fussballer extends Sportler{
    private String verein;
    private boolean linksfuss;
    private String name;
    private int gebJahr;
    private int groesse;
    private double gewicht;
    public Fussballer(String name,int gebJahr,int groesse,double gewicht,String verein,boolean linksfuss){
        super(name,gebJahr,groesse,gewicht);
        this.verein = verein;
        this.linksfuss = linksfuss;
    }
    public String getVerein(){
        return verein;
    }
    public boolean getLinksfuss(){
        return linksfuss;
    }
    public String info(){
        return verein;
    }
}
