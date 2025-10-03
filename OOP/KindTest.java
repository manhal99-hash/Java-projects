package Uebung2;

public class KindTest {

    public static void main(String[]args){

        Person Abe = new Person("Abe",1950);
        Person Mona = new Person("Mona",1955);
        Paar<Person,Person> elternHerb = new Paar<>(Abe,Abe);
        Paar<Person,Person> elternHomer = new Paar<>(Abe,Mona);
        Kind Herb = new Kind("Herb",2000,elternHerb);
        Kind Homer = new Kind("Homer",2002,elternHomer);

        Person Clancy = new Person("Clancy",1960);
        Person Jackie = new Person("Jackie",1966);
        Paar<Person,Person>elternMarge = new Paar<>(Clancy,Jackie);
        Kind Marge = new Kind("Marge",2000,elternMarge);
        Kind Selma = new Kind("Selma",2002,elternMarge);
        Kind Patty = new Kind("Patty",2004,elternMarge);

        Paar<Person,Person> elternBart = new Paar<>(Homer,Marge);
        Kind Bart = new Kind("Bart",2020,elternBart);
        Kind Lisa = new Kind("Lisa",2022,elternBart);
        Kind Maggie = new Kind("Maggie",2024,elternBart);

        //System.out.println(Kind.geschwister(Bart,Lisa));
        //Kind.geschwister(Herb,Abe);
        System.out.println(family(Bart));
    }

    public static Paar<Person,Person>family(Kind k){
        return k.getEltern();
    }
}
