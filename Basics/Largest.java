public class Largest {
    public static int large(int n[]) {
        int max = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        return max;
    }

    public static int small(int n[]) {
        int min = Integer.MAX_VALUE; // +infinity
        for (int i = 0; i < n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        int num[] = { 3, 4, 53, 22, 7, 1 };
        System.out.println("Largest : " + large(num));
        System.out.println("Smallest : " + small(num));
    }
}
