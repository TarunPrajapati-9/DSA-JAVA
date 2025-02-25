import java.util.Scanner;

public class Table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter a Number to Print Table: ");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "X" + i + "=" + num * i);
        }
        sc.close();
    }
}
