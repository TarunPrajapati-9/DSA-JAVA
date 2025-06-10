public class Questions {
    public static void main(String args[]) {
        // int nodes[] = { 2, 2, 2, -1, -1, 2, -1, -1, 2 };
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        int nodes2[] = { 1, 3, 7, -1, -1, 6, -1, -1, 2, 5, -1, -1, 4, -1, -1 };

        BinaryTree b1 = new BinaryTree();
        Node root1 = b1.buildTree(nodes);
        Node root2 = b1.buildTree(nodes2);

        System.out.println(b1.isInverted(root1, root2));

        // System.out.println(b1.isUniValued(root));
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

    public boolean isUniValued(Node root) {
        if (root == null) {
            return true;
        }

        if (root.left != null && root.left.data != root.data) {
            return false;
        }

        if (root.right != null && root.right.data != root.data) {
            return false;
        }
        return isUniValued(root.left) && isUniValued(root.right);
    }

    public int countNodes(Node root) {
        if (root == null) {
            return 0; // if the tree is empty or it's a leaf's child
        }

        // 1 (current node) + left subtree nodes + right subtree nodes
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public boolean isInverted(Node root1, Node root2) { // isMirror
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        return (root1.data == root2.data) && isInverted(root1.left, root2.right) && isInverted(root1.right, root2.left);

    }
}
