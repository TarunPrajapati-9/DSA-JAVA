public class DiagonalSum {

    // brute force O(n^2)
    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j]; // primary diagonal sum
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j]; // secondary diagonal sum
                }
            }
        }
        return sum;
    }

    // optimal O(n)
    public static int diagonalSum2(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // primary diagonal sum

            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(diagonalSum2(matrix));
    }
}
