public class Person {
    private String nachName;
    public Person(String nachName){
        this.nachName = nachName;
    }
    public String getNachName(){
        return nachName;
    }
    public String toString(){
        return this.nachName;
    }
}
