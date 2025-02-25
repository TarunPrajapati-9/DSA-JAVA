import java.util.Scanner;

public class inputMethods {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String oneWord = sc.next(); // only one word as input if whitespace occur then it cannot take it as input.
        System.out.print(oneWord);
        String multiLine = sc.nextLine(); // multiLine input or paragraph
        System.out.println(multiLine);
        int num = sc.nextInt();
        System.out.println(num);
        double num2 = sc.nextDouble();
        System.out.println(num2);

        sc.close();
    }
}
