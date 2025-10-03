package Uebung5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SnakeIterator2DArray<T>implements Iterator<T> {
    private int size;
    private T[][] array;

    private int row = 0;
    private int col = 0;
    private int count = 0;
    private int totalElements;

    public SnakeIterator2DArray(T[][]array){
        this.size = array.length;
        this.array = array;
        for(int i = 0; i < array.length; ++i){
            totalElements += array[i].length;
            count++;
        }
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    @Override
    public boolean hasNext(){
        return count < totalElements;
    }
    @Override
    public T next(){
       if(!hasNext()){
           throw new NoSuchElementException();
       }

       T value = array[row][col];
       count++;

       if(row % 2 == 0){
           col++;
           if(col >= array[row].length){
               row++;
               col = (row < array.length) ? array[row].length -1 : 0;
           }
       } else{
           col--;
           if(col < 0){
               row++;
               col = 0;
           }
       }
       return value;
    }

}
