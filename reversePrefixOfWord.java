class Solution {
    public String reversePrefix(String word, char ch) {
        char[] result = new char[word.length()];
        
        // To make sure it doesn't reverse for the wrong
        // letter if there are multiple letters like ch
        // in word
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < word.length(); i++){
            // Once it finds the first letter like ch in
            // word
            if(word.charAt(i) == ch && !set.contains(ch)){
                // Adds the letter so it doesn't repeat
                // the reversal
                set.add(ch);

                // Since it's a reversal, 2 vars going in
                // opposite directions, one incrementing,
                // the other decrementing
                int k = 0;
                for(int j = i; j >= 0; j--){
                    result[k] = word.charAt(j);
                    k++;
                }
            }
            else{
                result[i] = word.charAt(i);
            }
        }

        // Since result is a char array, turns it into a
        // string
        return String.valueOf(result);

        /*
        - Given: string word & character ch
        - Goal: Reverse the segment of word that starts
        at index 0 and ends at the index of the first
        occurence of ch
            - If the character ch doesn't exist, do
            nothing
        Return: Resulting string
        */
    }
}
