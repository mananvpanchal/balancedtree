package org.frozenarc.standalone;

import java.util.ArrayList;
import java.util.List;

/*
 * Author: manan
 * Date: 5/18/19 12:32 PM
 * Platform: Linux
 */
public class BalancedTree {

    public static Node makeTree(List<Integer> data) {
        Node root = new Node();
        for (int i = 0; i < data.size(); i++) {
            populateTree(root, data.get(i));
        }
        return root;
    }

    private static void populateTree(Node node, int value) {
        if (node.getValue() == null) {
            node.setValue(value);
        } else {
            if (node.getValue() < value) {
                if (node.getRight() == null) {
                    Node right = new Node();
                    node.setRight(right);
                    populateTree(right, value);
                } else {
                    populateTree(node.getRight(), value);
                }
            } else {
                if (node.getLeft() == null) {
                    Node left = new Node();
                    node.setLeft(left);
                    populateTree(left, value);
                } else {
                    populateTree(node.getLeft(), value);
                }
            }
        }
    }

    public static List<Integer> leftRootRightArray(Node root) {
        List<Integer> sorted = new ArrayList<>();
        populateList(sorted, root);
        return sorted;
    }

    private static void populateList(List<Integer> list, Node node) {
        if (node == null) {
            return;
        } else {
            populateList(list, node.getLeft());
            list.add(node.getValue());
            populateList(list, node.getRight());
        }
    }

    public static Node makeBalancedTree(List<Integer> sortedList) {
        Node root = new Node();
        populateTree(root, sortedList);
        return root;
    }

    private static void populateTree(Node node, List<Integer> list) {
        if (list.size() == 1) {
            node.setValue(list.get(0));
        } else {
            int mid = list.size() / 2;

            node.setValue(list.get(mid));

            List<Integer> leftList = list.subList(0, mid);
            if(leftList.size() > 0) {
                Node left = new Node();
                node.setLeft(left);
                populateTree(left, leftList);
            }

            List<Integer> rightList = list.subList(mid + 1, list.size());
            if(rightList.size() > 0) {
                Node right = new Node();
                node.setRight(right);
                populateTree(right, rightList);
            }
        }
    }

    public static void displayTree(Node tree, String spaces) {
        if (tree != null) {
            displayTree(tree.getLeft(), spaces + "   ");
            System.out.println(spaces + tree.getValue());
            displayTree(tree.getRight(), spaces + "   ");
        }
    }
}
