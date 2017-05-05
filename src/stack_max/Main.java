package stack_max;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void max(final int q) {
        final Scanner in = new Scanner(System.in);

        String oper;
        byte value;

        int arrMax[] = new int[q];

        Stack stack = new Stack();

        int j = 0;

        for (int i = 0; i < q; i++) {

            oper = in.next();

            if (oper.equals("push")) {
                value = in.nextByte();
                stack.push(value);
            } else if (oper.equals("pop")) {
                stack.pop();
            } else if (oper.equals("max")) {
                int max = Integer.MIN_VALUE;
                Stack<Integer> lifoCopy = (Stack<Integer>) stack.clone();
                while (!lifoCopy.isEmpty()) {
                    max = Math.max(lifoCopy.pop(), max);
                }
                arrMax[j] = max;
                j++;
            }
        }

        System.out.println("Выход:");
        for (int i = 0; i < j; i++) {
            System.out.println(arrMax[i]);
        }

    }

    public static void main(String[] args) {

        byte q;

        System.out.println("Вход:");
        final Scanner in = new Scanner(System.in);
        q = in.nextByte();
        max(q);


    }

}
