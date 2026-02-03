class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        // k # of iterations
        for(int i = 0; i < k; i++){
            // Resets the minimum before a new minimum is either found
            // or it stays the same
            int min = nums[0];
            int minIndex = 0;

            // Iterates through nums to find a new min and its index
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < min){
                    min = nums[j];
                    minIndex = j;
                }
            }

            // Replaces the min with min * multiplier
            nums[minIndex] = min * multiplier;
        }

        return nums;

        /*
        - Given: int array nums, int k, int multiplier
        - Need to perform k operations on nums
        In each operation: 
            - find the min value x in nums, if there are multiple
            occurences, select the one that appears first
            - replace the selected min value x w/ x * multiplier
        - Return: int array denoting final state of nums after
        performing all k operations

        I can't sort this, because the order of the #s needs to
        stay intact
        */
    }
}
