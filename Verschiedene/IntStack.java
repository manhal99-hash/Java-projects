public class IntStack {
    static int belegt;

    int maximalGroesse;
    int sp;
    int[]a;

    IntStack(int n){
        maximalGroesse = n;
        sp = -1;
        a = new int[n];
        belegt += n * 4;
    }
    public boolean isemptystack(){
        return (sp == -1);
    }
    public void push(int x)throws ArrayIndexOutOfBoundsException{
        a[++sp] = x;
    }
    public int pop()throws ArrayIndexOutOfBoundsException{
        return a[sp--];
    }
    public static int gibSpeicherverbrauch(){
        return belegt;
    }
}
