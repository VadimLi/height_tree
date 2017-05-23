package slip_max;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void max(final int n) {
        final Scanner in = new Scanner(System.in);

        int value, m;
        int j = 0;

        final Stack<Integer> stack = new Stack();

        for (int i = 0; i < n; i++) {
            value = in.nextInt();
            stack.push(value);
        }

        m = in.nextInt();

        Stack<Integer> lifo = new Stack<>();

        while (!stack.empty()) {
            int max = Integer.MIN_VALUE;
            Stack<Integer> lifoCopy = (Stack<Integer>) stack.clone();
            for (int i = 0; i < m; i++) {
                if(!lifoCopy.isEmpty())
                    max = Math.max(lifoCopy.pop(), max);
            }
            stack.pop();
            lifo.push(max);
        }

        while (!lifo.empty()) {
            System.out.print(lifo.pop() + " ");
        }

    }

    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);

        int n;

        n = in.nextInt();

        max(n);

    }

}
