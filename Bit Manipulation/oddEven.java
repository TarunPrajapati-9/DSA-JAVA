public class oddEven {

    public static void checkOddEven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 1) {
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is Even");
        }
    }

    public static void main(String args[]) {
        checkOddEven(3);
        checkOddEven(12);
        checkOddEven(315);
    }
}