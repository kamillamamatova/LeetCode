class Solution {
    public int findPermutationDifference(String s, String t) {
        int permDiff = 0;

        // HashMap for the t string to place all the chars and
        // indexes of the chars into it
        HashMap<Character, Integer> tMap = new HashMap<>();
        char[] tChar = t.toCharArray();
        for(int i = 0; i < t.length(); i++){
            tMap.put(tChar[i], i);
        }

        // Loops through the s string and adds to the permDiff
        // the absolute difference between the position of the
        // char in s and the index of the same char in string t
        char[] sChar = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            permDiff += Math.abs(i - tMap.get(sChar[i]));
        }

        return permDiff;

        /*
        - Given: 2 strings s & t
            - every char occurs at most once in s
            - t is a permutation of s
        - Permutation between s & t is the sum of the abs
        between the index & the occurrence of each char in s
        & the index of the occurence on the same char in t
        - Return: permutation diff between s & t

        Instead of a nested loop, maybe a HashMap
        */
    }
}
