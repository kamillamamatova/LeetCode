class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Combines the seperate strings and makes them into one string
        String word1String = String.join("", word1);
        String word2String = String.join("", word2);

        // If they're the same string
        if(word1String.equals(word2String)){
            return true;
        }

        return false;

        /*
        - Given: 2 string arrays word1 & word2
        - Return: true if 2 arrays represent the same string & false
        otherwise
        */
    }
}
