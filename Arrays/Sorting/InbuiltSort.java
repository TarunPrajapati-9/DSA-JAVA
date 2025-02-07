package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void printArray(Integer[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] arr = { 3, 4, 2, 1, 6, 5 };
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3); // first three element
        Arrays.sort(arr, Collections.reverseOrder()); // only work in Object Type Array

        printArray(arr);
    }
}
