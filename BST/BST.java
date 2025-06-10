import java.util.ArrayList;

public class BST {
    public static void main(String args[]) {
        int nodes[] = { 4, 1, 3, 6, 2, 7, 9, 8, 10 };
        BuildBST b1 = new BuildBST();
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = b1.insert(root, nodes[i]);
        }

        root = b1.createMirror(root);
        b1.preOrder(root);

        // if (b1.isValidBST(root, null, null)) {
        // System.out.println("Valid BST");
        // } else {
        // System.out.println("Invalid BST");
        // }

        // b1.printPathRoot2Leaf(root, new ArrayList<>());
        // b1.printInRange(root, 1, 5);

        // b1.inOrder(root);
        // System.out.println();

        // b1.delete(root, 1);
        // b1.inOrder(root);

        // if (b1.search(root, 12)) {
        // System.out.println("Key found");
        // } else {
        // System.out.println("Key not found");
        // }
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

class BuildBST {
    public Node insert(Node root, int data) {
        if (root == null) {
            return root = new Node(data);
        }
        if (data > root.data) {
            root.right = insert(root.right, data); // right subTree
        } else {
            root.left = insert(root.left, data); // left subTree
        }
        return root;
    }

    public boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key > root.data) {
            return search(root.right, key);
        } else {
            return search(root.left, key);
        }
    }

    public Node delete(Node root, int key) {
        if (key > root.data) {
            root.right = delete(root.right, key);
        } else if (key < root.data) {
            root.left = delete(root.left, key);
        } else {
            // case 1 - child(leaf) node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 - one child node
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 - both child node
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (k1 > root.data) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }

    public void printPathRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i) + "->");
            }
            System.out.println("Null");
        }
        printPathRoot2Leaf(root.left, path);
        printPathRoot2Leaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && min.data >= root.data) {
            return false;
        }
        if (max != null && max.data <= root.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public Node createMirror(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    public Node findInOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
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
