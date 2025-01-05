package leetcode.easy;

public class AddBinary_67 {
    public static void main(String[] args) {
        AddBinary_67 ab = new AddBinary_67();
        String a = "1111";
        String b = "111";
        System.out.println(ab.addBinary(a, b));
    }

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            if (i >= 0) carry += a.charAt(i--) - '0';
            if (j >= 0) carry += b.charAt(j--) - '0';
            result.append(carry % 2);
            carry /= 2;
        }
        return result.reverse().toString();

    }
}
