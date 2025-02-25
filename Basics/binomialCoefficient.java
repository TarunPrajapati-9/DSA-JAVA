public class binomialCoefficient {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void bioCoff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int co = fact_n / (fact_r * fact_nmr);

        System.out.println("Binomial Coefficient : " + co);
    }

    public static void main(String args[]) {
        bioCoff(5, 2);
    }
}
