class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            // Adds to the sum while iterating
            // through nums
            sum += nums[i];

            // Adds the current sum at index i to
            // the runningSum
            runningSum[i] = sum;
        }

        return runningSum;

        /*
        - Given: int array nums
        - runningSum[i] = sum(nums[0]...nums[i])
        - Return: running sum of nums
        */
    }
}
