public class Binary {

    public static int binarySearch(int n[], int key) {
        int start = 0, end = n.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (n[mid] == key) {
                return mid;
            }
            if (n[mid] > key) { // left
                end = mid - 1;
            } else { // right
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = { 22, 33, 44, 55, 66, 77, 88 }; /// sorted array
        System.out.println(binarySearch(num, 11));
    }
}
