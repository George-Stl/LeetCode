import java.math.BigInteger;
import java.util.Scanner;
public class TestRationalDecimal {
    public static void main(String[] args) {
        System.out.println("Введите десятичное число с точкой: ");
        Scanner input = new Scanner(System.in);
        String userString = input.next();
        String[] userDivided = userString.split("\\.");
        int integralPart = Integer.parseInt(userDivided[0]);
        int fractalLength = userDivided[1].length();
        int fractalDivider = (int) Math.pow(10, fractalLength); // знаменатель
        int d = Character.getNumericValue(userDivided[1].charAt(0));
        while(d == 0){
            userDivided[1] = userDivided[1].substring(1);
            d = Character.getNumericValue(userDivided[1].charAt(0));
        }
        System.out.println("Десятичная часть после обрезания нулей: " + userDivided[1]);

        int n = integralPart*fractalDivider;
        if(userDivided[0].startsWith("-")){
            n -= Integer.parseInt(userDivided[1]);
        } else
            n += Integer.parseInt(userDivided[1]);


        Rational decimalToRational = new Rational(BigInteger.valueOf(n), BigInteger.valueOf(fractalDivider));

        System.out.println("Десятичное число в виде дроби: " + decimalToRational);

    }
}
