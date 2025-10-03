package Uebung6;

import Uebung3.DynArray;

import java.util.Iterator;

public class FolgeAlsDynArray<T> implements Folge<T>{
    private int size;
    private T [] array;
    private DynArray<T> dynArray;

    public FolgeAlsDynArray(int capacity){
        this.size = size;
        this.array = (T[]) new Object[capacity];
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public boolean isEmpty(){
        return(size==0);
    }
    @Override
    public boolean contains(T e){
        return dynArray.contains(e);
    }
    @Override
    public T get(int pos){
        return dynArray.get(pos);
    }
    public void set(int pos, T e){
        dynArray.set(pos,e);
    }
    public void insert(int pos, T e){
        if(pos < 0 || pos > size){
            throw new IndexOutOfBoundsException();
        }

        //wenn das Array voll ist, vergrößern
        if(size == array.length){
            resize();
        }

        //Elemente ab der Position i nach hinten verschieben
        for(int j = size; j > pos; j--){
            array[j] = array[j - 1];
        }
        array[pos] = e;
        size++;
    }
    private void resize(){
        int neuSize = array.length * 2;

        T[] newArray = (T[]) new Object[neuSize];

        for(int i = 0; i < size; ++i){
            newArray[i] = array[i];
        }

        array = newArray;
    }
    @Override
    public void remove(int pos){
        dynArray.remove(pos);
    }
    public void delete(T e){
        dynArray.delete(e);
    }

    public Iterator<T> iterator(){
        return new myIterator();
    }
    private class myIterator implements Iterator<T>{
        private int index;

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
