package Generics;

import java.util.ArrayList;

public class GenericStack<E> extends ArrayList<E> {
    public int getSize(){
        return size();
    }
    public E peek(){
        return get(getSize() - 1);
    }
    public void push(E obj){
        add(obj);
    }
    public E pop(){
        E obj = get(getSize() - 1);
        remove(getSize() - 1);
        return obj;
    }
    public boolean isEmpty(){
        return getSize() == 0;
    }
    public int search(E obj){
        return indexOf(obj);
    }
    @Override
    public String toString(){
        return "Стек: " + super.toString();
    }
}
