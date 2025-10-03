public abstract class Tier implements FutterGeben {
    private String name;
    private int alter;
    public Tier(String name,int alter){
        this.name = name;
        this.alter = alter;
    }
    public abstract void lautGeben();

    public String toString(){
        return name+","+alter;
    }
}
