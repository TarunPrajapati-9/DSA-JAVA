import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopOfView {
    public static void main(String args[]) {
        BinaryTree b1 = new BinaryTree();
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7 };

        Node root = b1.buildTree(nodes);
        b1.topView(root);
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

    public void topView(Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.poll();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }
}

class Info {
    Node node;
    int hd; // horizontal distance

    Info(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}
