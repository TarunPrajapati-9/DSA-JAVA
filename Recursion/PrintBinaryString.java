public class PrintBinaryString {
    public static void printString(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // sit 0 always
        printString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            // if last was zero then we can let 1 to sit
            printString(n - 1, 1, str + "1");
        }
    }

    public static void main(String args[]) {
        printString(3, 0, "");
    }
}
