public abstract class Fussballspieler2 implements Finanzen,TorSchiessen {
    private String name;
    private int gehalt = 0;
    public Fussballspieler2(String name){
        this.name = name;
        this.gehalt = gehalt;
    }
    public String getName(){
        return name;
    }
    public int getGehalt(){
        return gehalt;
    }
    public String toString(){
        return this.name;
    }

}
