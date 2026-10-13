//Truong Thi My Duyen
class Solution {
    public int maxProfit(int[] prices) {
        int maxLeft = 0;
        int []suffix = new int[prices.length];

        for(int i = prices.length-1; i >= 0; i--) {
            suffix[i] = maxLeft;
            maxLeft = Math.max(prices[i], maxLeft);
        }


        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, suffix[i] - prices[i]);
        }

        return maxProfit;
    }
}
