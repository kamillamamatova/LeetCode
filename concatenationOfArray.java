class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;

        /*
        - Given: int array nums of length n
        - Goal: Create an array ans of length of 2n where ans[i] == nums[i]
        & ands[i + n] == nums[i]
        - 0 indexed
        - Return: array ans
        */
    }
}
