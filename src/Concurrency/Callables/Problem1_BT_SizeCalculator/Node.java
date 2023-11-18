package Concurrency.Callables.Problem1_BT_SizeCalculator;

public class Node {
    Node left;
    Node right;
    int data;

    public Node(Node left, Node right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }
}
