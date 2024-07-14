import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        Number x = new BigInteger(3 + "");
        System.out.println(x.intValue());
        System.out.println(((BigInteger)x).compareTo(new BigInteger(4 + "")));
    }
}