import java.util.Scanner;

public class Linear {
    static Scanner sc = new Scanner(System.in);

    public static void input(int m[]) {

        for (int i = 0; i < m.length; i++) {
            System.out.print("Enter Marks " + (i + 1) + " : ");
            m[i] = sc.nextInt();
        }
        System.out.println();
    }

    public static boolean search(int mark, int m[]) {
        for (int i = 0; i < m.length; i++) {
            if (m[i] == mark) {
                return true;
            }
        }
        return false;
    }

    public static void search2(int mark, int m[]) {
        boolean flag = false;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == mark) {
                flag = true;
            }
            if (flag) {
                System.out.println("Marks found at " + (i + 1) + "th Position");
                break;
            }
        }
        if (flag == false) {
            System.out.println("Mark Not Found ---> Method 2");
        }
    }

    public static int search3(int mark, int m[]) {
        for (int i = 0; i < m.length; i++) {
            if (m[i] == mark) {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        int marks[] = new int[5];
        input(marks);

        System.out.print("Enter Mark for Search : ");
        int search = sc.nextInt();

        // Method 1
        boolean flag = search(search, marks);
        if (flag) {
            System.out.println("Mark found");
        } else
            System.out.println("Mark Not Found ---> Method 1");

        // Method 2
        search2(search, marks);

        // Method 3
        int pos = search3(search, marks);
        if (pos == 0) {
            System.out.println("Mark Not Found ---> Method 3");
        } else
            System.out.println("Mark Found at : " + pos);
    }
}
