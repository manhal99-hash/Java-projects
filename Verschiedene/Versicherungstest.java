public class Versicherungstest {
    public static void main(String[]args){
        Autoversicherung a = new Autoversicherung("Manhal",1999,120,"12","Mercedes",0);
        VersicherungsfallManager m = new VersicherungsfallManager();
        try {
            m.verwalten(a);
        } catch (VersicherungsfallException e){
            System.out.println("VersicherungsfallException wird geworfen"+e.getMessage());
        }
        try {
            m.berarbeiten();
        } catch (VersicherungsfallBerabeitungsException e){
            System.out.println("BerabeitungsException wird geworfen"+e.getMessage());
        }
    }
}
