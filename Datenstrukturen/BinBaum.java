package Uebung10;

import Uebung7.Schlange;
import Uebung7.SchlangeAlsArray;

import java.util.Iterator;

public class BinBaum<T>implements Iterable<T> {
    protected Knoten root;

    public BinBaum(Knoten l, T v, Knoten r){
        root = new Knoten(v);
        root.links = l;
        root.rechts = r;
    }
    public BinBaum(T v){
        this(null,v,null);
    }
    public BinBaum(){
        root = null;
    }
    @Override
    public Iterator<T>iterator(){
        return new bfsIteratur();
    }
    private class bfsIteratur implements Iterator<T>{
        private SchlangeAlsArray<Knoten>schlange = new SchlangeAlsArray<>(100);
        private Knoten aktuelleKnoten;

        public bfsIteratur(){
            if(root != null){
                schlange.enqueue(root);
            }
        }
        @Override
       public boolean hasNext(){
            return !schlange.isEmpty();
        }
        @Override
       public T next(){
            if(!hasNext()){
                throw new IllegalStateException("Keine weitere Elemente in der Iteration.");
            }
            aktuelleKnoten = schlange.front();
            if(aktuelleKnoten.links != null){
                schlange.enqueue(aktuelleKnoten.links);
            }
            if(aktuelleKnoten.rechts != null){
                schlange.enqueue(aktuelleKnoten.links);
            }
            return aktuelleKnoten.value;
        }

    }

    protected class Knoten{
        protected T value;
        protected Knoten links;
        protected Knoten rechts;

        public Knoten(T value){
            this.value = value;
            links = null;
            rechts = null;
        }
    }
}
