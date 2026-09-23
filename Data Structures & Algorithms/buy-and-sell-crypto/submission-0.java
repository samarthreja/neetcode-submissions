class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minprice = prices[0];
        int profit  = 0;
        for(int i = 1;i<n;i++){
           if(prices[i] < minprice){
            minprice = prices[i];
           }
           else{
            int currprofit = prices[i] - minprice;
            profit = Math.max(profit, currprofit);
           }
        }
        return profit;
    }
}