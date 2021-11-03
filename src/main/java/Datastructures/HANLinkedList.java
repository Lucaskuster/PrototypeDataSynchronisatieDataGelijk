package Datastructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class HANLinkedList<T> implements IHANLinkedList<T> {

    LinkedList<T> list;

    public HANLinkedList() {
        this.list = new LinkedList<T>();
    }

    @Override
    public void addFirst(T value) {
        list.addFirst(value);
    }

    @Override
    public void add(T value) {
        list.addLast(value);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public void insert(int index, T value) {
        list.add(index, value);
    }

    @Override
    public void delete(int pos) {
        list.remove(pos);
    }

    @Override
    public T get(int pos) {
        return list.get(pos);
    }

    @Override
    public void removeFirst() {
        list.removeFirst();
    }

    @Override
    public void removeLast() {
        list.removeLast();
    }

    @Override
    public T getFirst() {
        return list.getFirst();
    }

    @Override
    public T getLast(){
        return list.getLast();
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public ListIterator<T> listIterator(int size){
        return list.listIterator(size);
    }
}
