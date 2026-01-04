class Solution {
    public List<String> summaryRanges(int[] nums) {
        // Because of "->""
        ArrayList<String> result = new ArrayList<>();

        // Edge case, if empty
        if(nums.length <= 0){
            return result;
        }

        // Edge case, if there's only 1 #
        if(nums.length == 1){
            result.add(Integer.toString(nums[0]));
            return result;
        }

        // Initialized
        int start = nums[0];
        int end = nums[0];

        // To avoid going outside of index bounds
        // i in the loop starts at 1 and compares to the previous index
        // Edge cases above make sure that if there's an empty array or 
        // an array with 1 #, it returns something before this loop
        for(int i = 1; i < nums.length; i++){
            // Since the array is sorted,
            // just checks if the previous number is equal to it + 1
            if(nums[i] != (nums[i - 1] + 1)){
                // End of an interval
                end = nums[i - 1];
        
                if(end == start){
                    result.add(String.valueOf(start));
                }
                else{
                    result.add(start + "->" + end);
                }

                // Start of the next interval
                start = nums[i];
            }

            // Without this, it wouldn't add the last interval to the list
            if(i == (nums.length - 1)){
                end = nums[i];

                if(start == end){
                    result.add(String.valueOf(start));
                }
                else{
                    result.add(start + "->" + end);
                }
            }
        }

        return result;

        /* 
        - Given: sorted unique int array nums
        [0, 1, 2, 4, 5, 7]
        [[0, 2], [4, 5], [7, 7]]
        to String
        ["0->2", "4->5", "7"]

        startInt = 0
        endInt = 0

        if 2 != 0 + 1

        endInt = 0

        if 0 = 0
        ["0"]

        startInt = 2

        if 3 != 2 + 1

        if 4 != 3 + 1

        if 6 != 4 + 1

        endInt = 4
        
        if 3 == 2
        ["0", "2->4"]

        startInt = 6

        if 8 != 6 + 1

        endInt = 6

        if(6 == 6)
        ["0", "2->4", "6"]

        startInt = 8

        if 9 != 8 + 1
        */
    }
}
