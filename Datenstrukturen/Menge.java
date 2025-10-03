package Uebung9;

import java.util.Iterator;

public interface Menge<T>extends Iterator<T>,Comparable<T>  {
    int size(); //liefert die Anzahl der ELemente
    boolean isEmpty(); //ob die Menge leerist oder nicht
    T get(); //liefert iregein Element der menge (falls nicht leer ist)
    void insert(T e); //fügt das element e der Menge hinzu, falls e bereit dann nichts tun
    void delete(T e); //entfernt das Element e aus der Menge.
    boolean contains(T e);
}
