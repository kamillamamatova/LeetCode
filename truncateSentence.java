class Solution {
    public String truncateSentence(String s, int k) {
        // s needs to become a String array to look
        // at each word seperately
        String[] sArray = s.split(" ");

        // StringBuilder allows modification
        StringBuilder newS = new StringBuilder();
        // Appends every word into newS before the words
        // at index k
        for(int i = 0; i < k; i++){
            newS.append(sArray[i]);

            // Adds the space between words back, cut off
            // before the last word, so there isn't a
            // space after the last word
            if(i < k - 1){
                newS.append(" ");
            }
        }

        return newS.toString();

        /*
        - Given: sentence s & int k
        - Goal: Truncate s such that it contains only
        the first k words
        - Return: s

        I can just create a String array, place everything
        from s into the String array, and then
        */
    }
}
