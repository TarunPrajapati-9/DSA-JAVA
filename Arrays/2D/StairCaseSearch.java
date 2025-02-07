public class StairCaseSearch {
    public static boolean stairCaseSearch(int[][] matrix, int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--; // left
            } else {
                row++; // down
            }
        }
        System.out.println("Not Found!");
        return false;
    }

    public static boolean stairCaseSearch2(int[][] matrix, int key) {
        int row = matrix.length - 1, col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("Found at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--; // top
            } else {
                col++; // right
            }
        }
        System.out.println("Not Found!");
        return false;
    }

    public static void main(String args[]) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        stairCaseSearch2(matrix, 14);
    }
}
