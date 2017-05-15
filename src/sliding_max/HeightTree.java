package sliding_max;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class HeightTree {

    private static final int ITER_TREE = 1;

    private final Queue<Integer> queue = new ArrayDeque<>();

    private final Scanner in = new Scanner(System.in);

    private int counter;

    public HeightTree() {
        counter = ITER_TREE;
    }

    private boolean checkCounter(int counter) {
        if (counter > ITER_TREE) {
            return true;
        }
        return false;
    }

    private boolean findValue(final Queue<Integer> fifoCopy,
                                final int value) {
        int counter = 0;
        while (!fifoCopy.isEmpty()) {
            if (fifoCopy.poll() == value) {
                counter++;
            }
        }
        return checkCounter(counter);
    }

    public void SetTree(final int value) {
        if (checkValue(value)) {
            queue.add(value);
            final Queue fifoCopy = new ArrayDeque(queue);

            if (!findValue(fifoCopy, value)) {
                this.counter++;
            }
        }
    }

    private static boolean checkValue(final int value) {
        if (value != -1) return true;
        else return false;
    }

    public int getHeight() {
        return counter;
    }

}
