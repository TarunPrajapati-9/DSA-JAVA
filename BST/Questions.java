public class Questions {
    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(13);

        root.left.left = new Node(5);
        root.left.right = new Node(9);

        root.right.right = new Node(15);
        root.right.left = new Node(12);

        question1(root, 5, 8);
        System.out.println("Sum = " + sum);

        int closest = question2(root, 7);
        System.out.println(closest);

        Node kthSmallest = question3(root, 5);
        System.out.println(kthSmallest.data);
    }

    public static int sum = 0;
    public static int count = 0;

    public static void question1(Node root, int L, int R) {
        if (root == null) {
            return;
        }

        if (root.data >= L && root.data <= R) {
            question1(root.left, L, R);
            sum += root.data;
            question1(root.right, L, R);
        } else if (L > root.data) {
            question1(root.right, L, R);
        } else {
            question1(root.left, L, R);
        }
    }

    public static int question2(Node root, int K) {
        int closest = root.data;

        while (root != null) {
            if (Math.abs(K - root.data) < Math.abs(K - closest)) {
                closest = root.data;
            }

            if (K < root.data) {
                root = root.left;
            } else if (K > root.data) {
                root = root.right;
            } else {
                break;
            }
        }
        return closest;
    }

    public static Node question3(Node root, int K) {
        if (root == null) {
            return null;
        }

        Node left = question3(root.left, K);
        if (left != null) {
            return left;
        }

        count++;
        if (count == K) {
            return root;
        }
        return question3(root.right, K);
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
