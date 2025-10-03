package Uebung2;

public interface Menge<T> {
    int size(); //liefert die Anzahl der ELemente
    boolean isEmpty(); //ob die Menge leerist oder nicht
    T get(); //liefert iregein Element der menge (falls nicht leer ist)
    void insert(T e); //fügt das element e der Menge hinzu, falls e bereit dann nichts tun
    void delete(T e); //entfernt das Element e aus der Menge.
    boolean contains(T e);//prpft ob e inder Menge enthalten ist
}
