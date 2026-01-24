class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        // Keeps track of the sums, and increases
        // them in each iteration in the for loop
        int leftSumSum = 0;
        int rightSumSum = 0;

        // To fill the rightSum backwards
        int j = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            leftSum[i] = leftSumSum;
            leftSumSum += nums[i];

            rightSum[j] = rightSumSum;
            rightSumSum += nums[j];
            j--;
        }

        // Fills the answer array, since rightSum array
        // was filled backward, the calculation couldn't
        // have been done in the same for loop
        for(int i = 0; i < nums.length; i++){
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;

        /*
        - Given: int array nums of size n
        - Goal: Define 2 arrays leftSum & rightSum
            - leftSum[i] is the sum of elems on the left
            side of the index i in the array nums
                - else, leftSum[i] = 0
            - rightSum[i] is the sum of elems on the right
            side of the index i in the array nums
                - else, rightSum[i] = 0
        - Return an int array answer of size n where
        answer[i] = |leftSum[i] - rightSum[i]|
        */
    }
}
