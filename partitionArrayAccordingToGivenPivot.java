class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // Stores the rearranged array
        int[] newNums = new int[nums.length];

        // Determines how many #s are in each section,
        // so then later their indexes start off
        // in the right position
        int greaterThan = 0;
        int lessThan = 0;
        int equal = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > pivot){
                greaterThan++;
            }
            else if(nums[i] < pivot){
                lessThan++;
            }
            else{
                equal++;
            }
        }

        // Since the elems > pivot need to be maintained,
        // instead of placing them backwards, 
        // they need to be placed from the first position
        // they can be placed in, which the previous
        // function counted how many spaced they need
        int j = nums.length - greaterThan;
        // Elems that are = to the pivot,
        // will be placed after the elems that are < pivot
        int mid = lessThan;
        // Index for < pivot elems
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > pivot){
                newNums[j] = nums[i];
                j++;
            }
            else if(nums[i] < pivot){
                newNums[k] = nums[i];
                k++;
            }
            else if(nums[i] == pivot){
                newNums[mid] = nums[i];
                mid++;
            }
        }

        return newNums;

        /*
        - Given int array nums & int pivot
        - Goal: Rearrange nums so they follow these conditions:
            - Every elem < pivot appears before every elem > pivot
            - Every elem = to pivot appears in between the elements
            < or > than pivot
            - Relative order of elems < pivot and > pivot is maintained

        Example: [9, 12, 5, 10, 14, 3, 10]
        greaterThan = 2
        lessThan = 3
        equal = 2

        nums.length = 7
        */
    }
}
