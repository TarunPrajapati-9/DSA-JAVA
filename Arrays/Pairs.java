public class Pairs {
    public static void printPairs(int n[]) {
        int totalPairs = 0;
        for (int i = 0; i < n.length; i++) {
            int current = n[i];
            for (int j = i + 1; j < n.length; j++) {
                System.out.print("(" + current + "," + n[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + totalPairs); // (n*(n-1))/2
    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        printPairs(num);
    }
}
