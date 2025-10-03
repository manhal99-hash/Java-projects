public class Intel_i5 extends Prozessor{
    private int threadsi5;
    private int id;
    public Intel_i5(int kern,int geschwindigkeit,String baujahr,int threadsi5){
        super(kern,geschwindigkeit,baujahr);
        this.threadsi5 = threadsi5;
        id++;
    }
    public int getThreadsi5(){
        return threadsi5;
    }
    public int getId(){
        return this.id;
    }
    public String toString(){
        return super.toString()+"\n"+threadsi5;
    }
    public String reboust()throws TemperaturException{
        return "Der Prozessor intel_i5 wird jetzt reobustet...";
    }
    public String sleeping()throws SleepingException{
        return "Der Prozessor intel_i5 wird jtzt sleeping";
    }
}
