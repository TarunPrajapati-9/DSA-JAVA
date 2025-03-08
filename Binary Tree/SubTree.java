public class SubTree {
    public static void main(String args[]) {
        int nodes1[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int nodes2[] = { 2, 4, -1, -1, 5 };
        BinaryTree b1 = new BinaryTree();

        Node root = b1.buildTree(nodes1);
        Node subRoot = b1.buildTree(nodes2);

        System.out.println(b1.isSubtree(root, subRoot));
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

    public boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(node.left, subRoot.left))
            return false;
        if (!isIdentical(node.right, subRoot.right))
            return false;

        return true;
    }

    public boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}