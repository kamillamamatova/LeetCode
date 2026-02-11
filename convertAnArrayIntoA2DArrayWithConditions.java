class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> matrix = new ArrayList<>();

        // So the size of the array is dynamic, and I
        // can freely change it
        ArrayList<Integer> numsList = new ArrayList<>();
        for(int num : nums){
            numsList.add(num);
        }

        // Checks if all numbers have been added to the
        // 2D array
        int counter = 0;

        while(counter < nums.length){
            // Keeps track so duplicates aren't placed
            // in the same row, but gets reset for each
            // row
            HashSet<Integer> set = new HashSet<>();

            List<Integer> innerList = new ArrayList<>();
            for(int i = 0; i < numsList.size(); i++){
                int val = numsList.get(i);

                if(!set.contains(val)){
                    innerList.add(val);
                    numsList.remove(i);
                    counter++;
                    // Since an elem has been removed, 
                    // the index that gets checked next
                    // needs to stay the same
                    i--;
                }

                set.add(val);
            }

            matrix.add(innerList);
        }

        return matrix;

        /*
        - Given: int array nums
        - Goal: Create a 2D array from nums
            - Will only contains the elems from nums
            - Each row in the 2D array contains distinct
            ints
            - # of rows in the 2D array should be minimal
        - Return: Resulting array

        What if I sort nums first
        [1, 1, 1, 2, 3, 3, 4]
        Then add 1 to the hashset
        1 at index 1 & 1 at index 2 are skipped (i++) since
        the hashset contains them
        Hashset will reset every iteration in outer loop
        I'll create a counter which will be a globar var
        Once the counter reaches nums.length (an outer while
        loop) then all the #s in nums have been added to the
        new 2D array 
        Then in the inner loop it'll look at 2 and add it to
        the inner array list since it's not in the hashset yet
        Then it gets added to the hashset
        i++
        3 gets added to the list and then the hashset
        3 at index 5 is skipped since 3 is already in the
        Matter of fact, I'm going to create a new nums array
        which will store the numbers that have been skipped, but
        it'll need to have a dynamic size, and it will need to
        reset in the outer loop
        Or I can replace every number that has been added to the
        inner array list with -1, nevermind because it doesn't say
        it's only positive ints
        Okay maybe instead I'll just create an array list and place
        all nums into it so it can be dynamic
        and I'll just use remove() anytime I add a # into the inner
        array list
        */
    }
}
