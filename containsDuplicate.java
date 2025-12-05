class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Store all the values
        // Used for comparison
        HashSet<Integer> vals = new HashSet<>();

        for(int num : nums){
            // If it's already in the HashSet,
            // then the value appears at least twice
            if(vals.contains(num)){
                return true;
            } 

            // Adds to the hashset after it checks,
            // because if it's before then there will
            // obviously be duplicates
            // So it needs to check before the num is added
            vals.add(num);
        }

        return false;
    }
}
