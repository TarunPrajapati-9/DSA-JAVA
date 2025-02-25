import java.util.Scanner;

public class areaOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("Area of the circle is: " + area);
        sc.close();
    }
}
