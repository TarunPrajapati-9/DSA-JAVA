public class MinMax {
    public int minValue(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int maxValue(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MinMax m1 = new MinMax();
        int[][] matrix = { { 1636, 3322, 113 }, { 334, 3235, 236 }, { 327, 338, 9212 } };
        System.out.println("Minimum : " + m1.minValue(matrix));
        System.out.println("Maximum : " + m1.maxValue(matrix));

        for (int[] row : matrix) {
            for (int e : row) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}