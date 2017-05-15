package tree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.right.right = new Node(2);

        System.out.println("Height of tree is : " +
                tree.maxHeight(tree.root));

    }

}
