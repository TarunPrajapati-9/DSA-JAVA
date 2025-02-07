public class IsEven {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String args[]) {
        boolean res = isEven(14);
        System.out.println(res);
    }
}