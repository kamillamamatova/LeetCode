class Solution {
    public boolean isSubsequence(String s, String t) {
        // i is index for t
        // j is the index for s
        int i = 0;
        int j = 0;

        // Made it into a char array to compare each char
        char[] charT = t.toCharArray();
        char[] charS = s.toCharArray();

        // Edge case
        if(s.length() == 0){
            return true;
        }

        while(i < t.length()){
            // If the chars are the same (doesn't matter which position
            // just has to be in order) then increment j to look at the
            // next character in s
            if(charT[i] == charS[j]){
                j++;
            }

            // Ends and returns true if it has went through the charS,
            // meaning that s is a subsequent of t
            if(j == s.length()){
                return true;
            }  
             
            i++;
        }

        return false;
        /*
        - Given: 2 strings s & t
        - Return: true if s is a subsequence of t,
        false otherwise
        - Subsequence is a new string from the og string by deleting some
        of the characters without disturbing relative pos of the remaining
        characters

        What if I look through the t string, make into a char array, and
        make s into a char array too, then check the chars in s in order,
        and remove them from the char array if it's found
        So for example, in ex. 1, look through ahbgdc, which will be
        ["a", "h", "b", "g", "d", "c"], so it wouldn't be a nested loop,
        because j will never need to get incremented, instead I want to
        remove index 0 from string s only if it appears in string t,
        so it will only ever check index 0 of string s,
        or I could incremenent j only when index whatever is in string t

        Okay nevermind, I'm going with incrementing j, because array
        lengths are fixed, so deleting from it will make it more complicated
        */
    }
}
