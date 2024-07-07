import java.math.BigDecimal;
import java.math.BigInteger;

public class TestMyStackCloneable {
    public static void main(String[] args) {

        MyStack stack1 = new MyStack();
        stack1.push(new BigInteger("5"));
        stack1.push(new BigDecimal("14.5"));
        MyStack stack2 = (MyStack) stack1.clone();
        stack2.push("2");
        stack2.push("Value");
        stack2.push("Another one value");
        System.out.println("Стек 1: " + stack1.toString() +
                "\nСтек 2: " + stack2.toString());
    }
}
