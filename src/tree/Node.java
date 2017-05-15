package tree;

public class Node {

    Node left;
    Node right;

    private int data = Integer.MAX_VALUE;

    private int counter = 0;

    public Node(int item) {

        if(data != item) {
            counter++;
        }

        data = item;
        left = null;
        right = null;
    }

}
