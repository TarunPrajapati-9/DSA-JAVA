public class StringCompress {
    public static String compress(String s) {
        StringBuilder newStr = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            Integer count = 1;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(s.charAt(i));
            if (count > 1) {
                newStr.append(count.toString());
            }
        }

        return newStr.toString();
    }

    public static void main(String args[]) {
        String s = "aaaabbbccddd";
        System.out.println(compress(s));
    }
}