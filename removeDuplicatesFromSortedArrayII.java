class Solution {
    public int removeDuplicates(int[] nums) {
        // Keeps count of the frequency
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        // Since an array length is static,
        // will only incremenet when there is a # that doesn't
        // show up more than twice
        // Then return k, which will show the new nums array up
        // to k
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            // If HashMap already has nums[i] in it
            if(numsMap.containsKey(nums[i])){
                // Increments the frequency
                numsMap.put(nums[i], numsMap.get(nums[i]) + 1);
            }
            else{
                // Sets the frequency
                numsMap.put(nums[i], 1);
            }

            // If nums[i]'s frequency isn't more than 2
            if(numsMap.get(nums[i]) <= 2){
                // Sorts the array without making a new one
                nums[k] = nums[i];
                // If there's a valid #
                k++;
            }
        }

        return k;

        /*
        - Given: int array nums (increasing order)
        - Goal: Remove some duplicates in place such
        that each unique element appears at most twice
            - Relative order of the elems should be
            kept the same
        - Result needs to be placed in the first part
        of the array nums
        - Return: k after placing the final result in the
        first k slots of nums

        HashMap to count the frequency
        */
    }
}
