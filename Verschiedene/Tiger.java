public class Tiger extends Tier{
    private String tigerFutter;
    private static int id = 0;
    public Tiger(String name, int alter, String tigerFutter){
        super(name,alter);
        this.tigerFutter = tigerFutter;
        id++;
    }
    public void lautGeben(){
        System.out.println("Laut bei 10");
    }
    public String getTigerFutter(){
        return tigerFutter;
    }
    public int getId(){
        return id;
    }
    public String futterGeben(String futter)throws FutterException{
        return "jtzt wird Futter gegeben";
    }
}
