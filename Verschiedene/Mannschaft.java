public class Mannschaft extends Fussballspieler{
    private Fussballspieler []f;
    public Mannschaft(Fussballspieler f1,Fussballspieler f2, Fussballspieler f3, Fussballspieler f4, Fussballspieler f5){
        super("",5);
        this.f = new Fussballspieler[]{f1,f2,f3,f4,f5};
    }
    public int einkommen(){
        return super.getGehalt()*5;
    }
    public String toString(){
        return super.toString()+"\n";
    }
}
