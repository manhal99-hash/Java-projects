package Uebung6;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class DVL<T>implements Iterable<T> {
    private int size;
    private ListenElement first;
    private ListenElement last;

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public T getFirst(){
        if(isEmpty() || first.value == null)throw new NoSuchElementException();
        return first.value;
    }
    public T getLast(){
        if(isEmpty())throw new NoSuchElementException();
        return last.value;
    }
    public boolean contains(T v){
        ListenElement current = first;

        while(current != null){
            if(current.value.equals(v)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator(){
        return new ListenElement();
    }

    class ListenElement implements Iterator<T>{
        private int index;
        T value;
        ListenElement next;
        ListenElement prev;

        public ListenElement(){
            this.value = value;
        }
        public ListenElement(ListenElement next,T value){
            this.next = next;
            this.value = value;
        }
        public ListenElement(ListenElement next, ListenElement prev){
            this.next = next;
            this.prev = prev;
        }
        @Override
        public boolean hasNext(){
            return index < size;
        }
        @Override
        public T  next(){
            return null;
        }
    }
}
