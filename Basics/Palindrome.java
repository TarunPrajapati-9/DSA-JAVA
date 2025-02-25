public interface Palindrome {

    public static boolean isPalindrome(int num) {
        int n = num, finalNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n /= 10;
            finalNum = finalNum * 10 + lastDigit;
            // System.out.println("LD: " + lastDigit);
            // System.out.println("N: " + n);
            // System.out.println("FN: " + finalNum);
        }
        return finalNum == num;
    }

    public static void main(String args[]) {
        System.out.println(isPalindrome(9333));
    }
}
