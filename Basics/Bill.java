import java.util.Scanner;

public class Bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of eraser: ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;

        float GST = total + (0.18f * total);

        System.out.println("Total Amount is: " + total);
        System.out.println("Total Amount with GST is: " + GST);
        sc.close();
    }
}
