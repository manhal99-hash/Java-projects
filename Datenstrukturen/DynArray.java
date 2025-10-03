package Uebung3;

public class DynArray<T> {

    //klassiche variablen
    private static int capacity = 2;

    //instanz variablen
    private int size;
    private T[] array;

    @SuppressWarnings("Unchecked")
    public DynArray(){
        this.size = 0;
        this.array = (T[]) new Object[capacity];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public void set(int pos, T value)throws IndexOutOfBoundsException{
        if(pos < 0 || pos >= size)throw new IndexOutOfBoundsException("Ungültiges Wert");
        array[pos] = value;
    }

    public T get(int pos)throws IndexOutOfBoundsException{
        if(pos < 0 || pos >= size)throw new IndexOutOfBoundsException("Ungültiges Wert");
        return array[pos];
    }

    public void add(T value){
        if(size >= array.length) {
            increase();
        }
        array[size] = value;
        size++;
    }

    @SuppressWarnings("Unchecked")
    private void increase(){
        T[] neu = (T[]) new Object[array.length*2];
        for(int i = 0; i < size; ++i){
            neu[i] = array[i];
        }
        array = neu;
    }

    public String toString(){
        String s = "";
        for(int i = 0; i < size; ++i){
            s = s + array[i] + "\n";
        }
        return s;
    }
    public void remove(int pos){
        if(pos < 0 || pos > size)return;

        for(int i = pos; i < size-1; ++i){
            array[i] = array[i+1];
        }

        array[size -1] = null;
        size--;
    }
    public void remove(){
        if(isEmpty())return;
        remove(0);
    }
    public void delete(T e){
       if(!contains(e) || isEmpty())return;

       for(int i = 0; i < size; ++i){
           if(array[i].equals(e)){
               for(int j = i; j < size-1; ++j){
                   array[j] = array[j+1];
               }
           }
           array[size-1] = null;
           size--;
           break;
       }
    }
    public boolean contains(T element){
        for(T item : array){
            if(item != null && item.equals(element)){
                return true;
            }
        }
        return false;
    }

    //falsche implementierung "von mir"
    @SuppressWarnings("Unchecked")
    private void decrease(){
        T[] neu = (T[]) new Object[array.length/2];
        int viertel = array.length/4;

        for(int i = 0; i < size; ++i){
            if(size == viertel){
                neu[i] = array[i];
                array = neu;
            }
        }
    }
    //implementierung von blackbox
    @SuppressWarnings("Unchecked")
    private void decrease2(){
        if(size <= array.length / 4 && array.length > 2){
            int neulength = Math.max(array.length /2, 2);
            T[]neu = (T[])new Object[neulength];

            for(int i = 0; i < size; ++i){
                neu[i] = array[i];
            }
            array = neu;
        }
    }

}
