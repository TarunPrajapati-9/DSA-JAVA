import java.util.ArrayList;

public class SampleBST {
    public static void main(String args[]) {
        // int arrNode[] = { 3, 5, 6, 8, 10, 11, 12 };

        Node root = new Node(8);
        root.left = new Node(7);
        root.left.left = new Node(6);
        root.left.left.left = new Node(5);

        root.right = new Node(9);
        root.right.right = new Node(10);
        root.right.right.right = new Node(11);

        System.out.println("Before : ");
        preOrder(root);
        System.out.println();
        System.out.println("After : ");
        root = unBalance2Balance(root);
        preOrder(root);
    }

    public static Node createBalancedBST(ArrayList<Integer> arr, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBalancedBST(arr, st, mid - 1);
        root.right = createBalancedBST(arr, mid + 1, end);
        return root;
    }

    public static Node unBalance2Balance(Node root) {
        ArrayList<Integer> inOrder = new ArrayList<>();
        getInOrder(root, inOrder);

        root = createBalancedBST(inOrder, 0, inOrder.size() - 1);
        return root;
    }

    public static void getInOrder(Node root, ArrayList<Integer> inOrder) {
        if (root == null) {
            return;
        }
        getInOrder(root.left, inOrder);
        inOrder.add(root.data);
        // System.out.print(root.data + " ");
        getInOrder(root.right, inOrder);
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
