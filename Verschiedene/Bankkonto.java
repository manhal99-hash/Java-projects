public class Bankkonto {
    private int kontoStand;
    private String name;

    public Bankkonto(int kontoStand,String name){
        this.kontoStand = kontoStand;
        this.name = name;
    }

    public int getKontoStand(){
        return kontoStand;
    }
    public String getName(){
        return name;
    }

    public void einzahlen(double betrag){
        System.out.println("jezt wird "+betrag+" € überwiesen");
    }
    public void abheben(double betrag)throws NichtGenugGuthabenException{
        System.out.println("jtzt wird "+betrag+" € vom Konto abgehoben");
    }
    public void ueberweisen(Bankkonto zielkonto,double betrag) throws UngueltigeUeberweisungsException{
        System.out.println("Das Betrag von "+betrag+" € wird an "+zielkonto.name+" überwiesen");
    }

}
