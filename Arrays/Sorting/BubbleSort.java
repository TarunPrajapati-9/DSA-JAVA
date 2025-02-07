package Sorting;

public class BubbleSort {

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void ascending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // no of pass
            int swap = 0; // for best case already sorted
            for (int j = 0; j < arr.length - 1 - i; j++) { // ignored unnecessary comparison
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
                System.out.println(swap);
            }
            if (swap == 0) {
                break;
            }
        }
    }

    public static void descending(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

    }

    public static void main(String args[]) {
        // int[] arr = { 3, 4, 2, 1, 6, 5 };
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        descending(arr);
        printArray(arr);
    }
}
