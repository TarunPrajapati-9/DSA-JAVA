public class KthLevel {
    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7 };
        // 1
        // / \
        // 2 3
        // / \ / \
        // 4 5 6 7
        BinaryTree b1 = new BinaryTree();
        Node root = b1.buildTree(nodes);

        b1.kthLevel(root, 1, 3);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    int idx = -1;

    public Node buildTree(int nodes[]) {
        idx = -1;
        return buildTreeHelper(nodes);
    }

    public Node buildTreeHelper(int nodes[]) {
        idx++;
        if (idx >= nodes.length || nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTreeHelper(nodes);
        newNode.right = buildTreeHelper(nodes);

        return newNode;
    }

    public void kthLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }

        if (level == k) {
            System.out.println(root.data + " ");
            return;
        }

        kthLevel(root.left, level + 1, k);
        kthLevel(root.right, level + 1, k);
    }
}