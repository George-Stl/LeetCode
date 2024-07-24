package Generics;

public class TestGenericStack {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<String>();
        stack.push("Вера");
        stack.push("Надежда");
        stack.push("Любовь");
        System.out.println(stack.getSize());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}