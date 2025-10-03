package Uebung5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PostboteIterator<T> implements Iterable<T> {

    //Instanz Variablen
    private int size;
    private T[] array;

    //Konstruktor
    public PostboteIterator(T[]array){
        this.size = array.length;
        this.array = array;
    }
    //Instanz Methoden
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return(size == 0);
    }

    //Iterator-Methode für's Ausgeben der Inhalte
    @Override
    public Iterator<T>iterator(){
        return new myIterator();
    }

    //interne Klasse für Iterator
    class myIterator implements Iterator<T> {
        int index = 0;
        int phase = 1;

        public myIterator(){
            index = 0;
        }

        @Override
        public boolean hasNext() {
            if(phase == 1){
                return index < size || (phase == 1 && nextOddIndexExists());
            }else{
                return index >= 1;
            }
        }
        private boolean nextOddIndexExists(){
            //prüft ob noch ungerade indizes >= 1 existieren
            int startOdd = size % 2 == 0 ? size -1 : size - 2;
            return startOdd >= 1;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            if(phase == 1){
                if(index >= size){
                    phase = 2;
                    index = (size % 2 == 0) ? size -1 : size -2;
                }
            }

            if(phase == 1){
                T result = array[index];
                index += 2;
                return result;
            } else{
                T result = array[index];
                index -= 2;
                return result;
            }
        }
    }

}
