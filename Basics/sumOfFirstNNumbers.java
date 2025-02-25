public class sumOfFirstNNumbers {
    public static void main(String args[]) {
        int n = 3;
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}