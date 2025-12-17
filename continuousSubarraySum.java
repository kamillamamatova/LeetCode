class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Will hold remainder and the index
        Map<Integer, Integer> remainder = new HashMap<>();
        // Initializing the hashmap to take care of a case
        // if the number at index 0 is divisible by k
        remainder.put(0, -1);

        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            // Remainder
            int r = sum % k;

            if(remainder.containsKey(r)){
                // Position of the first remainder like r
                int j = remainder.get(r);
                
                // Subarray length must be 2 or more
                if((i - j) >= 2){
                    return true;
                }
            }
            else{
                remainder.put(r, i);
            }
        }

        return false;
    }
}
