package Uebung7;

import java.util.List;

public class SchlangeAlsEVL<T> implements Schlange<T>{
    private ListenElement first;
    private int size;

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    @Override
    public T front(){
        return first.value;
    }
    @Override
    public void enqueue(T element){
        ListenElement neu = new ListenElement(element);
        neu.next = first;
        size++;
    }
    @Override
    public void dequeue(){
        if (isEmpty())return;
        first = first.next;
        size--;
    }

    private class ListenElement{
        T value;
        ListenElement next;

        public ListenElement(T value){
            this.value = value;
            this.next = null;
        }
        public ListenElement(T value, ListenElement next){
            this.value = value;
            this.next = next;
        }
    }
}
