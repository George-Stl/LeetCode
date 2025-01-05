package leetcode.easy;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        LengthOfLastWord_58 llw = new LengthOfLastWord_58();
        String s = "Hello World";
        System.out.println(llw.lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}
