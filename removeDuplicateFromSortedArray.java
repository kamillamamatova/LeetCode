class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        int i = 0;

        HashSet<Integer> uniqueNums = new HashSet<>(nums.length);

        while(i < k){
            if(uniqueNums.contains(nums[i])){
                for(int j = i; j < k - 1; j++){
                    nums[j] = nums[j + 1];
                }
                k--;
            }
            else{
                i++;
            }
            uniqueNums.add(nums[i-1]);
        }

        return k;
    /*
    - Given: int array nums (sorted)
    - Goal: remove the duplicate
    What if i make a hashset and i'll look through the int array nums
    and only add values that haven't been added yet,
    So if a value is already in the hashset, then i won't add it
    - Number of unique elements needs to be k
    - Return: k

    Maybe making a hashset would actually make it less effecient?
    So maybe i can do the same thing i did for the previous solution
    where i removed certain vals
    So using a while and a for loop

    I feel like i should make a hashset though because i need to store 
    the unique values,
    but the output is similar to the other problem
    I'll try with a while loop first and then worst case i'll create
    a hashset,
    or maybe both a while loop and a hashset, doesn't need to be separate
    What if instead i added everything in nums to a hashset and then
    traversed through it and removed duplicates
    Is it possible to transition an int array into a hashset?

    Oh wait, I'll just create a hashset and add all the numbers into it and
    then compare the values in nums to the hashset to see if the hashset
    already contains the same value in it, and if it does, then i'll shift
    all the values to the left since 
    */
    }
}
