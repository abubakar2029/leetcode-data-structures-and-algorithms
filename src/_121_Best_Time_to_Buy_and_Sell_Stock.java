public class _121_Best_Time_to_Buy_and_Sell_Stock {

    public static void main(String[] args) {
        System.out.println(Solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    class Solution {
        static public int maxProfit(int[] prices) {
            int maxProfit = 0;
            int i = 0;
            while (i < prices.length - 1) {
                int j = i + 1;
                System.out.println(prices[i]);
                while (j < prices.length) {
                    maxProfit = Math.abs(prices[i] - prices[j]) > maxProfit ? Math.abs(prices[i] - prices[j]) : maxProfit;
                    System.out.println(prices[j]);
                    j++;
                }
                System.out.println("===================");
                i++;
            }
            return maxProfit;
        }
    }
}
