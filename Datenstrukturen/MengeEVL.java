package Uebung4;

import Uebung2.Menge;

public class MengeEVL<T> implements Menge<T> {
    private ListeElement first;
    private int size;
    EVL<T> evl;

    @Override
    public int size(){
        return size;
    }
    @Override
    public boolean isEmpty(){
        return(size == 0);
    }
    @Override
    public T get(){
        return evl.get();
    }
    @Override
    public void insert(T value){
        evl.insert(value);
    }
    @Override
    public void delete(T value){
        evl.delete(value);
    }
    public boolean contains(T e){
        ListeElement current = first;

        while(current != null){
            if(current.value.equals(e)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    private class ListeElement{
        ListeElement next;
        T value;
        public ListeElement(T value){
            this.value = value;
            this.next = null;
        }
        public ListeElement(T value, ListeElement next){
            this.value = value;
            this.next = next;
        }
    }
}
