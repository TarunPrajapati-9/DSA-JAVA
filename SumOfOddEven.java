import java.util.Scanner;

public class SumOfOddEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, choice = 0, oddSum = 0, evenSum = 0;

        do {
            System.out.print("Enter Number: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }

            System.out.print("Do You Wanna Continue? For Yes 1, No 2: ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
        sc.close();
    }
}
