class Solution {
    public int xorOperation(int n, int start) {
        // First value in nums array will be start,
        // since start + 2 * 0 = start
        int xor = start;
        
        int[] nums = new int[n];

        // Begins at 1 since xor is originally equal 
        // to start
        for(int i = 1; i < n; i++){
            nums[i] = start + 2 * i;
            xor = xor ^ nums[i];
        }
        
        return xor;

        /*
        - Given: int n & int start
        - Goal: Define int array nums
            - nums[i] = start + 2 * i
            - n == nums.length
        - Return XOR of all elements of nums
        */
    }
}
