package Uebung7;

public class RingPuffer_ohne<T>{
    private int size;
    private int head;
    private int tail;
    private final int capacity;
    private T [] array;

    @SuppressWarnings("Unchecked")
    public RingPuffer_ohne(int capacity){
        this.array = (T[]) new Object[capacity];
        this.capacity = capacity;
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public int capacity(){
        return capacity;
    }
    //freiwillig zu implementieren
    private boolean isFull(){
        return (size == capacity);
    }
    public boolean contains(T e){
        if(isEmpty())return false;

        for(int i = 0; i < size; ++i){
            int index = (head + i) % array.length;
            T item = array[index];
            if(item != null && item.equals(e)){
                return true;
            }
        }
        return false;
    }
    public void add(T e){
        if(isFull())throw new IndexOutOfBoundsException("Der Ringpuffer ist voll");
        array[head] = e;
        head = (head + 1) % capacity; //head um einen schritt weiter bewegen und umwickeln
        size++;
    }
    public T get(){
        if(isEmpty())return null;

        int index = (tail -1 + capacity) % capacity;
        return array[index];
    }
    public void remove(){
        if(isEmpty())return;
        T element = array[head];
        array[head] = null;
        head = (head + 1) % capacity;
        size--;
    }
}
