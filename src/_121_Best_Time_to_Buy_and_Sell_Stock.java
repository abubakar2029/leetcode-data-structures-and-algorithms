public class _121_Best_Time_to_Buy_and_Sell_Stock {

    public static void main(String[] args) {
//        System.out.println(Solution1.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    //    third attempt passed all test cases
    class Solution3 {
        public int maxProfit(int[] prices) {
            int minCurrent = 0;
            int maxProfit = 0;

            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < prices[minCurrent]) {
                    minCurrent = i;
                } else if (maxProfit < prices[i] - prices[minCurrent]) {
                    maxProfit = prices[i] - prices[minCurrent];
                }
            }
            return maxProfit;
        }
    }

    //    first attempt didn't work
    class Solution1 {
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

    //    second attempt didn't work
    class Solution2 {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            int minIndex = 0;
            int maxIndex = 0;

            // pehla loop maximum stock find krna ka lia
            for (int i = 0; i < n; i++) {
                if (prices[i] > prices[maxIndex]) {
                    maxIndex = i;
                }
            }
            // second loop maximum sa pehla minimum find krna ka lia
            for (int i = 1; i <= maxIndex; i++) {
                if (prices[i] < prices[minIndex]) {
                    minIndex = i;
                }
            }
            return (prices[maxIndex] - prices[minIndex]);
        }
    }
}
