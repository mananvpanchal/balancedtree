package org.frozenarc.standalone;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        tree(Arrays.asList(1, 3, 5, 8, 4, 9, 2));
    }

    public static void tree(List<Integer> input) {

        System.out.println("Input: "+input);

        Node unbalanced = BalancedTree.makeTree(input);

        BalancedTree.displayTree(unbalanced, "");

        List<Integer> sorted = BalancedTree.leftMiddleRightArray(unbalanced);

        System.out.println("Sorted: "+sorted);

        Node balanced = BalancedTree.makeBalancedTree(sorted);

        BalancedTree.displayTree(balanced, "");
    }
}
