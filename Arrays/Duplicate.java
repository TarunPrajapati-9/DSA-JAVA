import java.util.HashSet;

public class Duplicate {
    public static boolean duplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean duplicate2(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int e : arr) {
            if (set.contains(e)) {
                return true;
            }
            set.add(e);
        }
        return false;

        // for (int e : set) {
        // System.out.println(e);
        // }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 1 };
        System.out.println(duplicate2(arr));
    }
}
