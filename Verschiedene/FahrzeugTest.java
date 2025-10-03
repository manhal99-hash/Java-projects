public class FahrzeugTest {
    public static void main(String[]args){
        Auto a = new Auto("BMW","M540d",2020,5);
        System.out.println(a);
        System.out.println(a.fahren());
        System.out.println(a.bremsen());
        System.out.println(a.blinken());

        try {
            a.reparieren();
        } catch (ReparaturAusnahme e){
            System.out.println("ReparaturException"+e.getMessage());
        }

        Motorad m = new Motorad("Yamaha","120d",2019,120);
        System.out.println(m);
        System.out.println(m.fahren());
        System.out.println(m.bremsen());
        System.out.println(m.blinken());

        try {
            m.fahrtDurchPfuetze("Pfutze");
        } catch (WasserschadenException e){
            System.out.println("WasserschadenException"+e.getMessage());
        }

    }
}
