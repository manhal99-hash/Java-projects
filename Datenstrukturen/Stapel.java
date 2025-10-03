package Uebung7;

public interface Stapel<T>extends Comparable<T> {
    public T top();
    public void push(T element);
    public void pop();
    public int size();
    public boolean isEmpty();
}
