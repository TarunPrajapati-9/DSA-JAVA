public class StarPattern {

    public static void SimpleStar() {
        for (int r = 0; r < 4; r++) {
            for (int star = 0; star <= r; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void InvertedStar() {
        for (int r = 0; r < 4; r++) {
            // for (int star = 1; star < 4 - r + 1; star++) {
            for (int star = r; star < 4; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void HalfPyramid() {
        for (int r = 1; r <= 4; r++) {
            for (int star = 1; star <= r; star++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }

    public static void PrintCharacter() {
        char ch = 'A';

        for (int r = 0; r < 4; r++) {
            for (int chars = 0; chars <= r; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    // Remain
    public static void HollowRectangle(int totRows, int totCols) {
        for (int r = 1; r <= totRows; r++) {
            for (int col = 1; col <= totCols; col++) {
                // Boundary Checking matrix (r,col)
                if (r == 1 || r == totRows || col == 1 || col == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void FloydTriangle() {
        int num = 1;
        for (int r = 0; r < 5; r++) {
            for (int nums = 0; nums <= r; nums++) {
                System.out.print(" " + num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void InvertedPyramid(int totRow) {
        for (int r = 1; r <= totRow; r++) {

            // spaces
            for (int space = 1; space <= totRow - r; space++) {
                System.out.print(" ");
            }

            // stars
            for (int star = 1; star <= r; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void InvertedNumber(int totRow) {
        for (int r = 1; r <= totRow; r++) {
            int num = 1;

            // Numbers
            for (int n = 0; n <= totRow - r; n++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void ZeroOne(int totRow) {
        for (int r = 1; r <= totRow; r++) {
            for (int col = 1; col <= r; col++) {
                if ((r + col) % 2 == 0) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int totRow) {
        // 1st Half
        for (int r = 1; r <= totRow; r++) {
            // stars - (r)
            for (int j = 1; j <= r; j++) {
                System.out.print("*");
            }

            // spaces - 2*(totRow - r)
            for (int space = 1; space <= 2 * (totRow - r); space++) {
                System.out.print(" ");
            }

            // stars - (r)
            for (int j = 1; j <= r; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half
        for (int r = totRow; r >= 1; r--) {
            // stars - (r)
            for (int j = 1; j <= r; j++) {
                System.out.print("*");
            }

            // spaces - 2*(totRow - r)
            for (int space = 1; space <= 2 * (totRow - r); space++) {
                System.out.print(" ");
            }

            // stars - (r)
            for (int j = 1; j <= r; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int totRow) {
        for (int r = 1; r <= totRow; r++) {
            // spaces
            for (int space = 1; space <= totRow - r; space++) {
                System.out.print(" ");
            }

            // star
            for (int star = 1; star <= totRow; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int totRow) {
        // 1st Half
        for (int r = 1; r <= totRow; r++) {
            // spaces
            for (int space = 1; space <= totRow - r; space++) {
                System.out.print(" ");
            }

            // stars
            for (int star = 1; star <= (2 * r) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half
        for (int r = totRow; r >= 1; r--) {
            // spaces
            for (int space = 1; space <= totRow - r; space++) {
                System.out.print(" ");
            }

            // stars
            for (int star = 1; star <= (2 * r) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        diamond(4);
    }
}
