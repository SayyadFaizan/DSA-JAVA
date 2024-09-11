package ArrayLeetCode;

public class BuySellStock {
    public static int maxprofit(int[] prices){
        int minProfit = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minProfit){
                minProfit = prices[i];
            } else if (prices[i] - minProfit > maxProfit) {
                maxProfit = prices[i] - minProfit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Maximum Profit: " + maxprofit(prices));
    }
}
