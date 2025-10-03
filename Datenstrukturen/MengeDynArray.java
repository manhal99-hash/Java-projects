package Uebung3;

import Uebung2.Menge;

public class MengeDynArray<T>implements Menge<T> {
    private static int capacity = 2;

    private int size;
    private DynArray<T> array;

    @SuppressWarnings("Unchecked")
    public MengeDynArray(){
        this.size = 0;
        this.array = new DynArray<>();

    }
    @Override
    public int size(){
        return array.size();
    }
    @Override
    public boolean isEmpty(){
        return array.isEmpty();
    }
    @Override
    public T get(){
        return array.get(0);
    }
    @Override
    public void insert(T element){
        array.add(element);
    }
    @Override
    public boolean contains(T e){
        return array.contains(e);
    }
    @Override
    public void delete(T e){
        array.delete(e);
    }
}
