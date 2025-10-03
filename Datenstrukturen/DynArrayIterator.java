package Uebung5;

import java.util.Iterator;

public class DynArrayIterator<T>implements Iterable<T> {
    private int size;
    private T[] array;

    public DynArrayIterator(T[]array){
        this.size = array.length;
        this.array = array;
    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return(size == 0);
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
