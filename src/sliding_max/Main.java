package sliding_max;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void max(final int n) {

        final Queue<Integer> queueIn = new ArrayDeque<Integer>();

        final Scanner in = new Scanner(System.in);

        int m, counter = 0;

        for (int i = 0; i < n; i++) {
            queueIn.add(in.nextInt());
        }

        m = in.nextInt();

        while (!queueIn.isEmpty()) {

            LinkedList linkedList = new LinkedList(queueIn);

            int max = Integer.MIN_VALUE;

            if (counter < n - m + 1) {
                for (int i = 0; i < m; i++) {
                    if (counter <= n-m+1) {
                        max = Math.max((Integer) linkedList.poll(), max);
                    }
                }
                System.out.println(max);
            }

            queueIn.poll();
            counter++;
        }

    }

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        final int n = in.nextInt();

        max(n);

    }

}
