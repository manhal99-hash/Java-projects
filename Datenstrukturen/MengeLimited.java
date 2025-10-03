package Uebung9;

import java.util.Iterator;

public class MengeLimited<T>implements Menge<T>, Iterable<T> {
    private int size;
    private T[]array;
    private final int capacity = 100;
    private Menge<T> menge;

    public MengeLimited(int size){
        this.size = 0;
        this.array = (T[])new Object[capacity];
        this.menge = new MengeLimited<>();
    }
    public MengeLimited(){

    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public T get(){
        if(isEmpty())return null;
        return array[0];
    }
    public void insert(T e){
        if(!contains(e)){
            array[size++] = e;
        }
    }

    public void delete(T e){
        if(!contains(e))return; //wenn nicht enthalten ist, dann keine wirkung

        for(int i = 0; i < size; ++i){
            if(array[i].equals(e))
                for(int j = i; j < size - 1; ++j){
                    array[j] = array[j + 1];
                }
            array[size - 1] = null;
            size--;
            break;
        }
    }

    public boolean contains(T e){
        for(int i = 0; i < size; ++i){
            if(array[i].equals(e)){
                return true;
            }
        }
        return false;
    }
    @Override
    public Iterator<T>iterator(){
        return new myIterator();
    }
    class myIterator implements Iterator<T>{
        private int index = 0;

        @Override
        public boolean hasNext(){
            return index < size;
        }
        @Override
        public T next(){
            return array[index++];
        }
    }
}
