package tree_height;

import sliding_max.HeightTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final HeightTree heightTree = new HeightTree();

        final Scanner in = new Scanner(System.in);

        final int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            heightTree.SetTree(value);
        }

        System.out.println(heightTree.getHeight());

    }

}
