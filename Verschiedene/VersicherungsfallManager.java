public class VersicherungsfallManager {
    public void verwalten(Versicherung v)throws VersicherungsfallException{
        System.out.println("Folgende Versicherungen werden jtzt verwaltet...");
    }
    public void neuVersicherungsfall(){
        System.out.println("eine neue Versicherung wird erstellt...");
    }
    public void berarbeiten()throws VersicherungsfallBerabeitungsException{
        System.out.println("die Versicherungsfall wird jetzt berarbeitet");
    }
}
