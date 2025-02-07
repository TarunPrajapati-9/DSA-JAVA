public class Palindrome {
    public static boolean palindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String s = "nurun";
        System.out.println(palindrome(s));
    }
}
