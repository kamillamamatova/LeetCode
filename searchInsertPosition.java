class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(target > nums[mid]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        // If target isn't in nums
        // Left is the index where it would be inserted
        return left;

        /*
        - Given: sorted array of distinct ints & target value
        - Return: index of the target if it's found, if it's not, then
        return where it would be inserted
        - Must be O(logn)

        Binary search
        */
    }
}
