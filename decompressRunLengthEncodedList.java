class Solution {
    public int[] decompressRLElist(int[] nums) {
        // Since int array size is static
        ArrayList<Integer> numsList = new ArrayList<>();

        // 2nd # in the pairs
        int j = 1;
        for(int i = 0; i < nums.length; i++){
            int freq = nums[i];
            int val = nums[j];

            // Adds the values in their frequency
            for(int k = 0; k < freq; k++){
                numsList.add(val);
            }

            j += 2;
            i++;
        }

        // Turns the int array list into an int array 
        // since the return type is int array
        int[] newNums = new int[numsList.size()];
        for(int i = 0; i < numsList.size(); i++){
            newNums[i] = numsList.get(i);
        }
        
        return newNums;

        /*
        - Given: int array nums
        - [freq, val] = [nums[2 * i], nums[2 * i + 1]]
        (i >= 0)
        - Goal: Concatenate all the sublits from left
        to right to generate the decompressed list
        */
    }
}
