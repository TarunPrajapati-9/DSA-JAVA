
public class MaxSubArray {
    public static void maxSubArrays(int n[]) {
        int prefix[] = new int[n.length];
        prefix[0] = n[0];

        // calculating Prefix Array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + n[i];
        }

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < n.length; i++) {
            for (int j = i; j < n.length; j++) {
                int sum = 0;

                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
        }
        System.out.println("Max  = " + max + " Min = " + min);
    }

    public static int kadanes(int n[]) {
        int curSum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n.length; i++) {
            curSum += n[i];

            if (curSum < 0) {
                curSum = 0;
            }

            max = Math.max(max, curSum);

        }
        return max;
    }

    public static void main(String args[]) {
        int num[] = { -1, -2, -6, -4, -3 };
        System.out.println(kadanes(num));
    }
}
