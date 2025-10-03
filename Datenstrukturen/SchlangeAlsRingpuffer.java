package Uebung7;

public class SchlangeAlsRingpuffer<T>implements Schlange<T> {
    RingPuffer_ohne<T> ring;

    @Override
    public T front(){
        return ring.get();
    }
    @Override
    public void enqueue(T element){
        ring.add(element);
    }
    @Override
    public void dequeue(){
        ring.remove();
    }
    public int size(){
        return ring.size();
    }
    public boolean isEmpty(){
        return ring.isEmpty();
    }
}
