import java.util.Scanner;

public class Average {
    public static void main(String args[]) {
        System.out.print("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = (a + b + c) / 3;

        System.out.println("Average of three numbers is: " + average);
        sc.close();
    }
}
