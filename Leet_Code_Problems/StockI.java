package Leet_Code_Problems;

class Solution {
    public int maxProfit(int[] prices) {
        int bought = prices[0];
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < bought){
                bought = prices[i];
            }
            else if(prices[i] - bought > profit){
                profit = prices[i] - bought;
            }
        }
        return profit;
    }
}


 