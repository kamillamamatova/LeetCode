class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(nums[i] == nums[j] && i < j){
                    goodPairs++;
                }
            }
        }

        return goodPairs;

        /*
        - Given: array of ints nums
        - Return: # of good pairs
            - (i, j) is good if nums[i] == nums[j] && i < j

        I'm going to solve it using a nested loop first,
        and then try a hashmap
        */
    }
}
