package Uebung4;

import java.util.NoSuchElementException;

public class EVLL<T> {
    private ListeElem first;
    private ListeElem last;
    private int size;

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public T getFirst(){
        if(first == null)throw new NoSuchElementException();
        return first.value;
    }
    public T getLast(){
        if(isEmpty()) throw new NoSuchElementException();
        return last.value;
    }
    public void remove(){
        if(isEmpty())return;
        first = first.next;
        size--;
    }
    public void append(T v){
        ListeElem neu = new ListeElem(v);
        neu.next = last;
        last = neu;
        size++;
    }
    public void delete(T v){
       if(isEmpty())return;

       ListeElem e = first;
       ListeElem tmp = first;

       while(e != null && !e.value.equals(v)){
           tmp = e;
           e = e.next;
       }

       if(e == first){
           remove();
       }
       if(e == null)return;
    }
    private class ListeElem{
        T value;
        ListeElem next;
        public ListeElem(T value){
            this.value = value;
            this.next = null;
        }
        public ListeElem(T value, ListeElem next){
            this.value = value;
            this.next = null;
        }
    }
}
