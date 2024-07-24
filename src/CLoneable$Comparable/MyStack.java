package CLoneable$Comparable;

import java.util.ArrayList;

public class MyStack implements Cloneable{
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    /* Переопределяет метод toString класса Object */
    public String toString() {
        return "стек: " + list.toString();
    }
    public Object clone() {
        try {
            MyStack cloneStack = (MyStack) super.clone();
            cloneStack.list = (ArrayList<Object>) this.list.clone();
            return cloneStack;
        }
        catch (CloneNotSupportedException ex) {
            System.out.println("Ошибка CloneNotSupported...");
            return null;
        }
    }
}