class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int total = 0;

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] % (nums2[j] * k) == 0){
                    total++;
                }
            }
        }

        return total;

        /*
        - Given: 2 int arrays nums1 & nums2 of lengths n & m &
        positive int k
        - (i, j) is called good if nums1[i] is divisible by
        nums[2] * k (0 <= i <= n - 1, 0 <= j <= m - 1)
        - Return: Total # of good pairs
        */ 
    }
}
