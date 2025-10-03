package Uebung7;

import Uebung3.DynArray;

public class SchlangeAlsArray<T>implements Schlange<T> {

    private T[] array;
    private int front; //index des ersten element
    private int rear; //indes des letzten element
    private int size;
    private final int capacity;

    public SchlangeAlsArray(int capacity){
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    //abchecken ob es voll ist
    public boolean isFull(){
        return (size == capacity);
    }
    public T front(){
        return array[front];
    }
    public void enqueue(T element){
        if(isFull()){
            System.out.println("Der Speicher der Schlange ist voll!");
        }
        rear = (rear + 1) % capacity;
        array[rear] = element;
        size++;

    }
    //Element entfernen
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Schlange ist leer");
        }
        T element = array[front];
        front = (front + 1) % capacity; //Rundungsoperator
        size--;
    }

}
