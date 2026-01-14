class Solution {
    public int[] transformArray(int[] nums) {
        int[] modifiedNums = new int[nums.length];

        // For it to be more effecient,
        // if a number is odd, then it'll be added
        // to the back of the new array,
        // and if it's even, it gets added to the
        // front of the new array so it can placed
        // in the right order without having to sort
        // it later
        int j = nums.length - 1;
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                modifiedNums[k] = 0;
                k++;
            }
            else{
                modifiedNums[j] = 1;
                j--;
            }
        }

        return modifiedNums;

        /*
        - Given: int array nums
        - Goal: Transform nums w/ the following operations
            1. Replace even numbers with 0
            2. Replace odd numbers with 1
            3. Sort the new array
        - Return: The new array
        */
    }
}
