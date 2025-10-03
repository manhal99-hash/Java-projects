public abstract class Prozessor implements Rebouster{
    private int kern;
    private int geschwindigkeit;
    private String baujahr;
    private int id;
    public Prozessor(int kern, int geschwindigkeit, String baujahr){
        this.kern = kern;
        this.geschwindigkeit = geschwindigkeit;
        this.baujahr = baujahr;
        id++;
    }
    public int getKern(){
        return kern;
    }
    public int getGeschwindigkeit(){
        return geschwindigkeit;
    }
    public String getBaujahr(){
        return baujahr;
    }
    public int getId(){
        return this.id;
    }
    public String toString(){
        return ""+kern+"\n"+geschwindigkeit+"\n"+baujahr;
    }
}
