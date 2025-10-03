package Uebung4;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class EVL<T>implements Iterable<T> {
    private ListenElem first;
    private int size;

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public T get(){
        if(isEmpty())throw new NoSuchElementException();
        return first.value;
    }
    public void insert(T value){
        ListenElem neu = new ListenElem(value);
        neu.next = first;
        first = neu;
        size++;
    }
    public void remove(){
        if(isEmpty())return;
        first = first.next;
        size--;
    }
    //delete Methode : entfernt das erste vorkommen eines Elements mit Eintrag v
    public void delete(T v){
        if(isEmpty())return;

        ListenElem e = first;
        ListenElem tmp = first;

        //suche Element e mit Eintrag v
        while(e != null && !e.value.equals(v)){
            tmp = e;
            e = e.next;
        }

        //e = erstes Elem
        if(e==first){
            remove();
            return;
        }

        //v nicht gefunden
        if(e == null){
            return;
        }
    }
    public String toString(){
        String s = "";
        ListenElem tmp = first;
        while(tmp != null){
            s += tmp.value + "_";
            tmp = tmp.next;
        }
        return s;
    }
    //toString durch Rekursion und einfacher
    public String toString2(){
        return rekToString(first);
    }
    private String rekToString(ListenElem e){
        if(e == null) return "";
        else
            return rekToString(e.next) + "_" + e.value;
    }
    public boolean contains(T v){
        ListenElem current = first;

        while(current != null){
            if(current.value.equals(v)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    private class ListenElem{
        T value;
        ListenElem next;
        public ListenElem(T value){
            this.value = value;
            this.next = null;
        }
        public ListenElem(T value, ListenElem next){
            this.value = value;
            this.next = null;
        }
    }
    @Override
    public Iterator<T> iterator(){
        return new myIterator();
    }
    private class myIterator implements Iterator<T>{
        int index;
        @Override
        public boolean hasNext(){
            return (index < size);
        }
        @Override
        public T next(){
            ListenElem crs = first;
            T value = first.value;
            return crs.value;

        }
    }
}
