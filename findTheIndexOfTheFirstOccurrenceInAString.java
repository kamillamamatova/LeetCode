class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case
        if(haystack.length() < needle.length()){
            return -1;
        }

        // Example:
        // haystack.length() = 8
        // needle.length() = 5
        // 8 - 5 = 3
        // leet
        // 0123
        for(int i = 0; i <= haystack.length() - needle.length() - 1; i++){
            if(haystack.substring(i, i + needle.length()).equals(needle)){
                return i;
            }
        }

        return -1;
        /* 
        - Given: 2 strings needle and haystack
        - Return: infex of the first occurrence of needle in haystack
        or -1 if needle isn't part of haystack

        toCharArray?

        Or, just check the length of needle in haystack and see if it's
        the same as haystack
        .equals?

        Wait no, it can appear anywhere in haystack, not just the beginning

        Actually, I'm going to try and use the substring method
        */
    }
}
