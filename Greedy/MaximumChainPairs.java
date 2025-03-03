import java.util.Arrays;
import java.util.Comparator;

public class MaximumChainPairs {
    public static void main(String args[]) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        int selectedPairs[][] = new int[pairs.length][2];
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1];

        selectedPairs[0][0] = pairs[0][0];
        selectedPairs[0][1] = pairs[0][1];

        // 5,24 5,28 27,40 39,60 50,90
        int idx = 1;
        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];

                // store pairs
                selectedPairs[idx][0] = pairs[i][0];
                selectedPairs[idx][1] = pairs[i][1];
                idx++;
            }
        }

        idx = 0;
        System.out.println("Max Length : " + chainLen);
        for (int[] row : selectedPairs) {
            System.out.print("( ");
            for (int r : row) {
                System.out.print(r + " ");
            }
            idx++;
            if (idx > chainLen - 1) {
                System.out.println(")");
                break;
            }
            System.out.println(")");
        }
    }
}
