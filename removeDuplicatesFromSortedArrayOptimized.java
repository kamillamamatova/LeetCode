class Solution {
    public int removeDuplicates(int[] nums) {
        /*
        Trying to make it more effecient,
        so i'm not going to use a hashset,
        and instead just compare it to the previous value in the array,
        since it's sorted.
        Meaning that duplicates are next to each other
        */
        int i = 0;

        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
