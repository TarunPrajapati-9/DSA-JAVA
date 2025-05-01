import java.util.ArrayList;

public class LowestCommonAncestor {
    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7 };
        BinaryTree b1 = new BinaryTree();

        Node root = b1.buildTree(nodes);
        // int LCA = b1.lca2(root, 4, 5).data;
        // System.out.println(LCA);

        // System.out.println(b1.minDist(root, 4, 6));

        // b1.KAncestor(root, 4, 1);
        b1.transform(root);

        b1.preOrder(root);
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

    public boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;
        }

        path.remove(root);
        return false;
    }

    public Node lca1(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;

        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        Node lca = path1.get(i - 1);
        return lca;
    }

    public Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLCA = lca2(root.left, n1, n2);
        Node rightLCA = lca2(root.right, n1, n2);

        if (leftLCA == null) {
            return rightLCA;
        }
        if (rightLCA == null) {
            return leftLCA;
        }

        // if(leftLCA != null || rightLCA != null)
        return root;
    }

    public int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }
    }

    public int minDist(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);

        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
    }

    public int KAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    public int transform(Node root) {
        if (root == null) {
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;
        int leftData = (root.left != null) ? root.left.data : 0;
        int rightData = (root.right != null) ? root.right.data : 0;

        root.data = leftData + leftChild + rightData + rightChild;
        return data;
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}