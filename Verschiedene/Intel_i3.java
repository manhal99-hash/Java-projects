public class Intel_i3 extends Prozessor{
    private int threadsi3;
    private int id;
    public Intel_i3(int kern,int gewschwindigkeit,String baujahr,int threadsi3){
        super(kern,gewschwindigkeit,baujahr);
        this.threadsi3 = threadsi3;
        id++;
    }
    public int getThreadsi3(){
        return threadsi3;
    }
    public int getId(){
        return this.id;
    }
    public String toString(){
        return super.toString()+"\n"+threadsi3;
    }
    public String reboust()throws TemperaturException{
        return "Der Prozessor intel_i3 wird jtzt reboustet...";
    }
    public String sleeping()throws SleepingException{
        return "Der Prozessor intel_i3 wird jtzt sleeping";
    }
}
