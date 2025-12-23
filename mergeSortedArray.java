class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Needs to be optimized, but works

        int j = 0;
        // Adds the numbers in nums2 to the end of nums1
        for(int i = m; i < n + m && j < n; i++){
            nums1[i] = nums2[j];
            j++;
        }

        // Sorts the unsorted array of nums1 in the first part of the indexes
        // and nums2 in the second part of the indexes
        for(int i = 0; i < n + m; i++){
            for(int k = i + 1; k < n + m; k++){
                if(nums1[i] > nums1[k]){
                    int tmp = nums1[i];
                    nums1[i] = nums1[k];
                    nums1[k] = tmp;
                }
            }
        }
    }
}
