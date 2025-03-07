import java.util.LinkedList;
import java.util.Queue;

public class Traversal {

    public static void main(String args[]) {
        BinaryTree b1 = new BinaryTree();
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = b1.buildTree(nodes);

        System.out.print("PreOrder Traversal : ");
        b1.preOrder(root);

        System.out.print("InOrder Traversal : ");
        b1.inOrder(root);

        System.out.print("PostOrder Traversal : ");
        b1.postOrder(root);

        System.out.print("LevelOrder Traversal : ");
        b1.levelOrder(root);

        System.out.println();
        System.out.println("Height of Tree : " + b1.height(root));
        System.out.println("No. of Nodes : " + b1.count(root));
        System.out.println("Sum of Node : " + b1.sumOfNodes(root));
        System.out.println("Max Diameter of Tree : " + b1.betterDiameter(root).diam);

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
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public void preOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void levelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            System.out.print(current.data + " ");

            if (current.left != null)
                queue.add(current.left);

            if (current.right != null)
                queue.add(current.right);
        }
    }

    public int height(Node root) {
        if (root == null)
            return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    public int count(Node root) {
        if (root == null)
            return 0;
        int lc = count(root.left);
        int rc = count(root.right);

        return lc + rc + 1;
    }

    public int sumOfNodes(Node root) {
        if (root == null)
            return 0;

        int lSum = sumOfNodes(root.left);
        int rSum = sumOfNodes(root.right);

        return lSum + rSum + root.data;
    }

    public int diameter(Node root) { // O(N^2)
        if (root == null)
            return 0;

        int lDiam = diameter(root.left);
        int rDiam = diameter(root.right);

        int lh = height(root.left);
        int rh = height(root.right);

        int selfDiam = lh + rh + 1;

        return Math.max(selfDiam, Math.max(rDiam, lDiam));
    }

    class Info {
        int diam;
        int ht;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public Info betterDiameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = betterDiameter(root.left);
        Info rightInfo = betterDiameter(root.right);

        int dam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(dam, ht);
    }
}