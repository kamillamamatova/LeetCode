class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(numsMap.containsKey(nums[i])){
                if(Math.abs(i - numsMap.get(nums[i])) <= k){
                    return true;
                }
            }

            // Instead of filling out before this loop
            // Fills up as the loop goes, to update to the most recent index,
            // since there can be more than 2 of the same key
            numsMap.put(nums[i], i);
        }

        return false;

        /*
        - Given: int array nums, int k
        - Return: true if 2 distinct indices i & j that nums[i] == nums[j]
        and abs(i - j) is less than or equal to k

        So the easy route would be a nested loop, but that wouldn't be
        effecient, a hashmap would be better
        */
    }
}
