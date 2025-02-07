public class TilingProblem {
    public static int tailingProblem(int n) { // 2 X n Floor
        if (n == 0 || n == 1) {
            return 1;
        }
        // // vertical choice
        // int vc = tailingProblem(n - 1);

        // // horizontal choice
        // int hc = tailingProblem(n - 2);
        // int totalWays = vc + hc;
        // return totalWays;

        return tailingProblem(n - 1) + tailingProblem(n - 2);
    }

    public static void main(String args[]) {
        System.out.println(tailingProblem(4));
    }
}
