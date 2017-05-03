package is_balanced;

import java.util.Stack;

public class Main {

    public static boolean isValid(final String s) {
        char[] str = s.toCharArray();
        Stack stack = new Stack();
        char check;
        for (char c : str) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (!stack.empty()) {
                    check = (char) stack.pop();
                    if (c == ')' && check != '{') {
                        return false;
                    } else if (c == ']' && check != '[') {
                        return false;
                    } else if (c == ')' && check != '(') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        final String str = "[{}[";
        System.out.println(isValid(str));
    }

}
