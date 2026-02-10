class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        // How many valid elems are currently in target
        int size = 0;

        for(int i = 0; i < index.length; i++){
            // Shifts everything right from the end down to index[i]
            for(int j = size; j > index[i]; j--){
                target[j] = target[j - 1];
            }

            // Inserts
            target[index[i]] = nums[i];
            size++;
        }

        return target;
        
        /*
        - Given: 2 int arrays nums & index
        - Goal: Create target array
            - Initially target array is empty
            - From left to right read nums[i] & index[i], insert
            at index[i] the value nums[i] in target array
            - Repeat the previous step until there aren't any
            elems read in nums & index
        - Return: target array

        Okay maybe I can look through the index array backwards,
        since the last # at the last index matters
        Maybe I can count frequency of how many times the same
        index appears so I can make sure the other values are
        placed in the right positions
        */
    }
}
