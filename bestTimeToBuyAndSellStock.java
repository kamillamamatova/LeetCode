class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        // Initializes the highest and lowest price at index 0
        int lowest = prices[0];
        int highest = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(lowest > prices[i]){
                lowest = prices[i];

                // Reseting highest, since the og highest 
                // is before the new lowest
                highest = prices[i];
            }

            // After checking for lowest,
            // to make sure it's after lowest position
            if(highest < prices[i]){
                highest = prices[i];
            }

            // Finds the max profit between the previous profit,
            // and the newest difference between highest and lowest
            profit = Math.max(profit, highest - lowest);
        }

        return profit;
    }
}
