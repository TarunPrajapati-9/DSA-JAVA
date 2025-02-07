public class Reverse {
    public static void reverseArray(int n[]) {
        int start = 0, end = n.length - 1;
        while (start < end) {
            // swap
            int temp = n[end];
            n[end] = n[start];
            n[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5 };
        reverseArray(num);
        // int len = num.length;
        // int j = 0;
        // while (len != 0 && j <= len) {
        // num[j] = num[len - 1];
        // j++;
        // len--;
        // }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
