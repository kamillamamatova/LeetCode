class Solution {
    public String decodeMessage(String key, String message) {
        // Gets rid of the spaces in key
        String keyNoSpaces = key.replaceAll("\\s", "");

        // Char array for the original key w/out spaces
        // May contain duplicates
        char[] keyCharDuplicates = keyNoSpaces.toCharArray();
        // HashSet to keep track of duplicates
        HashSet<Character> keySet = new HashSet<>();
        // New key char array without duplicates
        char[] keyChar = new char[26];
        // Index for the key char array w/out duplicates
        int j = 0;
        // Looks through keyCharDuplicates array and only
        // adds unique letters to the new key char array
        for(int i = 0; i < keyCharDuplicates.length; i++){
            // If it the HashSet doesn't have the letter at
            // index i
            if(!keySet.contains(keyCharDuplicates[i])){
                keyChar[j] = keyCharDuplicates[i];
                j++;
            }

            keySet.add(keyCharDuplicates[i]);
        }

        // Char array of the alphabet, to know the indexes of each letter
        // Probably could've just used - 'a', but whatever
        char[] alphabetChar = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        // The message decoded
        char[] output = new char[message.length()];
        char[] messageChar = message.toCharArray();
        for(int i = 0; i < message.length(); i++){
            // If the char at index i is a space, adds that to the output
            if(messageChar[i] == ' '){
                output[i] = ' ';
            }
            else{
                // Finds index in keyChar of the letter that's at index i in
                // messageChar
                int index = String.valueOf(keyChar).indexOf(messageChar[i]);
                // The index i in output is now the letter that is at the index
                // found above in the alphabet char array
                output[i] = alphabetChar[index];
            }
        }

        // Returns the string version of the output char array
        return String.valueOf(output);
        
        /*
        - Given: strings key & message
            - Represents a cipher key & a secret message
        - Steps to decode:
            1. Use the 1st appearance of all 26 letters in key
            as the order of the substitution table
            2. Align the substitution table with the regular
            alphabet
            3. Each letter in message is then substituted
            using the table
            4. Spaces are transformed to themselves
        - Return: decoded message

        Based off the index of the char, ignoring spaces

        If it's a duplicate, only the first one counts

        This code is so messy
        */
    }
}
