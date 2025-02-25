public class Conversions {

    public static void BinToDec(int BinNum) {
        int num = BinNum, pow = 0, decNum = 0;

        while (BinNum > 0) {
            int lastDigit = BinNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            BinNum /= 10;
        }
        System.out.println("Decimal of " + num + " = " + decNum);
    }

    public static void DecToBin(int DecNum) {
        int num = DecNum, BinNum = 0, pow = 0;

        while (DecNum > 0) {
            int rem = DecNum % 2;
            BinNum = BinNum + (rem * (int) Math.pow(10, pow));

            pow++;
            DecNum /= 2;
        }

        System.out.println("Binary of " + num + " = " + BinNum);
    }

    public static void main(String args[]) {
        DecToBin(5);
    }
}
