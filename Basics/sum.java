import java.util.Scanner;

public class sum {
    public static void main(String args[]) {
        // single line comment
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        int c = a + b;
        /*
         * Java with DSA
         * multiline comment
         */
        System.out.println("The sum is: " + c);
        sc.close();
    }
}
