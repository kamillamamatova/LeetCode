class Solution {
    public boolean isPalindrome(String s) {
        // "a man, a plan, a canal: panoma"
        s = s.toLowerCase();
        
        // amanaplanacanalpanoma
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        
        StringBuilder reverseS = new StringBuilder(s);
        reverseS.reverse();

        if(s.equals(reverseS.toString())){
            return true;
        }

        return false;

        /*
        - Palindrome: Reads the same forward and backward

        Everything needs to be turned into lowercase, and non-alphanumeric
        characters need to be removed (spaces, commas, etc.) 

        So instead of a nested loop, increment/decrement i and j inside of
        a while loop

        There's a method in java that can replace whatever with whatever, 
        so I will be using that

        There's probably a reverse method, so I'm going to utilize that
        instead of a nested loop or a while loop
        */
    }
}
