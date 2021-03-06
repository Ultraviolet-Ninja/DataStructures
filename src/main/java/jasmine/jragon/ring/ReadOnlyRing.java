package jasmine.jragon.ring;

import java.nio.BufferOverflowException;
import java.util.ArrayList;

public class ReadOnlyRing<E> {
    private static class Node<E>{
        private final E data;
        private Node<E> prev, next;

        private Node(E data){
            this.data = data;
            prev = next = null;
        }
    }

    private final int capacity;
    private int size;
    private Node<E> head;

    public ReadOnlyRing(int capacity){
        this.capacity = capacity;
        size = 0;
        head = null;
    }

    public boolean add(E element) throws BufferOverflowException{
        if (size <= capacity) {
            if (size == 0)
                head = new Node<>(element);
            else if (size == capacity - 1)
                addLast(element);
            else if (size != capacity)
                addNext(element);
            else throw new BufferOverflowException();
            size++;
        }
        return size != capacity;
    }

    private void addNext(E element){
        Node<E> temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = new Node<>(element);
        temp.next.prev = temp;
    }

    private void addLast(E element){
        Node<E> temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = new Node<>(element);
        temp.next.prev = temp;
        temp.next.next = head;
        head.prev = temp.next;
    }

    public int findIndex(E element){
        Node<E> temp = head;
        for (int i = 0; i < capacity; i++){
            if (element.equals(temp.data))
                return i;
            temp = temp.next;
        }
        return -1;
    }

    public E getHeadData(){
        return head.data;
    }

    public void rotateHeadClockwise(){
        head = head.next;
    }

    public void rotateHeadCounter(){
        head = head.prev;
    }

    public ArrayList<E> toArrayList(){
        ArrayList<E> outputList = new ArrayList<>();
        Node<E> temp = head;
        while (temp.next != head) {
            outputList.add(temp.data);
            temp = temp.next;
        }
        return outputList;
    }
}
