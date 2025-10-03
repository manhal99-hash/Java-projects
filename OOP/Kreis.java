package Uebung1;

public class Kreis extends GeoObjekt2D{
    private Punk2D mittelPunkt;
    private double radius;
    public Kreis(Punk2D mittelPunkt, double radius){
        this.mittelPunkt = mittelPunkt;
        this.radius = radius;
    }

    public double umfange(){
        return 0.0;
    }
    public  double flaeche(){
        return 0.0;
    }
}
