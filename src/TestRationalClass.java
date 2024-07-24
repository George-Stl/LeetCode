import java.math.BigInteger;
import java.util.Scanner;
public class TestRationalClass {
    public static void main(String[] args) {
        Rational sum = new Rational(BigInteger.ZERO, BigInteger.ONE);

        for(int i = 1, j = 2; i < 100; i+=2, j+=2){
            System.out.println(new Rational(new BigInteger(i + ""),new BigInteger(j + "")));
            sum = sum.add(new Rational(new BigInteger(i + ""),new BigInteger(j + "")));
        }
        System.out.println();
        System.out.println("Результат вычисления: " + sum);

    }
}