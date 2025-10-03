public class Feldspieler extends Fussballspieler2 {
    public Feldspieler(String name){
        super(name);
    }
    public String torSchiessen(){
        return "Tor Schiessen";
    }
    public void gehaltBeziehen(int gehalt){
        System.out.println("Gehalt beziehen");
    }
    public String toString(){
        return super.toString();
    }
}
