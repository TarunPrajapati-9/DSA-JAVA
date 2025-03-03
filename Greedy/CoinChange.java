import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinChange {
    public static void main(String args[]) {
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Scanner sc = new Scanner(System.in);

        List<Integer> coinsTaken = new ArrayList<>();

        int countCoins = 0;
        System.out.print("Enter Amount : ");
        int amount = sc.nextInt();

        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countCoins++;
                    amount -= coins[i];
                    coinsTaken.add(coins[i]);
                }
            }
        }

        System.out.println("No. of Coins taken: " + countCoins);
        System.out.println("Which coins Taken : " + coinsTaken);
        sc.close();
    }
}
