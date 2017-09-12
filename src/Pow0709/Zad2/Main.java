package Pow0709.Zad2;

import java.util.Stack;

public class Main {
    public static boolean numberOfParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            // Biore ze stinga jeden znak
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(numberOfParentheses("(a+b))"));
        System.out.println(numberOfParentheses("(a+b)*2"));
        System.out.println(numberOfParentheses("((a+b)*2)"));

    }
}
