package Uebung1;

import Uebung3.Modul;

public class Stud extends Person{
    private String name;
    private int gebJahr;
    private int matNr;

    public Stud(int matNr,String name){
        super(name,matNr);
        this.matNr = matNr;
    }
    public int getMatNr(){
        return matNr;
    }
    @Override
    public String toString(){
        return "Name: " + name + ", Matrikelnummer: " + matNr;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        Stud s = (Stud) obj;

        if(this.matNr == s.matNr){
            return true;
        }
        return false;
    }
    public void anmelden(Modul m){

    }
    public void abmelden(Modul m){

    }
}
