public class Unterklasse extends Oberklasse{
    private int c;
    private int d;
    public Unterklasse(int a,int b, int c,int d){
        super(a,b);
    }
    public String toString(){
        return super.toString()+" c und d :"+c+","+d;
    }
}
