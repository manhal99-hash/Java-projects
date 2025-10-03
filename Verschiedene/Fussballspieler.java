public class Fussballspieler extends Person {
    private int gehalt;
    public Fussballspieler(String name,int gehalt){
        super(name);
        this.gehalt = gehalt;
    }
    public int getGehalt(){
        return gehalt;
    }
    public String toString(){
        return super.toString()+" "+this.gehalt;
    }
}
