class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        // To help find duplicates
        HashSet<Integer> numsSet = new HashSet<>();

        // Size is 2 since there are 2 mischievous #s
        int[] duplicates = new int[2];

        // Index for the duplicates array
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(numsSet.contains(nums[i])){
                duplicates[j] = nums[i];
                j++;
            }
            numsSet.add(nums[i]);
        }

        return duplicates;
        /*
        - Given: int array nums contains ints from 0 to n - 1
            - Each # was supposed to appear exactly once in the list
        - Goal: Find a duplicate(s)
        */
    }
}
