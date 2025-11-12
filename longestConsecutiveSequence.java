class Solution {
    public int longestConsecutive(int[] nums) {
        // Base case
        if(nums.length == 0){
            return 0;
        }

        int longest = 1;
        int current = 1;

        List<Integer> sortedList = new ArrayList<>();
        for(int num : nums){
            sortedList.add(num);
        }

        // Sorts the list
        Collections.sort(sortedList);

        for(int i = 1; i < sortedList.size(); i++){
            // Inititalizes the current and previous elem in the array
            int prev = sortedList.get(i - 1);
            int cur = sortedList.get(i);

            // If the current number is 1 more than the previous number
            // which means it continues the sequence
            if(cur == prev + 1){
                current++;
            }
            // If it's a duplicate
            else if(cur == prev){
                continue;
            }
            // The streak is broken, so current count is being reset
            else{
                longest = Math.max(longest, current);
                current = 1;
            }
        }

        return Math.max(longest, current);
    }
}
