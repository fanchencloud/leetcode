import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (char c : array) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                if (!stack.isEmpty() && isOk(stack.peek(), c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isOk(char c, char a) {
        if (c == '{' && a == '}') {
            return true;
        } else if (c == '[' && a == ']') {
            return true;
        } else if (c == '(' && a == ')') {
            return true;
        } else {
            return false;
        }
    }
}