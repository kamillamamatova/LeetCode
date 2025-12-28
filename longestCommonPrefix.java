class Solution {
    public String longestCommonPrefix(String[] strs) {
        // If the string is empty,
        // then automatically returns an empty string
        if(strs == null || strs.length == 0){
            return "";
        }

        StringBuilder prefix = new StringBuilder();

        int j = 0;

        while(true){
            // If the next index is the length of the first word or longer
            if(j >= strs[0].length()){
                break;
            }

            char curChar = strs[0].charAt(j);

            // Checking for mismatch, not match
            for(int i = 1; i < strs.length; i++){
                // If it's too short or the characters are different
                if(j >= strs[i].length() || strs[i].charAt(j) != curChar){
                    return prefix.toString();
                }
            }

            // If everything matched at position j
            prefix.append(curChar);
            j++;
        }

        return prefix.toString();
        
       /*
       - Goal: Find the longest common prefix string amongst an array
       of string
       - If there isn't one, return: empty string
       */ 
    }
}
