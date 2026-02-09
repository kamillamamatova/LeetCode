class Solution {
    public void rotate(int[] nums, int k) {
        // Gonna place the new array arrangement here
        int[] newNums = new int[nums.length];

        // Base case
        if(nums.length == 1){
            return;
        }

        // My code previously didn't work w/ k > nums.length
        // so I added this to make sure that k is less than
        // nums.length and keeps the answer the same
        if(k > nums.length){
            k = k % nums.length;
        }

        int j = nums.length - k;
        int l = 0;
        for(int i = 0; i < nums.length; i++){
            // First places the # in nums.length - k
            // and following positions into the beginning
            // of the new array
            if(j < nums.length){
                newNums[i] = nums[j];
                j++;
            }
            // Once the end has reached
            // places the #s at the beginning after the first
            // new k #s that have already been placed
            else{
                newNums[i] = nums[l];
                l++;
            }
        }

        // Since return type is void, nums needs to be changed
        for(int i = 0; i < nums.length; i++){
            nums[i] = newNums[i];
        }
        
        return;

        /*
        - Given: int array nums
        - Goal: Rotate the array to the right by k
        steps

         0  1  2  3  4  5  6
        [1, 2, 3, 4, 5, 6, 7]

        length = 7
        7 - 3 = 4

        If k > nums.length, then my code doesn't work
        so I need to figure out if I can change k so
        it works for problems that have length less than
        k

        k = 7
        nums.length = 2

        1: [2, 1]
        2: [1, 2]
        3: [2, 1]
        4: [1, 2]
        5: [2, 1]
        6: [1, 2]
        7: [2, 1]

        What if nums.length = 3
        k = 5
        [2, 1, 4]
        1: [4, 2, 1]
        2: [1, 4, 2]
        3: [2, 1, 4]
        4: [4, 2, 1]
        5: [1, 4, 2]
        */
    }
}
