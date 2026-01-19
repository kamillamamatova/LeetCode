class Solution {
    public int reverseDegree(String s) {
        int reverseDegree = 0;

        char[] sChar = s.toCharArray();

        // Index position to multiply by
        int i = 0;
        for(char c : sChar){
            i++;
            reverseDegree += (26 - (c - 'a')) * i;
            System.out.println(reverseDegree);
        }

        return reverseDegree;

        /*
        - Given: string s
        - Goal: Calculate its reverse degree
        - 'a' = 26, 'b' = 25, ..., 'z' = 1
        - Multiply its pos. in the reverse alphabet by 
        its index pos.

        Not sure how to find the reversed alphabet
        Something like 26 - (alph[i] - 'a')
        */
    }
}
