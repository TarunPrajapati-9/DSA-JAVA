public class SumOfDigit {
    public static void sod(int num) {
        int sod = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            sod = sod + lastDigit;
        }

        System.out.println(sod);
    }

    public static void main(String args[]) {
        sod(123);
    }
}
