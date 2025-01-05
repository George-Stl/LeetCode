package leetcode.easy;

import java.util.Stack;

public class AcceptableParentheses_20 {
    public static void main(String[] args) {
        AcceptableParentheses_20 ap = new AcceptableParentheses_20();
        String s = "({[]()})";
        System.out.println(ap.isValid(s));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '['
                || currentChar == '{'
                || currentChar == '(') {
                stack.push(currentChar);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char topChar = stack.pop();
                if ((currentChar == ']' && topChar != '[')
                    || (currentChar == '}' && topChar != '{')
                    || (currentChar == ')' && topChar != '(')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
