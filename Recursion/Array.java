public class Array {
    public static boolean isSorted(int nums[], int i) {
        if (i == nums.length - 1) {
            return true;
        }
        if (nums[i] > nums[i + 1]) {
            return false;
        }
        return isSorted(nums, i + 1);
    }

    public static int firstOccurrence(int nums[], int i, int key) {
        if (i == nums.length - 1) {
            return -1;
        }
        if (nums[i] == key) {
            return i;
        }
        return firstOccurrence(nums, i + 1, key);
    }

    public static int lastOccurrence(int nums[], int i, int key) {
        if (i == nums.length) {
            return -1;
        }
        int found = lastOccurrence(nums, i + 1, key);
        if (found == -1 && nums[i] == key) {
            return i;
        }
        return found;
    }

    public static void main(String args[]) {
        int nums[] = { 4, 2, 4, 3 };
        System.out.println(lastOccurrence(nums, 0, 4));
    }
}
