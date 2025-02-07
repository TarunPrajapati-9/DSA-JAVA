public class Capitalize {
    public static String toCapitalize(String s) {
        StringBuilder newStr = new StringBuilder("");
        char ch = Character.toUpperCase(s.charAt(0));
        newStr.append(ch);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i < s.length() - 1) {
                newStr.append(s.charAt(i));
                newStr.append(Character.toUpperCase(s.charAt(++i)));
            } else {
                newStr.append(s.charAt(i));
            }

        }
        return newStr.toString();
    }

    public static void main(String args[]) {
        String s = "hi tarun";
        System.out.println(toCapitalize(s));
    }
}
