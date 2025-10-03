public class Katze extends Tier {
    private String katzeFutter;
    private static int id = 0;
    public Katze(String name, int alter,String katzeFutter){
        super(name,alter);
        this.katzeFutter = katzeFutter;
        id++;
    }
   public void lautGeben(){
       System.out.println("Laut bei 5");
   }
   public String getKatzeFutter(){
        return katzeFutter;
   }
   public int getId(){
        return id;
   }
   public String futterGeben(String futter) throws FutterException{
        return "Futter wird jtzt gegeben";
   }
}
