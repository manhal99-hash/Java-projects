package Uebung2;

public class Kind extends Person{
    private Paar<Person,Person> eltern;
    private String name;
    private int gebJahr;

    public Kind(String name,int gebJahr,Paar<Person,Person> eltern){
        super(name,gebJahr);
        this.eltern = eltern;
    }
    public void setEltern(Paar<Person,Person>neuEltern){
        this.eltern = neuEltern;
    }
    public Paar<Person,Person> getEltern(){
        return eltern;
    }
    public static boolean geschwister(Kind a,Kind b){
        if(a == null || b == null){
            System.out.println("Objekt darf nicht leer sein");
            return false;
        }
        if(a.getEltern().equals(b.getEltern()) )return true;
        return false;
    }
    @Override
    public String toString(){
        return eltern.toString();
    }
}
