package Uebung7;

public interface Schlange<T> {
    T front();
    void enqueue(T element);
    void dequeue();
}
