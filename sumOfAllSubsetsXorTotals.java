class Solution {
    public int subsetXORSum(int[] nums) {
        
        return dfs(nums, 0, 0);
        /*
        - Given: XOR total of an array
            - bitwise XOR of all its elems
            - 0 if the array is empty

        11 = 3
        01 = 1
        ---
        10 = 2

        1 ^ 3
        */
    }

    public int dfs(nums, int i, int currXor){
        // One subset is finished
        if(i == nums.length){
            return currXor;
        }

        int skip = dfs(nums, i + 1, currXor)

        int take = dfs(nums, i + 1, currXor ^ nums[i]);

        return skip + take;
    }
}
