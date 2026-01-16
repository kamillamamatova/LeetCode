class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            // Even
            if(i % 2 == 0){
                sum += nums[i];
            }
            // Odd
            else{
                sum -= nums[i];
            }
        }

        return sum;
        /*
        - Given: int array nums
        - Alternating sum is adding elems at even 
        indices and subtracting elems at odd indices
        - Return: alternating sum of nums

        so for loop and 2 if statements inside of it
        like if (i % 2 == 0){ sum += nums[i]}
        and
        else{ sum -= nums[i]}
        */
    }
}
