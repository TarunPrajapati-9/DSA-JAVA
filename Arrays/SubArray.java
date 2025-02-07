public class SubArray {
    public static void printSubArrays(int n[]) {
        int totalArrays = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < n.length; i++) {
            for (int j = i; j < n.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(n[k] + ",");
                    sum = sum + n[k];
                    if (sum > max) {
                        max = sum;
                    }
                    if (sum < min) {
                        min = sum;
                    }
                }
                System.out.println("Sum : " + sum);
                totalArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max  = " + max + " Min = " + min);
        System.out.println("Total Sub Arrays : " + totalArrays); // (n*(n+1)/2)
    }

    public static void main(String args[]) {
        int num[] = { 1, -2, 6, -1, 3 };
        printSubArrays(num);
    }
}
