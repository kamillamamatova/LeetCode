class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Splits when it sees a space
        String[] sWords = s.split(" ");

        // Edge case
        if(sWords.length != pattern.length()){
            return false;
        }

        // Instead of it being a String/Character and Integer
        // Since a one to one of character to string and 
        // string to character
        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            String wordString = sWords[i];
            char patternChar = pattern.charAt(i);

            // If the pattern character has been seen before,
            // then it must map to the same word
            if(patternMap.containsKey(patternChar) && !patternMap.get(patternChar).equals(wordString)){
                return false;
            }

            // If the word has been seen before,
            // then it must map to the same pattern character
            if(sMap.containsKey(wordString) && sMap.get(wordString) != patternChar){
                return false;
            }

            // Since it's one to one
            // Mapping gets recorded both ways
            patternMap.put(patternChar, wordString);
            sMap.put(wordString, patternChar);
        }

        return true;
        /*
        - Given: pattern & string s
        - Goal: Find if s follows the same patter that was given
        - Each letter in pattern maps to exactly one unique word in s
            - Vice versa with s to pattern
            - One to one
        - No 2 letters map to the same word
            - Vice versa, no 2 words mat to the same letter

        So basically like the previous problem, but looking at the first
        letter of a word

        2 HashMaps
        Need to only look at the first letter
        So maybe I'll split the string s into substrings using .split()
        */
    }
}
