class Solution {
    public int scoreOfString(String s) {
        int absDiff = 0;
        int sum = 0;

        char[] sChar = s.toCharArray();

        for(int i = 1; i < s.length(); i++){
            // previous ascii - current asci
            absDiff = Math.abs((int)sChar[i - 1] - (int)sChar[i]);
            sum += absDiff;
        }

        return sum;
       /*
       - Given: string s
       - Score: sum of the abs diff between the ascii values of adj chars
       */ 
    }
}
