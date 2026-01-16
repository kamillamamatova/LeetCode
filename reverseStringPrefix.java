class Solution {
    public String reversePrefix(String s, int k) {
        // Make the s string into chars to loop through
        char[] sChar = s.toCharArray();

        // Where the reverse prefix chars will be placed
        char[] newChar = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            if(k != 0){
                // Places it in reverse
                newChar[k - 1] = sChar[i];
                // Stops when all the letters are placed
                k--;
            }
            else{
                // Remaining letters that aren't part of the 
                // k prefix
                newChar[i] = sChar[i];
            }
        }

        // char array into a string
        String newS = new String(newChar);
        return newS;

        /*
        - Given: string s & int k
        - Goal: Reverse the first k chars of s
        - Return: Resulting string
        */
    }
}
