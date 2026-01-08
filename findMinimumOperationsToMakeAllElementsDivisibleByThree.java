class Solution {
    public int minimumOperations(int[] nums) {
        int numOperations = 0;

        for(int i = 0; i < nums.length; i++){
            // Skips #s that are divisible by 3
            if(nums[i] % 3 != 0){
                numOperations++;
            }
        }

        return numOperations;
        /*
        - Given: int array nums
        - Can add or subtract 1 from any elem of nums
        - Return: min # of operations to make all elements of nums divisible by
        3 (% 3 == 0)

        I overcomplicated it by doing this: 
        // If it's a number that only needs 1 subtracted from it to
        // be divisible by 3
        if(nums[i] % 3 == 1){
            numOperations += nums[i] % 3;
        }
        // A # in the middle only needs 1 addition or subtraction
        // 
        else{
            umOperations += 1;
        }

        Then I realize that each operation just takes either 1 addition or
        subtraction no matter what the # is
        if it's 1, -1 so it can become 0
        if it's 2, -1 or +1 so it can become 0 or 1
        and so on...
        */
    }
}
