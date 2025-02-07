public class swapOfThree {

    public static void swap(int a, int b, int c) {
        int temp_a = a;
        int temp_b = b;
        a = c;
        b = temp_a;
        c = temp_b;
        System.out.println(a + " " + b + " " + c); // a=6, b=4, c=5
    }

    public static void main(String args[]) {
        swap(4, 5, 6);
    }
}
