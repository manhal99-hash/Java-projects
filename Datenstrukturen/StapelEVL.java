package Uebung7;

import Uebung4.EVL;

import java.util.Iterator;

public class StapelEVL<T>implements Stapel<T>,Comparable<T>,Iterable<T> {
    EVL<T> evl = new EVL<>();
    private int size;

    public boolean isEmpty(){
        return evl.isEmpty();
    }
    public int size(){
        return evl.size();
    }

    @Override
    public T top(){
        return evl.get();
    }
    @Override
    public void push(T element){
        evl.insert(element);
    }
    @Override
    public void pop(){
        evl.remove();
    }
@Override
    public int compareTo(T object){
        return this.compareTo(object);
    }
    @Override
    public Iterator<T> iterator(){
        return evl.iterator();
    }
}
