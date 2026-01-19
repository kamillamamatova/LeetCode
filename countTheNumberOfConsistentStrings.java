class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // I made it = to words.length, because I didn't know how I
        // would increment the count in the for loop when the hashset
        // contains a letter in a word in words, because it needs to
        // check every letter in the word, and it can't increment
        // without checking everything, but then if it checks
        // everything and there was a mismatch, then it would increment
        // it, so instead, it decrements, when a hashset doesn't
        // contain a letter, then it decreases the counter, which is
        // the length of the words array
        int counter = words.length;

        // Using a hashset to check if allowed contains a letter
        // in a word in words
        HashSet<Character> charSet = new HashSet<>();
        char[] allowedChar = allowed.toCharArray();
        for(char a : allowedChar){
            charSet.add(a);
        }

        // Looks through each word in words
        for(String word : words){
            char[] wordChar = word.toCharArray();
            // Looks through the chars in each word in words
            for(char c : wordChar){
                if(!charSet.contains(c)){
                    counter--;
                    // Moves on to the next word, so counter doesn't
                    // get decremented more than once for one word
                    break;
                }
            }
        }

        return counter;

        /*
        - Given: string allowed (of distinct chars) & array of strings words
        - A string is consistent if all chars in the string appear in the
        string allowed
        - Return: # of consistent strings in the array words
        */
    }
}
