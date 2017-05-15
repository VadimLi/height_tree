package tree;

public class BinaryTree {

    Node root;

    int maxHeight(final Node node) {
        if (node == null) {
            return 0;
        } else {
            int lDepth = maxHeight(node.left);
            int rDepth = maxHeight(node.right);

            if (lDepth > rDepth)
                return lDepth + 1;
            else return rDepth + 1;
        }
    }

}
