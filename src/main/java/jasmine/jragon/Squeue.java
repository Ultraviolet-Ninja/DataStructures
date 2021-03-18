package jasmine.jragon;

import java.util.LinkedList;

public class Squeue <E>{
    private final LinkedList<E> interiorList;

    public Squeue(){
        interiorList = new LinkedList<>();
    }

    public E pop(){
        return interiorList.pop();
    }

    public void push(E element){
        interiorList.push(element);
    }
}
