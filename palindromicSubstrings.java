class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            // Odd length palindrome
            count += expands(s, i, i);

            // Even length palindrome
            count += expands(s, i, i + 1);
        }

        return count;
        
    }

    private int expands(String s, int left, int right){
        int result = 0;

        // Doesn't go out of bounds and the characters on the left and right are the same
        while(left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)){
            // Found a palindrome
            result ++;
        
            left--;
            right++;
        }

        return result;
    }
}
