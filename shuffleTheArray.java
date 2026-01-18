class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newNums = new int[nums.length];

        int k = 0;
        int j = n;

        for(int i = 0; i < nums.length; i++){
            if((i % 2) == 0){
                newNums[i] = nums[k];
                k++;
            }
            else{
                newNums[i] = nums[j];
                j++;
            }
        }

        return newNums;

        /*
            Given: array nums consisting of 2n elems
                - In the form [x1, x2, ..., xn, y1, y2, ..., yn]
            - Return: array in the form [x1, y1, x2, y2, ..., xn, yn]

             0  1  2  3  4  5
            [2, 5, 1, 3, 4, 7]

             0  3  1  4  2  5
            [2, 3, 5, 4, 1, 7]

            if i % 2 != 0{
                newNums[i] == nums[j];
                j++;
            }
            else{
                newNums[i] = nums[k];
                k++;
            }
        */
    }
}
