class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for(int i = 0; i < accounts.length; i++){
            // Resets the current wealth for each customer
            int wealth = 0;
            
            for(int j = 0; j < accounts[i].length; j++){
                wealth += accounts[i][j];
            }

            // Updates the max wealth when it finds
            // a bigger one
            if(wealth > maxWealth){
                maxWealth = wealth;
            }
        }

        return maxWealth;

        /*
        - Given: m x n int grid accounts
            - accounts[i][j] is the amount of money 
            ith customer has in the jth bank
        - Customer's wealth is the amount of money
        they have in all the banks
        - Richest customer is the customer that 
        has the max wealth
        - Return: The max wealth

        I can't think of what can be more effecient,
        so I'm just going to do a nested for loop
        for now
        */
    }
}
