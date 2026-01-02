class Solution {
    public boolean isHappy(int n) {
        int sum = 0;

        HashSet<Integer> prevSum = new HashSet<>();

        while(sum != 1){
            // Resets sum for next iteration
            sum = 0;

            while(n > 0){
                // Avoiding the whole process of making int n into an array
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            // Resets n for next iteration
            n = sum;

            // If this sum has already been calculated and added to the HashSet
            if(prevSum.contains(sum)){
                return false;
            }

            prevSum.add(sum);
        }   

        return true;

        /*
        - Happy #:
            - Repeat until sum = 1
            - Split into separate ints and add the powers of each int together
                - then repeat
            - If a sum gets repeated, then it's a never ending cycle, return
            false

        n = 2
        2^2 = 4
        4^2 = 8
        8^2 = 64
        64^2 = 

        Cycle ends when there was already a sum like the one calculated

        Encountered a problem, adding the sum to the hashset at the end of 
        the loop and then check if it's in the hashset, which is obviously
        true, so the function returns false if the first sum != 1

        Made the first while loop's condition while sum != 1, because if it
        does, then it ends loop and runs return true, but if it doesn't,
        loop until sum is repeated, which will return false
        */
    }
}
