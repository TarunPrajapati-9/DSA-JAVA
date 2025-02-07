public class MergeSort {
    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int startIdx, int endIdx) {
        if (startIdx >= endIdx) {
            return;
        }
        int mid = startIdx + (endIdx - startIdx) / 2;

        mergeSort(arr, startIdx, mid);
        mergeSort(arr, mid + 1, endIdx);
        merge(arr, startIdx, mid, endIdx);
    }

    public static void merge(int arr[], int startIdx, int mid, int endIdx) {
        int temp[] = new int[endIdx - startIdx + 1];
        int i = startIdx, j = mid + 1, k = 0;

        while (i <= mid && j <= endIdx) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // remaining left elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // remaining right elements
        while (j <= endIdx) {
            temp[k++] = arr[j++];
        }

        // copy elements in original arr
        for (k = 0, i = startIdx; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 2, 4, 2, 1, 9, -2 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
