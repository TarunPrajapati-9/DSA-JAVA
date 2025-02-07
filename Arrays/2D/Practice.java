public class Practice {
    public static int noSeven(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int sumSecondRow(int[][] matrix) {
        int row = 1, startCol = 0, endCol = matrix[1].length - 1;
        int sum = 0;
        while (startCol <= endCol) {
            sum += matrix[row][startCol];
            startCol++;
        }
        return sum;
    }

    public static void transposeMatrix(int[][] matrix) {
        int[][] trans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[0].length; j++) {
                trans[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transpose Matrix : ");
        for (int[] row : trans) {
            for (int e : row) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int[][] matrix = { { 1, 4, 9 }, { 11, 4, 3 }, { 4, 3, 4 } };
        System.out.println("Original Matrix : ");
        for (int[] row : matrix) {
            for (int e : row) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
        transposeMatrix(matrix);
    }
}
