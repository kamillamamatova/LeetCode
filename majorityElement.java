class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        int maxFreq = 0;
        int elem = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i], freq.get(nums[i]) + 1);
            }
            else{
                freq.put(nums[i], 1);
            }

            if(freq.get(nums[i]) > maxFreq){
                maxFreq = freq.get(nums[i]);
                elem = nums[i];
            }
        }

        return elem;

        /*int max = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        int[] freq = new int[max + 1];

        int maxFreq = 0;
        int elem = 0;
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
            if(freq[nums[i]] > maxFreq){
                maxFreq = freq[nums[i]];
                elem = freq[nums[i]];
            }

        }
        return elem;

        /*HashSet<Integer> freqSet = new HashSet<>();
        int max = 0;
        int freq[] = new int[nums.length];
        int elem = 0;

        for(int i = 0; i < nums.length; i++){
            freqSet.add(nums[i]);
            if(freqSet.contains(nums[i])){
                freq[i]++;
                if(freq[i] > max){
                    max = freq[i];
                    elem = nums[i];
                    //freq = 0;
                }
            }
        }

        return elem; */

        /*int elem;
        int[] freq = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            freq[i]++;
        }

        return elem;
        /*
        - given: array nums of size n
        - return: majority elem
            - majority elem is the elem that appears more than n/2 times
            - can assume that majority elem always exists in the given array
        
        hashmap for val and freq?
        or a freq array?

        Went with a hashset instead to store the vals,
        and then use it to count the max freq

        Run into an issue, I can't make a freq array because
        there is an infinite number of numbers,
        unlike an alphabet, where there are 26 letters,
        so there are 26 freq positions
        So maybe I can find the max number in the array first O(n),
        and then make the freq table have the max number in the array
        be the size of the max number so I can place the freqs in the
        right values spots, and I won't need a hashset, but the solution
        would be O(n + n)

        Going to try a hashmap instead because I keep on running into
        indexing issues, and even though I'm passing the first 2 test
        cases, i'm not passing all 53 test cases
        */
    }
}
