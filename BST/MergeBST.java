import java.util.ArrayList;
import java.util.TreeSet;

public class MergeBST {
    public static TreeSet<Integer> set = new TreeSet<>();

    public static void main(String args[]) {
        Node root = new Node(2);
        Node root2 = new Node(9);

        root.left = new Node(1);
        root.right = new Node(4);

        root2.left = new Node(3);
        root2.right = new Node(12);

        inOrder(root);
        inOrder(root2);

        ArrayList<Integer> arr = new ArrayList<>();
        for (int val : set) {
            arr.add(val);
        }

        Node newRoot = createBalancedBST(arr, 0, arr.size() - 1);
        preOrder(newRoot);
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

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        set.add(root.data);
        inOrder(root.right);
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