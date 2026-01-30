class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            // Looks at other #s besides i, and increments
            // the count if it finds ones smaller
            for(int j = 0; j < nums.length; j++){
                if(j != i && nums[j] < nums[i]){
                    count++;
                }
            }
            answer[i] = count;
        }

        return answer;

        /*
        - Given: array nums
        - Goal: for each nums[i], find out how many #s in 
        the array are smaller than it
        - Return: answer in an array
        */
    }
}
