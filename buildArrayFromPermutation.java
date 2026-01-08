class Solution {
    public int[] buildArray(int[] nums) {
        int[] newNums = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            newNums[i] = nums[nums[i]];
        }

        return newNums;

        /*
             0  1  2  3  4  5
            [0, 2, 1, 5, 3, 4]

            [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]],
            nums[nums[4]], nums[nums[5]]]

            [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]

            [0, 1, 2, 4, 5, 3]
        */
    }
}
