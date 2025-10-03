public class Main {
    public static void main(String[] args) {
        /*
              try {
            testen1();
        } catch (Fehler1 e){
            System.out.println("Fehler1"+e.getMessage());
        }
        try {
            testen2();
        } catch(Fehler2 e){
            System.out.println("Fehler2"+e.getMessage());
        }
        IntStack s1 = new IntStack(5);
        IntStack s2 = new IntStack(10);

        for(int i = 0; i <= 5; ++i){
           try {
               s1.push(i);
               s2.push(i);
           } catch(ArrayIndexOutOfBoundsException e){
               System.out.println("IndexOutOFBouns BROOO "+e.getMessage());
           }
        }
        System.out.println(s1.isemptystack());
        for(int i = 0; i <= 5; ++i){
           try {
               System.out.println(s1.pop());
               s1.pop();
               s2.pop();
           } catch(ArrayIndexOutOfBoundsException e){
               System.out.println("Das ist auch eine ArrayExcpetion Broo"+e.getMessage());
           }
        }
         */
        Bankkonto k = new Bankkonto(1500,"1234456789");
        try {
            k.abheben(2500);
        } catch (NichtGenugGuthabenException e){
            System.out.println("Nicht Genug Guthaben Exception"+e.getMessage());
        }
        try {
            k.ueberweisen(k,2000);
        } catch(UngueltigeUeberweisungsException e){
            System.out.println("UngültigeUberweiseung Exception"+e.getMessage());
        }
        /*
        Person p = new Person("Zuschauer-");
        for(int i = 1; i <= 40;++i){
            System.out.println(p.getNachName()+i);
        }
        System.out.println("\n");
        Fussballspieler f = new Fussballspieler("Spieler-rot",100);
        for(int i = 1; i <= 5; ++i){
            System.out.println(f.getNachName()+i);
        }
        System.out.println("\n");
        Fussballspieler f2 = new Fussballspieler("Spieler-blau",100);
        for(int i = 1; i <= 5; ++i){
            System.out.println(f2.getNachName()+i);
        }
         */
        Torwart horn = new Torwart("Timo Horn");
        horn.gehaltBeziehen(300000);
        System.out.println(horn);

    }
    public static void testen1()throws Fehler1{

    }
    public static void testen2()throws Fehler2{
    }
}