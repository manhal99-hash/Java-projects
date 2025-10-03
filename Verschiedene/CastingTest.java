public class CastingTest {
    public static void main(String[]args){
        Katze k = new Katze("k",1,"katzefutter");
        Tiger t = new Tiger("t",1,"tigerfutter");

        Tier t0 = new Katze("t",1,"katzefutter"); //UPCASTING von Katze zu Tier
        Tier t1 = new Tiger("t1",1,"tigerfutter"); // UPCASTING von Tiger zu Tier

        //DWONCASTING (von Tier zu Katze)
        if(t0 instanceof Katze){
            Katze tier1 = (Katze)t0;
            tier1.lautGeben();
        }
        //DOWNCASTING (von Tier zu Tiger)
        if(t1 instanceof Tiger){
            Tiger tier2 = (Tiger)t1;
            tier2.lautGeben();
        }
        String katzefutter = "katze";
        try {
            k.futterGeben(katzefutter);
        } catch (FutterException e){
            System.out.println("FutterException"+e.getMessage());
        }
        try {
            t.futterGeben(katzefutter);
        } catch(FutterException e){
            System.out.println("FutterException"+e.getMessage());
        }
        Maschine m = new Maschine();
        Kuhlschrank kl = new Kuhlschrank();
        SiegeMaschine sm = new SiegeMaschine();

        Maschine k2 = new Kuhlschrank(); // upcasting
        Maschine k3 = new SiegeMaschine(); // upcasting

        //downcasting
        if(k2 instanceof Kuhlschrank){
            Kuhlschrank m2 = (Kuhlschrank)k2;
            System.out.println(m2.kuehlen());
            System.out.println(m2.laufen());
        }
        if(k3 instanceof SiegeMaschine){
            SiegeMaschine m3 = (SiegeMaschine)k3;
            System.out.println(m3.laufen());
            System.out.println(m3.siegen());
        }
    }
}
