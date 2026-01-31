class Solution {
    public int balancedStringSplit(String s) {
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            // Counts how many Rs and Ls there are
            int RCount = 0;
            int LCount = 0;

            // While there isn't an equal amount of Ls and Rs
            // keep going through the string, until equal amount
            // of Ls and Rs are found
            while(RCount != LCount || RCount == 0 && LCount == 0){
                if(s.charAt(i) == 'R'){
                    RCount++;
                }
                else{
                    LCount++;
                }

                // So it doesn't increment i even if equal amount
                // of Ls and Rs have been found, because it will
                // increment again in the for loop, therefore, 
                // skipping a char
                if(RCount != LCount){
                    i++;
                }
            }

            // Once while loop stops, that means equal amount of
            // Rs and Ls have been found
            max++;
        }

        return max;

        /*
        - Balanced strings have equal quantity 
        of 'L' and 'R' chars
        - Given: balanced string s
        - Goal: Split it into some number of substrings
            - Each substring is balanced
        - Return: max number of balanced strings
        that can be obtained
        */
    }
}
