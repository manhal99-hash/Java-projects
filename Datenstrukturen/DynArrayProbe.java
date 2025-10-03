package Uebung3;

public class DynArrayProbe<T>{
    private T[] array;
    private int size;

    @SuppressWarnings("Unchecked")
    public DynArrayProbe(int capacity){
        this.array = (T[]) new Object[capacity];
        this.size = size;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public void set(int pos,T value)throws IndexOutOfBoundsException{
        if(pos < 0 || pos > size){
            throw new IndexOutOfBoundsException("Ungültige Position...");
        }
        array[pos] = value;
    }
    public T get(int pos){
        if(pos < 0 || pos > size){
            throw new IndexOutOfBoundsException("Ungültige Position...");
        }
        return array[pos];
    }
    public void add(T value){
        if(size >= array.length)increase();

        array[size++] = value;
    }
    @SuppressWarnings("Unchecked")
    private void increase(){
        T[] neu = (T[]) new Object[array.length*2];

        for(int i = 0; i < size; ++i){
            neu[i] = array[i];
            array = neu;
        }
    }
}
