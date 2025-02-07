public class ReverseNumber {
    public static void main(String args[]) {
        int num = 478;
        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num /= 10;
        }
    }
}
