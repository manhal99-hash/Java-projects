public class Torwart extends Fussballspieler2{
    public Torwart(String name){
        super(name);

    }
    public String halten(){
        return "Ball Halten";
    }
    public String torSchiessen(){
        return "Tor Schiessen";
    }
    public void gehaltBeziehen(int gehalt){
        System.out.println("Gehalt beziehen"+gehalt);
    }
    public String toString(){
        return super.toString();
    }
}
