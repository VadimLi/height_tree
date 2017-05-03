package tree_height;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final TreeHeight treeHeight = new TreeHeight();

        System.out.println("in : ");
        treeHeight.read();
        System.out.println("out: " + treeHeight.computeHeight());

    }

}
