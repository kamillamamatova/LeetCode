class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int pairs = 0;

        for(int i = 0; i < nums.size(); i++){
            // j either = i or is > i
            for(int j = i; j < nums.size(); j++){
                // 0 <= i and j < n conditions are already checked
                // in the first and second loop statements
                if(((nums.get(i) + nums.get(j)) < target) && i < j){
                    pairs++;
                }
            }
        }

        return pairs;

        /*
        - Given: int array nums of length n & int target
        - Return: # of pairs (i, j) whe 0 <= i < j < n &
        nums[i] + nums[j] < target

        So a nested loop
        */
    }
}
