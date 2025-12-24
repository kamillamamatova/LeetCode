class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int i = 0;

        while(i < k){
            if(nums[i] == val){
                for(int j = i; j < k - 1; j++){
                    nums[j] = nums[j + 1];
                }
                k--;
            }
            // Only incrementing i here because if the i position held a
            // # like val, then everything shifts to the left so the same
            // index needs to be checked again, and only once it's checked
            // and cleared, can i be incremented to check the next index
            else{
                i++;
            }
        }

        // Key thing because this is what's "removing" elements in the array
        // it only returns the first k indexes in the array, ignoring the rest
        return k;
    }
}
